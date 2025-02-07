package com.ktdsuniversity.edu.inheritance.abstractclass;

public abstract class Animal {

	protected boolean isLive;
	protected String place;
	protected boolean haveEgo;
	protected double temperature;
	protected double humgry;

	public Animal(String place, double temperature) {
		this.isLive = true;
		this.place = place;
		this.haveEgo = true;
		this.temperature = temperature;
		this.humgry = (int) (Math.random() * 100);
	}

	
	

	public abstract void movement();

	public abstract void breath();

	public abstract void eat();

}
