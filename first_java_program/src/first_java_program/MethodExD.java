package first_java_program;

public class MethodExD {

	public static int getAdditionResult() {
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		return number1 + number2;
	}

	/**
	 * 숫자 2개를 랜덤하게 생성하고, 두 숫자를 더한 결과를 반환 숫자 중 하나라도 5보다 작은 숫자가 있다면 -1을 반환
	 */
	public static int getConditionAdditionResult() {
		int n = (int) (Math.random() * 10);
		int m = (int) (Math.random() * 10);
		System.out.println("n: " + n);
		System.out.println("m: " + m);
		if (n < 5 || m < 5)
			return -1;

		return n + m;

	}

	public static void printNumber() {
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				return;
			}
		}
	}

	public static int getTestNumber() {
		int number1 = (int) (Math.random() * 100);
		if (number1 > 90)
			return 100;
		else if (number1 > 50)
			return 30;
		return -1;
	}

	public static void main(String[] args) {
//		System.out.println(getAdditionResult());
		System.out.println(getConditionAdditionResult());
	}
}
