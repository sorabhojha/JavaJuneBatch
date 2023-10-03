package com.grotech.basics.inheritance;

import com.grotech.basics.Telephone;

public class Caller {

	//Package private
	//Different Package - Non Subclass
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tp = new Telephone();
		tp.makePhoneCall("1234567890");
	}
}
