package com.djava.ch7_2;

import test.Solider;

public class Child extends Parent{
	
	String schoolName;
	int grade;
	
	Solider solider;
	
	
	public void printSchoolName() {
		System.out.println(this.schoolName);
	}
	
}
