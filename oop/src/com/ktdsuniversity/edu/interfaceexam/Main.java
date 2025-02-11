package com.ktdsuniversity.edu.interfaceexam;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * RemoteControl(interface)
		 *  -> (extends) DanawaTvSignal(interface)
		 *  
		 * StandardTvRemoteControl (class)
		 *  -> (implements) RemoteControl(interface)
		 * 
		 * DanawaRemoteControl (class)
		 *  -> (implements) DanawaTvSignal(interface)
		 *	   -> (extends) RemoteControle(interface)
		 *
		 * DanawaTvSignal(interface) is a RemoteControl(interface)
		 * StandardTvRemoteControl(class) is a RemoteControl(interface)
		 * DanawaRemoteControl(class) is a DanawaTvSignal(interface)
		 * DanawaRemoteControl(class) is a RemoteControl(interface) 
		 * 				because DanawaTvSignal is a RemoteControl.
		 */
		
		LgTvRemoteControl lgRemoteControl = new LgTvRemoteControl();
		RemoteControl godRemoteControl = new StandardTvRemoteControl();
		RemoteControl danawaRemoteControl = new DanawaRemoteControl();
		//DanawaTvSignal danawaRemoteControl2 = new DanawaRemoteControl();
		
		godRemoteControl.process();
		danawaRemoteControl.process();
		
		SamsungTV qhdTV = new SamsungTV();
		qhdTV.welcome(danawaRemoteControl);
		qhdTV.goodbye(danawaRemoteControl);
		
		LgTV oledTV = new LgTV();
		oledTV.on(danawaRemoteControl);
		oledTV.off(danawaRemoteControl);
	}
	
}