package com.intro;

public class Main {
	//Static method for displaying Bicycles and details
	public static void displayBicycles(Bicycle[] bikes) {
		for(int i = 0; i < bikes.length; i++) {
			System.out.print("Bicycle number: " + (i+1) + "\n");
			System.out.println(bikes[i].toString());
		}
	}
	//Static method for displaying default Object methods.
	public static void displayObjectMethods(Bicycle bike) {
		
		//Object inherited method by default: clone, equals, getClass, hashCode, finalize, toString
		System.out.println("Object inherited method - equals : " + bike.equals(bike));
		System.out.println("Object inherited method - getClass : " + bike.getClass());
		System.out.println("Object inherited method - hashCode : " + bike.hashCode());
		System.out.println("Object inherited method - toString : " + bike.toString());
	}
	
	public static void main(String[] args) {
		
		//Exercising Polymorphism - Creating 3 Bicycle Object to be assigned sub-class.
		Bicycle b1, b2, b3;
		
		//3 Mountain Bicycle type created and assigned to Bicycle variables.
		b1 = new MountainBike(3, 100, 25);
		b2 = new MountainBike(3, 75, 35);
		//Different constructor called for third mountain bicycle
		b3 = new MountainBike(5, 50);
		
		//Store all mountain bikes based on their parent relation
		Bicycle[] bikeArray = {b1, b2, b3};
		
		displayBicycles(bikeArray);
		
		displayObjectMethods(b1);
		
	}

}
