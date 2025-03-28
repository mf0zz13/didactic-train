package com.gamingroom;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Player extends Entity{

	/**
	 * Add Player
	 * @param id long that is the id for player
	 * @param name String that is the name of player
	 */
	public Player(long id, String name) {
		super(id,name);
	}

	/**
	 * Return String with game id and name
	 * @return String including game id and name
	 */
	@Override
	public String toString() {
		return "Player [id=" + this.getId() + ", name=" + this.getName() + "]";
	}
}
