package com.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Zombi {

	private String name;
	private int hp;
	private int speed;
	private ArrayList<SpecialAbility> abilities;
	private int count;
	private String type;

	public Zombi() {
		abilities = new ArrayList<>();
	}

	public ArrayList<SpecialAbility> getAbilities() {
		return abilities;
	}

	public Zombi addAbility(SpecialAbility ability) {
		if (ability != null)
			abilities.add(ability);
		return this;
	}

	public Zombi addSetOfAbilities(ArrayList<SpecialAbility> abilities) {
		if (abilities != null && abilities.size() > 0)
			this.abilities.addAll(abilities);
		return this;
	}

	public String getName() {
		return name;
	}

	public Zombi setName(String name) {
		this.name = name;
		return this;
	}

	public int getHp() {
		return hp;
	}

	public Zombi setHp(int hp) {
		this.hp = hp;
		return this;
	}

	public int getSpeed() {
		return speed;
	}

	public Zombi setSpeed(int speed) {
		this.speed = speed;
		return this;
	}

	public int getCount() {
		return count;
	}

	public Zombi setCount(int count) {
		this.count = count;
		return this;
	}

	public String getType() {
		return type;
	}

	public Zombi setType(String type) {
		this.type = type;
		return this;
	}

}
