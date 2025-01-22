package movie;

public class testCode {

	public static void addNum(int number) {
		number += 10;
		System.out.println(number);
	}
	
	public static void uppendName(String lastName) {
		lastName += " SUNGHO";
		System.out.println(lastName);
	}

	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		addNum(number);
		System.out.println(number);

		String name = "YOON";
		System.out.println(name);
		uppendName(name);
		System.out.println(name);
	}
}
