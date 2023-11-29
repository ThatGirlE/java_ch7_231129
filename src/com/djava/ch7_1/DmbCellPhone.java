package com.djava.ch7_1;

public class DmbCellPhone extends CellPhone{
	
	int channel; // dmb채널
	
	
	public void turnOnDmb() {
		System.out.println("Dmb 방송 수신을 시작합니다.");
	}
	public void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 종료합니다.");
	}
	public void dmbChannel(int channel) {
		System.out.println("Dmb 채널을"+ channel +"번으로 변경합니다.");
	
}
	
}
