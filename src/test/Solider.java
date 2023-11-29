package test;

import com.djava.ch7_1.People;  // 다른 패키지에 있으니까 import

public class Solider extends People{

	public Solider(String name, String ssn) {
		super(name, ssn);
	}
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("군인이름:" + this.name);
	}

	
	
}
