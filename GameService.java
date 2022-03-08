package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;

	/* Holds the next player identifier*/
	
	private static long nextPlayerId = 1; 

	private static GameService service = new GameService();
	
	private GameService() {
		
	}
	public static GameService getInstance() {
		return service;
	}
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		//iterate through names if the game exists return it
		for(int i = 0; i < getGameCount(); i++) {
			if(name.equalsIgnoreCase(games.get(i).getName())) {
				game = games.get(i);
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		//search through games if id exists return it
		for(int i = 0; i < getGameCount(); i++) {
			if(games.get(i).getId() == id) {
				game = games.get(i);
			}
		}
		return game;
	}
	
	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// checks to see if name of game is a game we want to add
		for(int i = 0; i < getGameCount(); i++) {
			if(name.equalsIgnoreCase(games.get(i).getName())) {
				game = games.get(i);
			}
		}	

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	
	 /* 
	 * Returns player Id
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}
	
	/* 
	 * Returns Tea Id
	 */
	public long getNextTeamId() {
		return nextTeamId++;
	}
}
