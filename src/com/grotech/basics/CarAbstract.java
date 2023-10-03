package com.grotech.basics;

public abstract class CarAbstract implements CarInterface {

	@Override
	public void drive() {
		System.out.println("Drives on 4 wheels with the help of a steering");
	}

	@Override
	public void brake() {
		System.out.println("Breakes using Disk Brake.");
	}

	public abstract void engineCapacity();

	public abstract void musicSystemSystem();
	
	public abstract void sunroof();
}
