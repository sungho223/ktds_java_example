package com.ktdsuniversity.edu.enumExam;

public class Calculator {

	public static int calc(String operator, int num1, int num2) {
		return switch (operator) {
		case Operator.ADD -> num1 + num2;
		case Operator.SUB -> num1 - num2;
		case Operator.MUL -> num1 * num2;
		case Operator.DIV -> {
			if (num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			yield num1 / num2;
		}
		default -> throw new IllegalArgumentException("올바른 연산자가 아닙니다: " + operator);
		};
	}

	public static void main(String[] args) {

		String concat = "+";
		String negative = "-";
		String exponents = "*";
		String slice = "/";
		
		int result1 = calc(Operator.ADD, 1, 2);
		int result2 = calc(Operator.SUB, 1, 2);
		int result3 = calc(Operator.MUL, 1, 2);
		int result4 = calc(Operator.DIV, 1, 2);

		System.out.println("1 + 2 = " + result1);
		System.out.println("1 - 2 = " + result2);
		System.out.println("1 * 2 = " + result3);
		System.out.println("1 / 2 = " + result4);
	}
}
