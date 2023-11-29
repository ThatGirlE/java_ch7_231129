package com.djava.ch7_2;

public class MainClass {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		
		parent = child;//1   부모는 자식의 모든것을 받아준다 -> *upcasting* 자동타입변환
		Parent parent1 = new Child();//2  1과2 같은 코드
		
		Child child1 = new Child(); 
		
		// parent. 자식클래스 안뜸. 1층 -> 2층 2층 비어있으니까 안뜸  		
		
		
		child = (Child)parent; // *downcasting*
		
		// child. 부모클래스 뜸, 2층 -> (child)1층, 2층으로 올리니까(강제 타입변환) 뜸
		
		Child2 child2 = new Child2();
		//child2.
	}

}
