package com.dropwizard.helloworld;

import java.util.List;

public class Gods {
	
	String name;
	String description;
	int damage;
	
	public Gods() {
		
	}

	public static List<Object> getGods(){
		return (List<Object>) PopulateLists.getList("gods");
	}

	public void attackGod(){
		Player player = Player.getPlayerInstance();
		System.out.println(player.getArmor());

	}




	

	@Override
	public String toString() {
		return "\nGod: [name=" + name + ", description=" + description + "]";
	}

	
}
	

