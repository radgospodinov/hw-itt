package com.example.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.rmi.dgc.Lease;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.descriptor.JspConfigDescriptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Level;
import com.example.model.Player;
import com.example.model.SpecialAbility;
import com.example.model.Zombi;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hazelcast.cluster.impl.operations.SetMasterOperation;

import io.undertow.attribute.RequestMethodAttribute;

@Controller
public class ZombieController {
	@Autowired
	ServletContext context;

	// INIT TEST PAGE
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String initializePage() {
		ConcurrentHashMap<Player, Boolean> tmp = new ConcurrentHashMap<>(); // user/pass
		Set<Player> users = Collections.newSetFromMap(tmp);
		users.add(new Player("Raziel", "123456", "eMail", 25, "ludnica").setHighScore(550000));
		users.add(new Player("Kain", "123456", "eMail", 25, "ludnica").setHighScore(350000));
		users.add(new Player("Dumah", "123456", "eMail", 25, "ludnica").setHighScore(150000));

		context.setAttribute("users", users);
		return "test";
	}

	// TASK2
	@RequestMapping(value = "/loginManager", method = RequestMethod.POST)
	public @ResponseBody String response(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Set<Player> users = (Set<Player>) context.getAttribute("users");

		for (Player player : users) {
			if (player.getUsername().equals(username) && player.getPassword().equals(password)) {
				return "{\"id\": " + player.getId() + "}";
			}
		}

		response.setStatus(401);
		return "{\"error\":\"Invalid username or password\"}";
	}

	// TASK3
	@RequestMapping(value = "/registerManager", method = RequestMethod.POST)
	public @ResponseBody String register(@RequestBody String json) throws IOException {
		// read json.stringify
		// String data = request.getReader().readLine();
		// use data if theres no issues with encoding, added extra "=" and stuff
		JsonObject object = (JsonObject) new JsonParser().parse(URLDecoder.decode(json, "UTF-8").replace("=", ""));
		// get json elements
		String username = object.get("username").getAsString();
		String password = object.get("password").getAsString();
		String email = object.get("email").getAsString();
		int age = object.get("age").getAsInt();
		String address = object.get("address").getAsString();
		// creater player based on collected elements
		Player player = new Player(username, password, email, age, address);
		// save player to application
		((Set<Player>) context.getAttribute("users")).add(player);
		// generate result json
		JsonObject result = new JsonObject();
		result.addProperty("id", player.getId());
		// return result as string
		return result.toString();
	}

	// TASK4

	@RequestMapping(value = "/levelManager", method = RequestMethod.GET)
	public @ResponseBody String levelManager(HttpServletRequest request, HttpServletResponse response) {

		// preparing data
		int userID = Integer.parseInt(request.getParameter("id"));
		int levelNumber = Integer.parseInt(request.getParameter("levelNo"));
		// generate level based on recieved data
		Level level = Level.levelGenerator(levelNumber);
		// preparing result as json object
		JsonObject result = new JsonObject();
		// add levelNo to result
		result.addProperty("levelNo", levelNumber);
		// preparing zombies array
		JsonArray zombies = new JsonArray();
		for (Zombi zombi : level.getZombiList()) {
			// generate each zombi
			JsonObject entry = new JsonObject();
			entry.addProperty("name", zombi.getName());
			entry.addProperty("speed", zombi.getSpeed());
			entry.addProperty("health", zombi.getHp());
			entry.addProperty("count", zombi.getCount());
			// ability array
			if (zombi.getAbilities() == null || zombi.getAbilities().size() <= 0) {
				entry.add("abilities", null);
			} else {
				JsonArray abilities = new JsonArray();
				for (SpecialAbility sAbility : zombi.getAbilities()) {
					JsonObject ability = new JsonObject();
					ability.addProperty("id", sAbility.getId());
					ability.addProperty("name", sAbility.getName());
					ability.addProperty("desc", sAbility.getDescription());
					// add json element to jsonarray
					abilities.add(ability);
				}
				entry.add("abilities", abilities);
			}

			// filling zombies array with entries
			zombies.add(entry);
		}
		// adding ready array to json object result
		result.add("zombies", zombies);

		// return result as string
		return result.toString();
	}

	// TASK5
	@RequestMapping(value = "/levelManager", method = RequestMethod.POST)
	public void saveHighScore(@RequestBody String json) throws IOException {
		// reading gaden stringify
		JsonObject object = (JsonObject) new JsonParser().parse(URLDecoder.decode(json, "UTF-8").replace("=", ""));
		// prepared data
		int userID = object.get("id").getAsInt();
		int levelNo = object.get("levelNo").getAsInt();
		int points = object.get("points").getAsInt();
		// find user by id
		Set<Player> users = (Set<Player>) context.getAttribute("users");
		for (Player player : users) {
			if (player.getId() == userID) {
				if (player.getHighScore() < points) {
					player.setHighScore(points);
					break;
				} else {
					break;
				}
			}
		}

	}

	// TASK6
	@RequestMapping(value = "/HighScoreManager", method = RequestMethod.GET)
	public @ResponseBody String scoreManager(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<Player> scoreBoard = new ArrayList<>();
		Set<Player> users = (Set<Player>) context.getAttribute("users");
		scoreBoard.addAll(users);
		scoreBoard.sort((p1, p2) -> p2.getHighScore() - p1.getHighScore());
		JsonArray rv = new JsonArray();
		int tempPosition = 1;
		JsonObject entry = null;
		for (Player player : scoreBoard) {
			entry = new JsonObject();
			entry.addProperty("position", tempPosition++);
			entry.addProperty("username", player.getUsername());
			entry.addProperty("highScore", player.getHighScore());
			rv.add(entry);
		}

		return rv.toString();
	}
}
