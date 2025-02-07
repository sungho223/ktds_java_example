package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Snake extends Animal{

	public Snake(String place) {
		super(place, 30);
	}

	@Override
	public void movement() {
		System.out.println(this.place + "에 살고 있는 뱀의 생존여부: " + super.isLive);
		System.out.println(this.place + "에 살고 있는 뱀의 자아 여부: " + super.haveEgo);		
	}

	@Override
	public void breath() {
		System.out.println("현재 체온은 " + super.temperature + "도 입니다.");		
	}

	@Override
	public void eat() {
		System.out.println(this.place + "있는 뱀이" 
				+ " 입이 심심함을 느낍니다. 고기를 먹습니다.");		
	}

	
	
}
