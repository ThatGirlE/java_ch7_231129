package com.djava.ch7_1;

import test.Solider;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		// 부모클래스에서 상속 받은 필드 값을 초기화
		dmbCellPhone.model = "갤럭시폰";
		dmbCellPhone.color = "검정";
		
		
		// 부모클래스 선언되어 있는 메소드 호출 가능
		dmbCellPhone.receiveVoice("여보세요");
		
		cameraCellPhone cameraCellPhone = new cameraCellPhone();
		
		cameraCellPhone.model = "아이폰";
		
		People people = new People("웨인루니", "900312-1234567");
//		People people2 = new People();
		
		Student student = new Student("이순신", "9510101-1234342");
		
		//student.phone 부모클래스에서 private 접근 지정자로 지정된 필드는 자식클래스에서 불러올 수 없다.
		
		
		Solider solider = new Solider("김유신", "001111-1234567"); 
		solider.name = "강감찬";
		
		people.printName();
		student.printName();
		solider.printName();
		
		People people1 = new Student("강감찬", "881818-1212121");
		People people2 = new Solider("권율", "941818-2212121");
		
		
	}

}
