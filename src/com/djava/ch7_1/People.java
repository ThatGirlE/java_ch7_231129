package com.djava.ch7_1;

//부모 클래스
public class People { 
	// 다른 패키지에 있는 클래스가 다른 패키지의 클래스를 상속받을 때 public을 명시하지 않은 필드는 사용할 수 없다.
	public String name;         // 같은 패키지내에서 상속할시 접근지정자 생략이 가능하나 다른 패키지에 있는 클래스가 상속받으려면 public 지정 
	String ssn; // 주민번호
	private String phone;
	
	public People(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;
	}

//	public People() { 
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	public void printName() {
		System.out.println("이름: " + this.name);
	}
	
	
	
}
