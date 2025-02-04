package com.ktdsuniversity.edu.staticexam;

import static com.ktdsuniversity.edu.staticexam.Car.INSTANCE_COUNT;

public class CarMain {
	public static void main(String[] args) {
		
		Car car1 = new Car("중형");
		System.out.println(INSTANCE_COUNT);
		System.out.println(car1.getName());
		
		
		Car car2 = new Car("경차");
		System.out.println(Car.INSTANCE_COUNT);
		System.out.println(car2.getName());
		
		
		
		
	}
}
