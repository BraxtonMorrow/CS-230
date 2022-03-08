package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

/*
 * The game class inherits from Entity 
 */

public class Game extends Entity{
	/*
	 * list of teams
	 */
	private static List<Team> teams = new ArrayList<Team>();
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	 * construct a new team
	 * 
	 * name the name of the unique team
	 * return the team (new or existing)
	 */
	public Team addTeam(String name) {
		Team team = null;
		
		//search through teams if the name exists return
		for(int i = 0; i < teams.size(); ++i) {
			if(name.equalsIgnoreCase(teams.get(i).getName())) {
				team = teams.get(i);
			}
		}
		
		// if not found, make new team name and add it to list of names
		if(team == null) {
			team = new Team((long) teams.size(), name);
			teams.add(team);
		}
		return team;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
