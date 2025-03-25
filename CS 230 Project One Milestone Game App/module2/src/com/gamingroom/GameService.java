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
	private static List<Game> games = new ArrayList<>();

	/**
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/**
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;

	/**
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;

	// Private GameService initialized to null so that the instance can be maintained inside the singleton.
	private static GameService instance = null;

	// Private default constructor so external classes can not instantiate a GameService.
	private GameService(){}

	/**
	 * Method to get an instance of GameService
	 * @return Instance of GameService
	 */
	public static GameService getInstance() {

		if (instance == null) {
			instance = new GameService();
		}
		return instance;
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


		// if found, simply return the existing instance
		for (Game g:games) { // foreach loop to determine if an instance of Game exists with the name passed in the call
			if (name.equals(g.getName())) {
				game = g;
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
	public Game getGame(int index) {
		try { return games.get(index); }
		catch (Exception e) {
			System.out.println("Invalid index");
		}
		return null;
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


		// if found, simply assign that instance to the local variable
		for (Game g: games) { // foreach loop to determine if an instance of Game exists with the id passed in the call
			if (g.getId() == id){
				game = g;
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

		// if found, simply assign that instance to the local variable
		for(Game g: games){ // foreach loop to determine if an instance of Game exists with the id passed in the call
			if (name.equals(g.getName())){
				game = g;
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

	/**
	 * Returns the next player id
	 * @return the next player id
	 *
	 */
	public long getNextPlayerId() {
		long nextPlayer = nextPlayerId;
		nextPlayerId += 1; // Updates nextPlayerId
		return nextPlayer;
	}

	/**
	 * Returns the next team id
	 * @return the next team id
	 */
	public long getNextTeamId() {
		long nextTeam = nextTeamId;
		nextTeamId += 1; // Updates nextTeamId
		return nextTeam;
	}
}
