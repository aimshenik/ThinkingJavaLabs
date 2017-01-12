package com.imshenik.java.chapter3;

public class Ex5and6 {
	public static void main(String[] args){
		Dog spot = new Dog();
		spot.name = "spot";
		Dog scruffy = new Dog();
		scruffy.name = "scruffy";
		
		System.out.println("spot name = " + spot.name + ", spot.says = " + spot.says);
		System.out.println("scruffy name = " + scruffy.name + ", scruffy.says = " + scruffy.says);
		
		Dog dog3 = spot;
		System.out.println((boolean) dog3.equals(spot));
	}
}
class Dog{
	String name,says;
	
	
}