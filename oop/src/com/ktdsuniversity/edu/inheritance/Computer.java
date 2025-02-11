package com.ktdsuniversity.edu.inheritance;

import com.ktdsuniversity.edu.interfaceexam.RemoteControl;

public class Computer {

	public static void calculateAndDraw(Cpu cpu) {
		System.out.println("=================");
		cpu.calculate();
		if (cpu instanceof Apu apu) {
			apu.draw();
		}
	}
	
	public static void main(String[] args) {
		Cpu intelChip = new Cpu("intel", "i9");
		//intelChip.calculate();
		calculateAndDraw(intelChip);
		
		// Cpu 클래스를 확장한 Apu 클래스
		// Cpu 클래스의 멤버변수와 메소드에 접근이 가능하다. (마치 내것처럼)
		// Apu is a Cpu
		// Cpu isnt a Apu
		// Cpu is a Apu => (Apu) cpu
		Cpu amdChip = new Apu("AMD", "Rizen7");
		//amdChip.calculate();
		calculateAndDraw(amdChip);
		
		// Cpu isnt a Apu
//		Apu tempChip = amdChip;
//		Apu tempChip = (Apu) amdChip;
//		tempChip.draw();
		if ( amdChip instanceof Apu tempAmdChip  ) {
			tempAmdChip.draw();
		}
//		amdChip.draw();
		
		String tempString = "asdfsadf";
		
		// is a 관계를 확인하는 코드
		System.out.println( "amdChip is a Apu: " + (amdChip instanceof Apu) );
		System.out.println( "tempString is a Apu: " + ((Object) tempString instanceof Apu) );
		
		
		// is a
		// Sub class is a Super class
		// Super class isnt a Sub class
		//   => Super class is a Sub class (Type casting)
		/*
		 * 정수 -> 정수
		 * int -> long ( int is a long )
		 * long -> int ( (int) longvalue : overflow )
		 * 
		 * type casting -> is a 관계가 성립할 때만 사용 가능.
		 * String  -> int (X)
		 * int -> String (X)
		 */
		
		System.out.println(amdChip);
	}
	
}