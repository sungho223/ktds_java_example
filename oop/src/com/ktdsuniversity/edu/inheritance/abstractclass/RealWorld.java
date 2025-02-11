package com.ktdsuniversity.edu.inheritance.abstractclass;

public class RealWorld {

	public static void behavior(Animal animal) {
		for (int i = 0; i < 50; i++) {
			animal.live();
		}
	}
	
	public static void main(String[] args) {
		Animal dog = new Dog("뿌꾸", "두치 집");
		dog.live();
//		behavior(dog);
		
		Animal human = new Human("장민창", 40, "집");
		human.live();
//		behavior(human);
		
		Animal snake = new Snake("야산");
		snake.live();
//		behavior(snake);
	}
	
}