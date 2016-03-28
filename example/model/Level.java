package com.example.model;

import java.util.ArrayList;
import java.util.Collections;

public class Level {

	private static int baseStartingCount = 20;
	private static int countModifier = 5;

	private int number;
	private ArrayList<Zombi> zombies;
	private ArrayList<SpecialAbility> specialAbilities;

	public Level() {
		zombies = new ArrayList<>();
		specialAbilities = new ArrayList<>();
	}

	public static Level levelGenerator(int levelNumber) {
		if (levelNumber > 0) {
			Level rv = new Level();
			rv.number = levelNumber;
			int totalZombieCount = baseStartingCount + countModifier * levelNumber;
			int countPerType = totalZombieCount / (levelNumber % 10 + 1);
			
			if (totalZombieCount % 2 == 1) {
				countPerType += 1;
			}
			rv.zombies.add(new Zombi().setName("Zombie").setHp(1).setSpeed(3).setCount(countPerType));
			if (levelNumber > 9) {
				SpecialAbility level10 = new SpecialAbility("Move diagonally",
						"Move on diagonals and changes directions");
				rv.zombies.add(new Zombi().addAbility(level10).setName("ZombieDog").setSpeed(5).setHp(1)
						.setCount(countPerType));
				rv.specialAbilities.add(level10);
			}
			if (levelNumber > 19) {
				SpecialAbility level20 = new SpecialAbility("Carry Zombie baby",
						"Can drop a Zombie baby in front of her.You must kill the baby too!");
				rv.zombies.add(new Zombi().addAbility(level20).setCount(countPerType).setHp(1).setSpeed(3)
						.setName("ZombieMother"));
				rv.specialAbilities.add(level20);
			}
			if (levelNumber > 29) {
				SpecialAbility level30 = new SpecialAbility("Dig hole in ground",
						"Can dig holes in the ground and hide in them.Then can show up on random position on the map");
				rv.zombies.add(new Zombi().addAbility(level30).setCount(countPerType).setHp(1).setName("ZombieMiner")
						.setSpeed(3));
				rv.specialAbilities.add(level30);
			}
			if (levelNumber > 39) {
				rv.zombies.add(new Zombi().setCount(countPerType).setName("ZombieSumo").setHp(3).setSpeed(2));
			}
			if (levelNumber > 49) {
				rv.zombies.add(
						new Zombi().addSetOfAbilities(rv.specialAbilities).setCount(countPerType).setHp(3).setSpeed(3));
			}
			return rv;
		} else {
			throw new IllegalArgumentException("Invalid Level Number");
		}
	}


	public ArrayList<Zombi> getZombiList() { 
		return zombies;
	}

}
