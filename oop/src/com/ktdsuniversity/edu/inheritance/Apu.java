package com.ktdsuniversity.edu.inheritance;

/**
 * Cpu클래스를 확장시켜서 새롭게 만든 클래스.
 * Classname extends SuperClass
 * 
 * SuperClass 에 생성자가 하나라도 존재한다면
 * SubClass 에서는 생성자 중 하나 이상을 반드시 구현해야 한다.
 *  구현 생성자 내부에서는 SuperClass의 생성자를 반드시 호출해야 한다.
 * 
 */
public class Apu extends Cpu {

	public Apu(String menufactor, String seriesNumber) {
//		super <-- Super Class의 instance(Super Class 원본)
//		super(); <-- Super Class(Cpu)의 기본 생성자를 호출하는 코드.
		super(menufactor, seriesNumber);
	}
	
	public void draw() {
		System.out.println("그림을 그립니다....................");
	}
	
	// Cpu.calculate() 의 기능을 다시 뜯어고치기
	// Cpu.calculate()의 원래 기능도 그대로 실행시키고 싶다.
	// Method Overriding
	@Override // super class 의  calculate() 메소드를 재정의한다~ 라고 정의하는 것.
	public void calculate() {
		System.out.println("그림을 그리면서 2진수 계산도 합니다.");
	}
	
}