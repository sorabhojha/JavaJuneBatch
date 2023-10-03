package com.grotech.basics;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primitive data types
		byte b = 10;
		short s = 20;
		int i = 5;
		long l = 40l;
		float f = 50.0f;
		double d = 100.0d;
		char c = 'a';
		boolean b1 = true;
		
		Byte byteWrapper = Byte.valueOf(b);
		Short sortWrapper = new Short(s);
		Integer intWrapper =  i;
		Long longWrapper = l;
		Float floatWrapper = Float.valueOf(f);
		Double doubleWrapper = d;
		Character charWrapper = c;
		Boolean boolWrapper = b1;
	}
}
