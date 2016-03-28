package com.example.model;

public class SpecialAbility {
	private static int saID = 1;

	private int id;
	private String name;
	private String description;

	public SpecialAbility(String name, String description) {
		id = saID++;
		this.name = name;
		this.description = description;
	}

	public static int getSaID() {
		return saID;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
