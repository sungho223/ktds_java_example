/*
 * 2025년 01월 15일
 * kt ds 교육 1일차
 * 변수 범위 공부 예제
 * */
package first_java_program;

public class VariableScope {
	static int number = 88;

	public static void main(String[] args) {

		int age = 41;

		{
			System.out.println(age);
		}

		someMethod(number);

		{

			int limit = 123;
			System.out.println(limit);

		}

		VariableScope vs = new VariableScope();
		vs.testNumber(number);

		System.out.println("종료");

	}

	static void someMethod(int number) {
		System.out.println(number);
	}

	void testNumber(int number) {
		int result = number + 1;
		System.out.println(result);
	}

}
