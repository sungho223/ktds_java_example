package com.ktdsuniversity.edu.staticexam;

public class IsValidAgeEx {
	
	public static void main(String[] args) {
		boolean isValid1 = StaticUtils.isValidAge(10, 0, 101);
		System.out.println(isValid1);

		boolean isValid2 = StaticUtils.isValidAge(10, 100, 101);
		System.out.println(isValid2);
		
		double coureseCredit1 = StaticUtils.getCourseCredit(85.19);
		System.out.println((coureseCredit1));

	}

}
