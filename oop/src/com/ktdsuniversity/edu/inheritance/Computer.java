package com.ktdsuniversity.edu.inheritance;

public class Computer {

	public static void main(String[] args) {
		Cpu intelChip = new Cpu("intel", "i9");
		intelChip.calculate();
		System.out.println();

		Cpu amdChip = new Apu("AMD", "Rizen7");
		amdChip.calculate();

//		Apu tempChip = (Apu) amdChip;
//		tempChip.draw();

//		if( amdChip instanceof Apu temApu)
//		((Apu) amdChip).draw();
//
//		String tempString = "klasdjoiwlkj";
//
//		System.out.println(amdChip instanceof Apu);
//		System.out.println((Object) tempString instanceof Apu);
//
		System.out.println();

	}
}
