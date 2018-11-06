package com.intro;

//Derived Class
public class MountainBike extends Bicycle{

	public int seatHeight;
	
	//Constructor Overloading	
	public MountainBike(int gear, int speed) {
		//Invoking base-class constructor
		super(gear, speed);
		this.seatHeight = 5;
		
		//Output to see constructor hierarchy
		System.out.println("Mountain Bike Constructor A");
	}
	
	//Constructor Overloading
	public MountainBike(int gear, int speed, int seatHeight) {
		//Invoking base-class constructor
		super(gear, speed);
		this.seatHeight = seatHeight;
		
		//Output to see constructor hierarchy
		System.out.println("Mountain Bike Constructor B");
	}
	
	//Subclass adds getter/setter for height
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public int getHeight() {
		return seatHeight;
	}
	
	//Overriding toString() method of Bicycle
	@Override
	public String toString() {
		//Call to the base class method
		return(super.toString() + "\nseat height is " + seatHeight);
	}
}
