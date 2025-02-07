package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Dog extends Animal {

	private String name;

	public Dog(String name, String place) {
		super(place, 37.5);
		this.name = name;
	}

	@Override
	public void movement() {
//		super.humgry += 10;
//		if(super.humgry >= 99) {
//			super.humgry = 99;
//		}
//		
//		super.temperature += 0.3;
//		
//		if(super.temperature >= 42) {
//			super.temperature = 42;
//		}
//		
		System.out.println("개 " + this.name + "이 " + super.place + "에서 4발과 꼬리를 이용해움직입니다.");
		System.out.println("개 " + this.name + "생존 여부: " + super.isLive);
		System.out.println("개 " + this.name + "자아 여부: " + super.haveEgo);

	}

	@Override
	public void breath() {
//		super.humgry += 5;
//		if(super.humgry >= 99) {
//			super.humgry = 99;
//		}
//		if (super.temperature > 40) {
//			System.out.println("개 " + this.name + "이 거칠게 개구호흡을 합니다.");
//		}else {
//			System.out.println("개 " + this.name + "코로 호흡을 합니다.");
//		}
		System.out.println("현재 체온은 " + super.temperature + "도 입니다.");

//		super.temperature -= 0.1;
//		if(super.temperature < 37.5) {
//			super.temperature = 37.5;
//		}
	}

	@Override
	public void eat() {

//		if(super.humgry > 90) {
//			System.out.println("개 "  + this.name 
//							+ "이 매우 배가 고픕니다. 사료를 허겁지겁 먹습니다.");
//		}else if(super.humgry > 70) {
//			System.out.println("개 "  + this.name 
//					+ "이 배고픔을 느낍니다,. 사료를 먹습니다.");
//		}else if(super.humgry > 50) {
//			System.out.println("개 "  + this.name 
//					+ "이 출출함을 느낍니다. 사료를 먹습니다.");
//		}else {
//			System.out.println("개 "  + this.name 
//					+ "이 입이 심심함을 느낍니다. 개껌를 먹습니다.");
//		}
		System.out.println("개 " + this.name + "이 입이 심심함을 느낍니다. 개껌를 먹습니다.");

//		super.humgry -= 10;
//		if(super.humgry < 0) {
//			super.humgry = 0;
//		}
//	}

	}
}
