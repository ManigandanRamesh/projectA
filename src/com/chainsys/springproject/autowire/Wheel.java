package com.chainsys.springproject.autowire;

public class Wheel {

	public void rotate() {
		System.out.println("Wheel is rotating");
	}
	public Wheel() {
		System.out.println("Wheel Object Created :" + hashCode());
	}

}
