package com.example.model;

public class Player {

	private static int idModifier = 1;

	private int id;
	private String username;
	private String password;
	private String email;
	private int age;
	private String address;
	private int highScore;

	public Player(String username, String password, String email, int age, String address) {
		id = idModifier++;
		highScore = 0;
		this.username = username;
		this.address = address;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public int getHighScore() {
		return highScore;
	}

	public Player setHighScore(int highScore) {
		if (highScore > this.highScore)
			this.highScore = highScore;
		return this;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

}
