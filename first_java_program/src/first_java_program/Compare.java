package first_java_program;

public class Compare {

	public static void main(String[] args) {

		int a = 10;

		// a 가 10보다 큰 수 인가?
		boolean isGreateThan10 = a > 10;
		System.out.println(a + "는 10보다 큰가요? " + isGreateThan10);

		// a 가 20보다 작은 수 인가?
		boolean isLessThan20 = a < 20;
		System.out.println(a + "는 20보다 작은가요? " + isLessThan20);

		// a 가 10보다 크고 20보다 작은 수 인가?
		boolean isBetweenNumber = a > 10 && a < 20;
		System.out.println(a + "는 10보다 크고 20보다 작은 수 인가요? " + isBetweenNumber);

//		System.out.println((int) (Math.random() * 10) );
//		System.out.println((int) (Math.random() * 10) );
//		System.out.println((int) (Math.random() * 10) );
//		System.out.println((int) (Math.random() * 10) );

		int b = (int) (Math.random() * 10);

		// b 의 값이 짝수인가?
		boolean isEven = b % 2 == 0;
		System.out.println(b + "는 짝수인가요? " + isEven);

		// (int) (0.13123213213 * 6)
		int c = (int) (Math.random() * 6); // 0 ~ 5
		// c 의 값이 0보다 큰 짝수인가?
		// boolean isEvenGreateThan0 = c > 0 && c % 2 == 0;
		boolean isEvenGreateThan0 = c % 2 == 0 && c > 0;
		System.out.println(c + "는 0보다 큰 짝수인가요? " + isEvenGreateThan0);

		int d = (int) (Math.random() * 100); // 0 ~ 99
		// 2의 배수가 더 많기 때문에 2배수 비교를 앞에 배치
		boolean isMultiple2Or5 = d % 2 == 0 || d % 5 == 0;
		System.out.println(d + "는 2 또는 5의 배수인가요? " + isMultiple2Or5);

		int son = 7;
		int parent = 40;
//		boolean isAvailable = son >= 12 || parent >= 12;
		// 부모의 나이가 12세 이상일 확률이 높기 때문에 앞에 배치
		boolean isAvailable = parent >= 12 || son >= 12;
		System.out.println("영화 관람이 가능한가요? " + isAvailable);

		int e = (int) (Math.random() * 100);
		// 변수 e 의 값이 2 또는 3의 배수 이면서 50보다 큰가?
		boolean isNotPrimeNumberOver50 = e > 50 && (e % 2 == 0 || e % 3 == 0);
		System.out.println(e + "는 2 또는 3의 배수이면서 50보다 큰가요? " + isNotPrimeNumberOver50);

		int f = (int) (Math.random() * 1000);
		// 1. 변수 f 가 3의 배수가 아닌가? (!= 사용)
		boolean isNotMultiple3 = f % 3 != 0;
		System.out.println(f + "는 3의 배수가 아닌가요? " + isNotMultiple3);

		// 2. 변수 f 가 5의 배수가 아닌가? (not 사용)
		boolean isNotMultiple5 = !(f % 5 == 0);
		System.out.println(f + "는 5의 배수가 아닌가요? " + isNotMultiple5);

		// 3. 변수 f 가 7의 배수 혹은 9의 배수가 아닌가? (!= 사용)
		boolean isNotMultiple7Or9 = f % 7 != 0 || f % 9 != 0;
		System.out.println(f + "는 7 또는 9의 배수가 아닌가요? " + isNotMultiple7Or9);

		// 4. 변수 f 가 7의 배수 혹은 9의 배수가 아닌가? (not 사용)
		isNotMultiple7Or9 = !(f % 7 == 0 || f % 9 == 0);
		System.out.println(f + "는 7 또는 9의 배수가 아닌가요? " + isNotMultiple7Or9);
	}

}
