package com.djava.ch7_1;

public class cameraCellPhone extends CellPhone{
	
	String camera;
	
	public void cameraOn(){
		System.out.println("카메라 켜기");
	}
	public void cameraOff(){
		System.out.println("카메라 끄기");
	}
	public void photo(){
		System.out.println("사진 찍기");
	}
	
}
