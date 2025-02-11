package com.ktdsuniversity.edu.staticexam;

public class StaticUtilsMain {
	/**
	 * isValidAge(int age, int min, int max) 클래스 메소드를 만들고
	 * age의 값이 min보다 크고 max 보다 작으면 true를, 아니면 false를 반환하도록 작성하고 호출해보세요.
	 * 
	 * getCourseCredit(double average) 클래스 메소드를 만들고 
	 * average의 값을 4.5 만점 기준의 학점을 반환하도록 작성하고 호출해보세요.
	 */
	public static void main(String[] args) {
		boolean isValidAge = StaticUtils.isValidAge(10, 0, 101);
		System.out.println(isValidAge); // true
		
		isValidAge = StaticUtils.isValidAge(200, 0, 101);
		System.out.println(isValidAge); // false
		
		isValidAge = StaticUtils.isValidAge(101, 0, 101);
		System.out.println(isValidAge); // false
		
		double courseCredit = StaticUtils.getCourseCredit(85.19);
		System.out.println(courseCredit); // 3.0
		
		courseCredit = StaticUtils.getCourseCredit(39.11);
		System.out.println(courseCredit); // 1.0
	}
	
}