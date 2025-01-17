package first_java_program;

public class Compare {
	public static void main(String[] args) {
		int n = 15;

		boolean compaerA = n > 10;
		System.out.println("입력값은 10보다 큰가요?" + compaerA);

		boolean compareB = n < 20;
		System.out.println("입력값은 10보다 작은가요?" + compareB);

		boolean compareC = (n > 10) && (n < 20);
		System.out.println("입력값 " + n + " 은 10보다 크고 20보다 작은수인가요? " + compareC);

		System.out.println();

		double m = (int) (Math.random() * 100);
		if (m % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

		System.out.println(m);

		System.out.println();

		double z = (int) (Math.random() * 100);
		boolean isEven = m % 2 == 0;
		System.out.println("난수는 짝수인가요? " + isEven);
		System.out.println(z);

		System.out.println();

		int c = (int) (Math.random() * 6);
		// c 의 값이 0보다 큰 짝수인가
		boolean isEvenBiggerThanZero = c > 0 && c % 2 == 0;
		System.out.println("C는 0보다 큰 수인가요? " + isEvenBiggerThanZero);
		System.out.println(c);
		System.out.println();

		int d = 35;
		boolean isMultiple20r5 = (d % 2 == 0) || (d % 5 == 0);
		System.out.println("2 또는 5의 배수인가요 " + isMultiple20r5);
		System.out.println();

		int kid = 7;
		int parent = 50;
		boolean isAvailable = (kid >= 12) || (parent >= 12);
		System.out.println("영화 관람이 가능한가요? " + isAvailable);
		System.out.println();

		// 변수 e의 값이 2 또는 3의 배수이면서 50보다 클까?
		int e = (int) (Math.random() * 1000);
		boolean checkTruth = (e % 2 == 0 || e % 3 == 0) && (e > 50);
		System.out.println(checkTruth);
		System.out.println(e);
		System.out.println();

		int f = (int) (Math.random() * 100);
		System.out.println(f);
		// 1. 변수가 3의 배수가 아닌가 != 확인
		boolean firstCheck = (f % 3 != 0);
		System.out.println(firstCheck);

		// 2. 변수가 5의 배수가 아닌가 not 사용
		boolean secondcheck = !(f % 5 == 0);
		System.out.println(secondcheck);

		// 3. 변수가 7의 배수 혹은 9의 배수가 아닌가 확인 != 사용
		boolean thirdCheck = (f % 7 != 0 || f % 9 != 0);
		System.out.println(thirdCheck);

		// 4. 변수가 7의 배수 혹은 9의 배수가 아닌가 확인 not 사용
		boolean forthCheck = !(f % 7 == 0 || f % 9 == 0);
		System.out.println(forthCheck);

	}
}
