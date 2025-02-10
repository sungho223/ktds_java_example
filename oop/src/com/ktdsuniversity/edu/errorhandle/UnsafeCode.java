package com.ktdsuniversity.edu.errorhandle;

public class UnsafeCode {

	public static void throwNullPointerException() {
		String name = null;
		String age = "40";

		boolean isSameAge = age.equals(age);

		if (name != null) {
			System.out.println(name.equals("admin"));
		}

		System.out.println(isSameAge);
		System.out.println("---");
	}
	 
	public static void throwArrayIndexOutOfBoundsException() {
		int[] numbers = { 10, 20, 30, 40 };

		if (numbers.length > 0) {
			System.out.println(numbers[0]);
		}
		if (numbers.length > 1) {
			System.out.println(numbers[1]);
		}
		if (numbers.length > 2) {
			System.out.println(numbers[2]);
		}
		if (numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		if (numbers.length > 4) {
			System.out.println(numbers[4]);
		}
		if (numbers.length > 0) {
			System.out.println(numbers[0]);
		}
		System.out.println("---");

	}

	public static void throwNumberFormatException() {
		String strNum = "123";
		if (strNum.matches("^[0-9]+$")) {
			int num = Integer.parseInt(strNum);
			System.out.println(num);
		}

		String strString = "qwer1234!";
		if (strString.matches("^[0-9]+$")) {
			int num = Integer.parseInt(strString);
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		throwNullPointerException();
		throwArrayIndexOutOfBoundsException();
		throwNumberFormatException();

	}
}
