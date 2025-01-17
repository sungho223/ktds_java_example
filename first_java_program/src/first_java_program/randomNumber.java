package first_java_program;

import java.util.*;

public class randomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quiz = (int) (Math.random() * 100);
		int count = 0;

		while (true) {
			System.out.println("숫자를 입력하세요: ");
			int n = sc.nextInt();

			if (n < quiz) {
				System.out.println("UP");
				count++;
			} else if (n > quiz) {
				System.out.println("DOWN");
				count++;
			} else {
				System.out.println("Correct");
				break;
			}

		}
		System.out.println("정답: " + quiz);
		System.out.println("시도한 횟수: " + count);
		sc.close();

	}
}
