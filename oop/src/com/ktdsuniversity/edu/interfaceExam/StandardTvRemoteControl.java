package com.ktdsuniversity.edu.interfaceExam;

public class StandardTvRemoteControl implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("정품 리모컨 신호를 보냈습니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("정품 리모컨 신호를 중단했습니다.");
	}

}
