package first_java_program;

import java.util.*;

public class UpDownWithWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quiz = (int) (Math.random() * 100); // 랜덥 값 지정
		int count = 0;							// 시도 횟수

		while (true) {
			System.out.print("숫자를 입력하세요: ");
			int inputNumber = sc.nextInt();
			if (quiz == inputNumber) {
				System.out.println();
				System.out.println("정답입니다");
				break;

			} else if (quiz > inputNumber) {  // 정답이 입력값보다 크다면 "Up" 출력
				System.out.println("Up");
				count++;

			} else {
				System.out.println("Down");   // 정답이 입력값보다 작다면 "Down" 출력
				count++;
			}
		}
		System.out.println();
		System.out.println("시도 횟수: " + count);
		System.out.println("정답: " + quiz);
	}
}
