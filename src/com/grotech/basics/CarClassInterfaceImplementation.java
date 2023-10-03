package com.grotech.basics;

public class CarClassInterfaceImplementation implements VehicleInterface {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Drive on 4 wheels");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("I use Disk Brakes to stop");
	}

	@Override
	public void engineCapacity() {
		// TODO Auto-generated method stub
		System.out.println("I have a hefty 1500 cc engine!!");
	}
	
	void greet() {
		System.out.println("Greetings from Hyundai Creta!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInterface creta = new CarClassInterfaceImplementation();
		creta.drive();
		creta.brake();
	}
}
