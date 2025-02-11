package com.ktdsuniversity.edu.staticexam;

public class AnimalMain {

	int numberOne = 10;
	int numberTwo = 20;
	
	public static void calculator() {
		
		AnimalMain am = new AnimalMain();
		
		System.out.println("계산기 입니다.");
		System.out.println(am.numberOne + am.numberTwo);
	}
	
	public static void main(String[] args) {
		calculator();
		
		int number = NumberUtils.convertToInt("3987123");
		System.out.println(number);
		
		boolean isDecimal = NumberUtils.isDecimalFormat("1238921");
		System.out.println(isDecimal);
		
		isDecimal = NumberUtils.isDecimalFormat("12a38921");
		System.out.println(isDecimal);
		
		
		
		Animal cat = new Animal("춘봉", "2015-01-01", 10);
		cat.printMyInformation(); // 인스턴스 메소드 호출.
		
		Animal cat2 = Animal.createNewAnimal("첨지", "2016-01-01", 9); // 클래스 메소드 호출
		cat2.printMyInformation(); // 인스턴스 메소드 호출
	}
	
}