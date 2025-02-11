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
		super.temperature += 0.1;
		if (super.temperature >= 41) {
			super.temperature = 41;
		}
		
		super.hungry += 1;
		if (super.hungry >= 99) {
			super.hungry = 99;
		}
		
		if (super.hungry > 80) {
			System.out.printf("사람 %s (%d세) 가 움직일 기력이 없습니다.\n", this.name, this.age);
			return;
		}
		
		if (super.temperature >= 40) {
			System.out.printf("사람 %s (%d세) 가 많이 아파 병원에 급히 가야합니다.\n", this.name, this.age);
			return;
		}
		else if (super.temperature >= 38) {
			System.out.printf("사람 %s (%d세) 가 아파 병원에 가야합니다.\n", this.name, this.age);
			return;
		}
		
		System.out.printf("사람 %s (%d세) 가 두 발로 걸어갑니다.\n", this.name, this.age);
	}
	
	@Override
	public void breath() {
		super.temperature -= 0.1;
		if (super.temperature >= 41) {
			super.temperature = 41;
		}
		
		super.hungry += 0.1;
		if (super.hungry >= 99) {
			super.hungry = 99;
		}
		
		System.out.printf("사람 %s (%d세) 가 %s 에서 편하게 숨쉬고 있습니다.\n", this.name, this.age, super.place);
	}
	
	@Override
	public void eat() {
		super.hungry -= 2;
		if (super.hungry < 0) {
			super.hungry = 0;
		}
		
		if (super.hungry > 80) {
			System.out.printf("사람 %s (%d세)가 아무거나 먹습니다.\n", this.name, this.age);
			return;
		}
		else if (super.hungry > 60) {
			System.out.printf("사람 %s (%d세)가 식사합니다.\n", this.name, this.age);
			return;
		}
		else if (super.hungry > 40) {
			System.out.printf("사람 %s (%d세)가 간식을 먹습니다.\n", this.name, this.age);
			return;
		}
		
		System.out.printf("사람 %s (%d세)는 먹을 필요를 못느낍니다.\n", this.name, this.age);
	}
	
}