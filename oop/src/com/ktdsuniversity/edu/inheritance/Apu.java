package com.ktdsuniversity.edu.inheritance;

public class Apu extends Cpu {

	public Apu() {
		super();
	}

	public Apu(String menufactor, String seriesNumber) {
		super(menufactor, seriesNumber);
	}

	public void draw() {
		System.out.println("그림 그리는 중 ");
	}

	@Override
	public void calculate() {
		 super.calculate();
		System.out.println("그래픽 계산 중..");
	}

}
