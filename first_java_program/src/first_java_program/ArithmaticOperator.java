/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 연잔자 공부 예제
 * */

package first_java_program;

public class ArithmaticOperator {
	public static void main(String[] args) {

		int numA = 1_000_000_000;
		int numB = 1_000_000_000;
		long sum = (long) (numA + numB);
		System.out.println(sum);

		Object result = 10 / 3.9;

		if (result instanceof Double) {
			System.out.println("type: Double.");
		} else {
			System.out.println("type: Different.");
		}
		System.out.println("====================");

		// 셀프 연산
		int count = 0;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count++; // 증감 연산자
		System.out.println("증감연산자 결과: " + count);
		System.out.println("====================");

		// 셀프연산에 반목문 사용해서 0~9까지 출력
		for (int i = 0; i < 10; i++) {
			count = 0;
			count += i;
			System.out.println(count);
		}

	}
}
