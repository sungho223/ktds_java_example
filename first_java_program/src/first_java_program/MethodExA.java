package first_java_program;

public class MethodExA {
	public static void sumA() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("---------------------------------");
	}

	public static void sumB() {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("---------------------------------");

	}

	public static void filter() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("---------------------------------");

	}

	public static void starA() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------");

	}

	public static void twoNumber() {
		int n = (int) (Math.random() * 100);
		int m = (int) (Math.random() * 100);

		int valueA = Math.max(n, m);
		System.out.println("더 큰 값 " + valueA);
		System.out.println("n의 값: " + n);
		System.out.println("m의 값: " + m);
		System.out.println("---------------------------------");
	}

	public static void compareNum() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		if (a - b < 0) {
			System.out.println("a의 값은 " + a);
			System.out.println("b의 값은 " + b);
			System.out.println("두 수의 차는" + Math.abs(a - b));
		}
	}

	public static void main(String[] args) {
//		sumA();
//		sumB();
//		filter();
//		starA();
//		twoNumber();
//		compareNum();

//		int limit = 1000; // 1부터 1000까지
//		for (int i = 1; i <= limit; i++) {
//			if (isPrime2(i)) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
		
		isPrime3();

	}

	public static boolean isPrime2(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	

	public static void isPrime3() {
		for (int i = 1; i < 1001; i++) {
			boolean isPrimeNumber = true;
			for (int j = 1; j <= i; j++) {
				if (j != 1 && j != i) {
					if (i % j == 0) {
						isPrimeNumber = false;
						break;
					}
				}
			}
			if (isPrimeNumber == true) {
				System.out.println(i);
			}
		}
	}

}
