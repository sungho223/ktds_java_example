package com.ktdsuniversity.edu.string;

public class HugeString {

	public static String makeString() {

		String str = "";

		for (int i = 0; i < Short.MAX_VALUE * 50; i++) {
			str += "A";
		}
		return str;

	}

	public static void main(String[] args) {

		System.out.println("문자열을 생성합니다. (1)");
		String one = makeString();

		System.out.println("문자열을 생성합니다. (1)");
		String two = makeString();
		System.out.println("문자열을 합쳐봅니다. ");

		String result = one + two;

		System.out.println(result);
	}
}
