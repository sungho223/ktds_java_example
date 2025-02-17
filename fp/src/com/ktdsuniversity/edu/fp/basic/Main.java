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

//		System.out.println(yn.test(9));
//		System.out.println(yn.test(8));
//		System.out.println(yn.test(7));
//		System.out.println(yn.test(6));
//		
//		System.out.println(ynFunction2.test(1));

		FunctionParameter fp = new FunctionParameter();
//		boolean isEven = fp.isEven(12, (value) -> value % 2 == 0);
//
//		System.out.println(isEven);
//
//		boolean isValidAge = fp.isValidAge(13, (value) -> value >= 0 && value <= 100);
//		System.out.println(isValidAge);

//		YesOrNo enoughFunction = fp.enougthMoney();
//		boolean enough = enoughFunction.test(90000);
//
//		System.out.println(enough);

		Calculator simpleCalc = (n1, n2) -> {
			int result = n1 + n2;

			// result의 값이 10000보다 큰가?
			YesOrNo calcValidator = (value) -> value > 10_000;
			boolean isValid = calcValidator.test(result);
			System.out.println(isValid);
		};
		simpleCalc.calc(10_000, 100);
		System.out.println();
	}

}
