package com.ktdsuniversity.edu.interfaceExam;

public class Main {
	public static void main(String[] args) {

		TemuRemoteControl temu = new TemuRemoteControl();
		StandardTvRemoteControl st = new StandardTvRemoteControl();
		DanawaRemoteControl danawa = new DanawaRemoteControl();
		
		SamsungTV parv = new SamsungTV();
		LgTV lgtv = new LgTV();
		
		parv.welcome(danawa);
		
//		parv.welcome(st);
//		parv.goodBye(temu);
//		parv.goodBye(danawa);
//		
//		lgtv.on(st);
//		lgtv.off(temu);
//		lgtv.off(danawa);
//	
	}
}
