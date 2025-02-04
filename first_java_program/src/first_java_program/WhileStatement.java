package first_java_program;

public class WhileStatement {

	public static void main(String[] args) {

		// 1. 1 부터 10까지 출력하자.
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

		// 2. 1 부터 10까지 출력하자. (++이용)
		System.out.println("++이용해서 출력하기");
		int number = 0;
		System.out.println(++number); // 1
		System.out.println(++number); // 2
		System.out.println(++number); // 3
		System.out.println(++number); // 4
		System.out.println(++number); // 5
		System.out.println(++number); // 6
		System.out.println(++number); // 7
		System.out.println(++number); // 8
		System.out.println(++number); // 9
		System.out.println(++number); // 10

		// 3. 1 부터 10까지 출력하자. (while 이용)
		System.out.println("while  이용");
		int counter = 0;
		while (counter < 99) {
			System.out.println(++counter);
		}

		// 3. 1 부터 10까지 출력하자. (무한반복 이용)

		System.out.println("출력이 시작됩니다.");

		int numbers = 0;
		while (true) {
			System.out.println(++numbers);
			// 종료 조건 명시.(반드시!!!)
			if (numbers >= 10) {
				// 무한반복 종료.
				break;
			}
		}

		System.out.println("출력이 끝났습니다.");
	}

}