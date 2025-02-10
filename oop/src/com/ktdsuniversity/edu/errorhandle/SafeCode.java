package com.ktdsuniversity.edu.errorhandle;

import java.util.Scanner;

public class SafeCode {

	
	public static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다!");
		}
		return a / b;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("나눗셈을 수행할 숫자 입력 (a b): ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			int result = divide(a, b);
			System.out.println("결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}