package com.chainsys.springproject.beans;

public class Lunch {
	private Starters entree;
	private MainCourse mainfood;
	private Desert sweets;
    // Constructor based Dependency Injection
	public Lunch(Starters s, MainCourse m, Desert d) {
		System.out.println("Lunch is ready");
		entree = s;
		mainfood = m;
		sweets = d;
	}
	public void serve() {
		System.out.println(entree.name);
		System.out.println(mainfood.name);
		System.out.println(sweets.name);
	}
}

/*
 * Lunch 
 * Starters, Chicken, Soup, Vegroll 
 * Maincourse,SouthIndian, North Indian,
 * Chinese Deserts,Icecream,Sweets, Cakes
 */