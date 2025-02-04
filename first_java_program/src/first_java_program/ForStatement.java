package first_java_program;

public class ForStatement {

	public static void main(String[] args) {
		// 1. 1 부터 10 까지를 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// 2. 1 부터 10 사이에 있는 홀수만 출력하기.
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}

		// 3. 2 부터 100_000 사이에 있는 짝수만 출력하기.
		for (int i = 2; i <= 100_000; i += 2) {
			System.out.println(i);
		}

		// *****
		System.out.print("*"); // 줄 바꿈 없이 출력하기
		System.out.print("*"); // 줄 바꿈 없이 출력하기
		System.out.print("*"); // 줄 바꿈 없이 출력하기
		System.out.print("*"); // 줄 바꿈 없이 출력하기
		System.out.print("*"); // 줄 바꿈 없이 출력하기

		System.out.println(); // 아무것도 출력하지 않고 줄바꿈만 하기

		// ***
		// *
		System.out.print("*"); // 줄 바꿈 없이 출력하기
		System.out.print("*"); // 줄 바꿈 없이 출력하기
		System.out.println("*"); // 출력하고 줄바꿈 하기
		System.out.println("*"); // 출력하고 줄바꿈 하기

		// 1. 1 부터 100 까지의 합을 구해 출력해보세요.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1번 문제 답: " + sum);

		// 2. 1부터 100 중 홀수의 합을 구해 출력해보세요.
		int sum2 = 0;
		for (int i = 1; i < 101; i += 2) {
			sum2 += i;
		}
		System.out.println("2번 문제 답: " + sum2);

		int sum5 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				sum5 += i;
			}
		}
		System.out.println("2번 문제 답: " + sum5);

		// 3. 1 부터 100 중 3, 5, 6의 배수만 출력해보세요.
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println("3번 문제 답: " + i);
			}
		}

		// 4. 별표 그리기
		System.out.println("4번 문제 답");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			if (i < 5) {
				System.out.println();
			}
		}

		System.out.println();
		// 5. 별도 문제.
		// Case 1. 자리수마다 더하기.
		int num = 7237;
		// num 이 몇 번째 자리까지 있나? ==> 10을 몇 번 제곱해야 num 이 되나?
		int length = (int) Math.log10(num) + 1;
		int sum3 = 0;
		// num 의 자리수만큼 반복하며 더한다.
		for (int i = 0; i < length; i++) {
			int n = num % 10;
			sum3 += n;
			num /= 10;
		}
		System.out.println("모든 자리를 더하면 " + sum3 + " 입니다.");

		// Case 2. 자리수마다 더하기 (문자열로)
		num = 7237;
		// 숫자를 문자열로 바꾼다.
		// 문자열 한글자 한글자를 더하기 위해서.
		String numStr = num + "";
		int sum4 = 0;
		for (char n : numStr.toCharArray()) {
			sum4 += Integer.parseInt(n + "");
		}
		System.out.println("모든 자리를 더하면 " + sum4 + " 입니다.");

	}

}
