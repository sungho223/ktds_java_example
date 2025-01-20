package first_java_program;

/*
 * 1. 1 부터 100 까지의 합을 구해 출력해보세요.
• 2. 1 부터 100 중 홀수의 합을 구해 출력해보세요.
• 3. 1 부터 100 중 3, 5, 6의 배수만 출력해보세요.
• 4. 아래 결과가 나오게 반복문을 작성해보세요.
 */
public class ForPractice {

	public static void main(String[] args) {
		int sumA = 0;
		for (int i = 1; i <= 100; i++) {
			sumA += i;
		}
		System.out.println(sumA);
		System.out.println("-------------------------------------");

		int sumB = 0;
		for (int i = 1; i <= 100; i += 2) {
			sumB += i;
		}
		System.out.println(sumB);
		System.out.println("-------------------------------------");

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-------------------------------------");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println("-------------------------------------");
		}

		for (int i = 1; i <= 5; i++) { // 1 2 3 4 5
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 1 2 3 4 5
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");

		for (int i = 5; i >= 1; i--) { // 5 4 3 2 1
			for (int j = 1; j <= i; j++) { // 1 2 3 4 5
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");

		for (int i = 1; i <= 5; i++) { // 1 2 3 4 5
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" "); // 공백 출력
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

		for (int i = 5; i >= 1; i--) { // 1 2 3 4 5
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" "); // 공백 출력
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

		for (int i = 1; i < 10; i += 2) {

			for (int j = 10; j > i; j -= 2) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

		for (int i = 1; i < 10; i += 2) {

			for (int j = 0; j < i; j += 2) {
				System.out.print(" ");
			}

			for (int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

	}
}
