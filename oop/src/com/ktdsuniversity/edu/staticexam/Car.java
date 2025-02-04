package com.ktdsuniversity.edu.staticexam;

public class Car {

	// 클래스 변수
	// OOP 프로젝트 내부 어디서나 접근 가능한 클래스 변수
	// com.ktdsuniversity.edu.staticexam.Car.instanceCount = 11; 이처럼 어디서나 접근 가능하다.
	public final static int INSTANCE_COUNT = 0;
	public final static int instanceCount2 = 0;
	
	// (인스턴스) 멤버 변수
	private String name;

	public Car(String name) {
		// 1. 클래스 변수의 값을 1 증가 시킨다.
		// Car 타입의 인스턴스가 만들어 질 때마다 1씩 증가한다.
		// Car.INSTANCE_COUNT++;

		// The static field Car.instanceCount should be accessed in a static way
		// 아래의 방식 지양
		// this.instanceCount++;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
