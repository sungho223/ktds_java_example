package com.ktdsuniversity.edu.staticexam;

public class AnimalMain {

	int num1 = 10;
	int num2 = 20;

	public static void calculator() {
		AnimalMain am = new AnimalMain();

		System.out.println("계산기 입니다");
		System.out.println(am.num1 + am.num2);
	}

	public static void main(String[] args) {

		Animal cat1 = new Animal("춘봉", "2015-01-01", 10);
		cat1.printMyInformation(); // 인스턴스 메소드 호출

		System.out.println();

		Animal cat2 = Animal.createNewAnimal("첨지", "2016-01-01", 9); // 클래스 메소드 호출
		cat2.printMyInformation();
		
		System.out.println();
		
		calculator();
		
		
		int number = NumberUtils.convertToInt("1234567890");
		System.out.println(number);
		System.out.println();
		
		boolean isDecimal = NumberUtils.isDecimalFormat("1029384719856");
		System.out.println(isDecimal);
		System.out.println();
		
		System.out.println();
		
		int result = NumberUtils.converToInt("a;lskdjfpoi", 0);
		System.out.println(result);

	}
}
