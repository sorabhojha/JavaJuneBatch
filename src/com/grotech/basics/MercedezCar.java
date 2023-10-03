package com.grotech.basics;

//Concrete classes 
// No Abstract members. 
public class MercedezCar extends CarAbstract {

	@Override
	public void engineCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Runs on a 2000cc engine");
	}

	@Override
	public void musicSystemSystem() {
		System.out.println("Best in class music system - 12 speakers");
	}

	@Override
	public void sunroof() {
		System.out.println("Big sunroof");
	}
	
	public static void main(String[] args) {
		VehicleInterface obj = new MercedezCar();
		obj.engineCapacity();
		
		System.out.println(ConstantsInterfaceExample.noOfDaysInAWeek);
	}
}

// Interface -> Interface -> extends keyword 
// Class -> Class -> extends keyword
// Interface -> Class -> implements keyword