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
	long id;
	String name;
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
	 */
	public Team addTeam(String name) {
		for (Team team:teams) {
			if (team.name == name) {
				return team;
			}
		}

		Team tempTeam = new Team(id, name);
		teams.add(tempTeam);
		return tempTeam;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
