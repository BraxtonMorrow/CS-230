package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

/*
 * The team class inherits  from the Entity 
 */
public class Team extends Entity {
	/*
	 * A list of active players
	 */
	private static List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * Construct new team instance
	 * 
	 * Param name the unique name of the team
	 * return the team instance (new or existing)
	 */
	
	public Player addPlayer(String name) {
		Player player = null;
		
		// search through teams list if the team name exists return it
		for(int i = 0; i < players.size(); ++i) {
			if (name.equalsIgnoreCase(players.get(i).getName())) {
				player = players.get(i);
			}
		}
		
		//if not found, make new team and add it to list of teams
		if(player == null) {
			player = new Player ((long) players.size(), name);
			players.add(player);
		}
		return player;
	}
	

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
