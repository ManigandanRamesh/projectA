package com.chainsys.springproject.beans;

public class Car {
	 private Engine petrolEngine;
	    private Wheel alloy;
	    public Engine getPetrolEngine() {
	        return petrolEngine;
	    }
	    public void setPetrolEngine(Engine petrolEngine) {
	        this.petrolEngine = petrolEngine;
	    }
	    public Wheel getAlloy() {
	        return alloy;
	    }
	    public void setAlloy(Wheel alloy) {
	        this.alloy = alloy;
	    }

	    public void start() {
	        petrolEngine.start();
	    }

	    public void move() {
	        alloy.move();;
	    }

	    public Car() {
	        petrolEngine = new Engine();
	        alloy = new Wheel();
	    }

	    public Car(Engine petrolEngine, Wheel alloy) {
	        System.out.println("Car object created : " + hashCode());
	        this.petrolEngine = petrolEngine;
	        this.alloy = alloy;
	    }
	}