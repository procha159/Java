package com.intro;

//Base Class
public class Bicycle {
	
	//Two Fields
	public int gear;
	public int speed;
	
	//Base Constructor
	public Bicycle(int gear, int speed) {
		//Shadowing values from constructor to instance variables.
		this.gear = gear;
		this.speed = speed;
		
		//Output to see constructor hierarchy
		System.out.println("Bicycle Constructor");
				
	}
	
	//Decrease Bike Speed
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	//Increase Bike Speed
	public void speedUp(int increment) {
		speed += increment;
	}
	//Overwrite toString method given to all objects
	public String toString() {
		return("Number of gears are " + gear + '\n' + "Speed of bicycle is " + speed);
	}
}
