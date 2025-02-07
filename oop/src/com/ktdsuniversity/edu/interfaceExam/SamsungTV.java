package com.ktdsuniversity.edu.interfaceExam;

public class SamsungTV{
	
	public void welcome(RemoteControl signal) {
		signal.powerOn();
		System.out.println("SAMSUNG");
		
		if(signal instanceof DanawaRemoteControl drc) {
			drc.openDanawaPage();
		}
	}
	
	public void goodBye(RemoteControl signal) {
		signal.powerOff();
	}

}
