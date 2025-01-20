package first_java_program;

public class WhileStatment {

	public static void main(String[] args) {

		System.out.println("while(n<10) 사용");
		int n = 0;
		while (n < 10) {
			n++;
			System.out.print(n);
		}
		System.out.println();
		System.out.println();

		System.out.println("while(true) 사용");
		int m = 0;
		while (true) {
			m++;
			System.out.print(m);
			
			if (m == 10)
				break;
		}
	}
}
