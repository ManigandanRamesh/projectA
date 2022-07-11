package com.chainsys.springproject.beans;

public class Wheel {

	public void move() {
		System.out.println("Wheel is rotating");
	}
	public Wheel() {
		System.out.println("Wheel Object Created :" + hashCode());
	}

}
