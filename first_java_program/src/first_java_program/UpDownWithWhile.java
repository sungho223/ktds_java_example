package first_java_program;

import java.util.*;

public class UpDownWithWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quiz = (int) (Math.random() * 100); // 랜덥 값 지정
		int count = 0; // 시도 횟수
		final int MAX_TRIES = 3; // 최대 시도 횟수

		while (count < MAX_TRIES) {
			System.out.print("숫자를 입력하세요: ");
			int inputNumber = sc.nextInt();
			count++;

			if (quiz == inputNumber) {
				System.out.println("\n정답입니다");
				break;
				
			} else if (quiz > inputNumber) { // 정답이 입력값보다 크다면 "Up" 출력
				System.out.println("Up");
				
			} else {
				System.out.println("Down"); // 정답이 입력값보다 작다면 "Down" 출력
				
			}

			if (count == MAX_TRIES && inputNumber != quiz) {
				System.out.println("\n기회를 모두 소진했습니다.");
			}

		}
		System.out.println();
		System.out.println("시도 횟수: " + count);
		System.out.println("정답: " + quiz);

	}
}
