package com.gamingroom;
/*
 * Entity acts as the super class for Game, Team, and Player classes
 */

public class Entity {

	long id;
	String name;
	
	/*
	 * default constructor
	 */
	public Entity() {	
	}
	
	/*
	 * Constructor with an identifier and name
	 */
	
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	 * return id
	 */
	public long getId() {
		return this.id;
	}
	
	/*
	 * return name
	 */
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
