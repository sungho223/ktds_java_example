package com.ktdsuniversity.edu.inheritance.abstractclass;

public class RealWorld {

	public static void behavior(Animal animal) {

//		for (int i = 0; i < 50; i++) {
			animal.movement();
			animal.breath();
			animal.eat();
//		}

	}

	public static void main(String[] args) {

		Animal dog = new Dog("파트라슈", "플랜더스");
		behavior(dog);
		
		System.out.println();
		System.out.println();

		Animal person = new Human("james", 40, "home");
		behavior(person);

		System.out.println();
		System.out.println();

		Animal python = new Snake("야산");
		behavior(python);

	}
}
