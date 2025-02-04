package first_java_program;


public class Method {

	public static int getTestNumber2() { // <-- 왜 에러가 안 날까요?
		int number1 = (int) (Math.random() * 100);
		if (number1 > 90) {
			return 100;
		}
		else if (number1 > 50) {
			return 30;
		}
		else {
			return -1;
		}
	}
	
	public static int getTestNumber() { // <-- 왜 에러가 날까요?
		int number1 = (int) (Math.random() * 100);
		if (number1 > 90) {
			return 100;
		}
		else if (number1 > 50) {
			return 30;
		}
		return -1; // 해소되지 않은 경우의 수 처리.
	}
	
	/**
	 * 파라미터는 없다.
	 * 임의의 숫자 두개를 만들어서 값을 할당하고, 두 숫자의 합을 반환시킨다.
	 */
	public static int getAdditionResult() {
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		
		return number1 + number2;
	}
	
	/**
	 * 숫자 두개를 랜덤하게 생성을 하고 두 숫자를 더한 결과를 반환시키는데
	 * 숫자 중 하나라도 5 보다 작은 숫자가 있다면 -1을 반환시킨다.
	 */
	public static int getConditionalAdditionResult() {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		if (number1 < 5) {
			return -1;
		}
		
		if (number2 < 5) {
			return -1;
		}
		
		return number1 + number2;
	}
	
	/**
	 * 1과 10 사이에 홀수만 출력한다.
	 */
	public static void printNumbers() {
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				
				return; // 반환타입이 void 인 메소드에서 return은 printNumber 메소드를 즉시 종료시켜버린다.
			}
		}
		
	}
	
	/**
	 * 정수 파라미터 두개를 받아서, 첫 번째 파라미터 정수에 두 번째 파라미터 정수만큼 곱해서 문자열 파라미터와 함께 출력.
	 * 
	 * @param number  정수
	 * @param time    제곱할 횟수
	 * @param message 결과와 함께 출력해주고 싶은 문자열
	 */
	public static void printPowerNumberWithMessage(int number, int time, String message) {
		long result = 1;

		for (int i = 0; i < time; i++) {
			result *= number;
		}

		System.out.println(message + result);
	}

	// int number : 파라미터, Argument, 인자 ==> 임시변수.
	public static void printPowerNumber(int number) {
		// result: 지역변수.
		int result = (int) Math.pow(number, 2);
		System.out.println(number + " 의 제곱수는 " + result + "입니다.");
	}

	/**
	 * 정해진 숫자 두 개를 더해 출력하는 메소드. 숫자를 더하는 방법과 출력하는 방법이 기술.
	 */
	public static void add() {
		int number1 = 2;
		int number2 = 5;

		int addResult = number1 + number2;

		System.out.println(number1 + " + " + number2 + " = " + addResult);
	}

	/**
	 * 숫자(정수)를 담는 변수 두개에 임의의 값을 할당하고 두 숫자 중에서 더 큰 숫자만 출력한다.
	 */
	public static void printBiggiestNumber() {

		int number1 = (int) (Math.random() * 10000);
		int number2 = (int) (Math.random() * 10000);

		if (number1 > number2) {
			System.out.println(number1 + "이 " + number2 + "보다 큽니다.");
		} else if (number2 > number1) {
			System.out.println(number2 + "이 " + number1 + "보다 큽니다.");
		} else {
			System.out.println(number1 + "와 " + number2 + "는 같습니다.");
		}

	}

	/**
	 * 숫자(정수)를 담는 변수 두개에 임의의 값을 할당하고 두 숫자를 뺐을 때 음수가 나오는 경우만 출력한다.
	 */
	public static void printNegativeNumber() {
		int number1 = (int) (Math.random() * 10000);
		int number2 = (int) (Math.random() * 10000);

		if (number1 > number2) {
			System.out.println(number2 - number1);
		} else if (number2 > number1) {
			System.out.println(number1 - number2);
		}
	}

	/**
	 * 1 부터 1000 까지의 숫자중에 소수(Prime Number: 자신과 1로만 나누어지는 수)를 찾아서 출력한다.
	 */
	public static void printPrimeNumbers() {
		for (int i = 1; i < 1001; i++) {
			boolean isPrimeNumber = true;

			for (int j = 1; j <= i; j++) {
				// 1과 자신의 수로는 나누지 않는다.
				if (j != 1 && j != i) {
					if (i % j == 0) {
						isPrimeNumber = false;
						break; // 소수 아님!
					}
				}
			}

			// j for 가 끝까지 반복을 했을 때, 0으로 나누어진 수가 존재했는가?
			if (isPrimeNumber) {
				System.out.println(i);
			}
		}

	}

	/**
	 * Method 클래스를 실행시키기 위한 특별한 메소드. 이 메소드는 JVM이 실행한다.
	 * 
	 * @param args - main 메소드를 실행할 때 필요한 인자(파라미터)
	 */
	public static void main(String[] args) {

		System.out.println("add 메소드를 호출하는 코드입니다.");
		add();
		add();

		printBiggiestNumber();
		printBiggiestNumber();

		printNegativeNumber();
		printNegativeNumber();

		printPrimeNumbers();
		printPrimeNumbers();

		printPowerNumber(10);
		printPowerNumber(30);
		printPowerNumber(55);

		// ( int number, int time, String message )
		printPowerNumberWithMessage(10, 10, "1. 결과는 ");
		printPowerNumberWithMessage(30, 20, "2. 결과는 ");
		printPowerNumberWithMessage(55, 100, "3. 결과는 ");
		
		int addResult = getAdditionResult();
		System.out.println(addResult);
		
		printNumbers();
		
		int number = getConditionalAdditionResult();
		System.out.println(number);
		
	}

}