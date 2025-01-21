package first_java_program;

public class MethodExC {

	public static int sqrt(int n) {
		int result = (int) (Math.pow(n, 2));
		return result;
	}

	public static void printPowerNumberWithMessage(int number, int time, String message) {
		long result = 1;
		for (int i = 1; i <= time; i++) {
			result *= number;
		}
		System.out.println(message +" "+  result);

	}


	public static void main(String[] args) {
		int input = 10;
		System.out.println(sqrt(input));
		
		int a = 10, b = 10;
		String message = "hello";
		printPowerNumberWithMessage(a, b, message);
		printPowerNumberWithMessage(a+1, b+1, message);
		printPowerNumberWithMessage(a+2, b+2, message);
	}
}
