package com.djava.ch7_1;

public class Student extends People{  // 상속 받으니 student 에러

	String grade;
	String studentNum;
	
	public Student(String name, String ssn) {  // 1층 부모객체가 생성되어 있지 않으니 1층을 먼저 만들어야된다? 
		super(name, ssn); // 부모 생성자 호출 super
	}

	@Override  // 상속받은 클래스 -> 자식 클래스에서 수정하여 사용
		public void printName() {
			System.out.println("학생이름:" + this.name);
			//super.printName();
		}
	
}
