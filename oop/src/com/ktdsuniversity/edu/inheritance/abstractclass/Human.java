package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Human extends Animal {

	private String name;
	private int age;

	public Human(String name, int age, String place) {
		super(place, 36.5);
		this.name = name;
		this.age = age;
	}

	@Override
	public void movement() {
		System.out.println("사람이름:  " + this.name + "생존 여부: " + super.isLive);
		System.out.println("사람이름: " + this.name + "자아 여부: " + super.haveEgo);
		System.out.println("사람이름: " + this.name + "나이: " + this.age);
	}

	@Override
	public void breath() {
		System.out.println("현재 체온은 " + super.temperature + "도 입니다.");
	}

	@Override
	public void eat() {
		System.out.println(this.name 
				+ "이 입이 심심함을 느낍니다. 밥를 먹습니다.");
	}

}
