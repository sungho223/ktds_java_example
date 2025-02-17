package com.ktdsuniversity.edu.fp.basic;

public class Main {

	public static void main(String[] args) {

		// YesOrNo 익명 클래스 만들기
		YesOrNo yn = new YesOrNo() {

			@Override
			public boolean test(int value) {
				// value가 짝수이면 true, 홀수이면 false

				return value % 2 == 0;
			}

		};

		YesOrNo ynFunction = (int value) -> {
			return value % 2 == 0;
		};

		// 함수 인풋은 타입을 생략할 수 있다.
		YesOrNo ynFunction2 = (value) -> {
			return value % 2 == 0;
		};

		YesOrNo ynFunction3 = (value) -> value % 2 == 0;

		System.out.println(yn.test(9));
		System.out.println(yn.test(8));
		System.out.println(yn.test(7));
		System.out.println(yn.test(6));
		
		System.out.println(ynFunction2.test(1));
	}
}
