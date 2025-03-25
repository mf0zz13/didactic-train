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
public class Game extends Entity {

	private static List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
        super(id, name);
	}

	/**
	 * Add name to list of teams
	 * @return team object
	 * @param name String that will be the name of team
	 */
	public Team addTeam(String name) {
		for (Team team:teams) {
			if (name.equals(team.getName())) {
				return team;
			}
		}
		Team tempTeam = new Team(GameService.getInstance().getNextPlayerId(),name);
		teams.add(tempTeam);
		return tempTeam;
	}

	/**
	 * Return String with game id and name
	 * @return String including game id and name
	 */
	@Override
	public String toString() {
		return "Game [id=" + this.getId() + ", name=" + this.getName() + "]";

	}

}
