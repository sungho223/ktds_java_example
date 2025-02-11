package com.ktdsuniversity.edu.interfaceexam;

public interface RemoteControl {

	// interface에는 상수만 정의가 가능하다.
	public String MANUFACTOR = "1";
	
	// interface 에서 정의하는 모든 메소드들은 추상메소드이다.
	// abstract를 생략하더라도 추상메소드가 된다.
	public void powerOn();
	
	public void powerOff();
	
	public default void process() {
		this.powerOn();
		this.powerOff();
	}
	
	
}