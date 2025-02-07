package com.ktdsuniversity.edu.interfaceExam;

public class DanawaRemoteControl implements DanawaTvSignal {

	@Override
	public void powerOn() {
		System.out.println("다나와에서 만든 리모컨 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("다나와 사용 리모컨 꺼짐");
	}

	@Override
	public void openDanawaPage() {
		System.out.println("다나와 사이트 오픈");
		
	}

}
