package com.ktdsuniversity.edu.interfaceExam;

public class TemuRemoteControl implements RemoteControl{

	public void powerOn() {
		System.out.println("짝퉁 리모컨 신호를 보냈습니다.");
	}

	public void powerOff() {
		System.out.println("짝퉁 리모컨 신호를 중단했습니다.");
	}

}
