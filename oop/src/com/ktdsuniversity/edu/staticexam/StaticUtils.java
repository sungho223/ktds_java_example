package com.ktdsuniversity.edu.staticexam;

public class StaticUtils {

	public static boolean isValidAge(int age, int min, int max) {
		return age > min && age < max;
	}

	public static double getCourseCredit(double average) {
		int courseCredit = (int) ((average - 55) / 10.0 * 100);
		return courseCredit / 100.0;

	}

}
