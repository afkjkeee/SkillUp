package by.epam.skillup.BasicsOfOOP.Task4.entity;

import java.util.ArrayList;

import by.epam.skillup.BasicsOfOOP.Task4.actions.Actions;

public class Cave {
	private String name;
	private ArrayList<Treasure> treasures;
	private Actions actions;

	public Cave(String name) {
		this.name = name;
		this.actions = new Actions();
		this.treasures = actions.addTreasures();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(ArrayList<Treasure> treasures) {
		this.treasures = treasures;
	}

	public Actions getActions() {
		return actions;
	}

	public void setActions(Actions actions) {
		this.actions = actions;
	}
}
