package com.grotech.basics.inheritance;

import com.grotech.basics.Telephone;

public class MobilePhoneOtherPackage extends Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhoneOtherPackage tp = new MobilePhoneOtherPackage();
		tp.makePhoneCall("1234567890");
	}
}
