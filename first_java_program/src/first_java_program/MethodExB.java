package first_java_program;

public class MethodExB {
	static int minutes = 5;
	static int seconds = 50;
	static int time = 0;
	
	static int processTime = 145;
	static int minutesA = 0;
	static int secondsA= 0;
	
	public static int timeA(int p) {
		int minutes = p / 60;
		return minutes;
	}

	public static int timeB(int p) {
		int seconds = p % 60;
		return seconds;
	}

	
	static int celsius = 30;
	static int fahrenheit = 0;
	
	static int korScore = 90;
	static int engScore = 88;
	static int mathScore = 70;
	static int progScore = 80;
	static int sum = 0;
	static int average = 0;
	
	static int money = (int) (Math.random() * 300_000) + 700_000;
	static int father = (int) (Math.random() * 50) + 30;
	static int mother = (int) (Math.random() * 50) + 30;
	static int kid = (int) (Math.random() * 30);
	
	

	public static int calculate(int m, int s) {
		int time = (m * 60) + s;
		return time;
	}

	public static double temp(int c, int f) {
		double fahrenheit = (c * 9.0 / 5) + 32;
		return fahrenheit;
	}

	public static String score(int k, int e, int m, int p, int s, int a) {
		s = k + e + m + p;
		a = s / 4;
		String grade;
		if (a >= 95) {
			grade = "A+";
		} else if (a >= 90) {
			grade = "A";
		} else if (a >= 85) {
			grade = "B+";
		} else if (a >= 80) {
			grade = "B";
		} else if (a >= 75) {
			grade = "C+";
		} else if (a >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
	}
	
	public static int tripAmount( int f, int m, int k) {
		int countAdult = 0;
		int countKid = 0;
		
		int adultOneWayFlightFare = (int) (Math.random() * 500_000) + 200_000;
		int kidOneWayFlightFare = (int) (Math.random() * 200000) + 100_000;

		if (f >= 19) {
			countAdult++;
		} else {
			countKid++;
		}

		if (m >= 19) {
			countAdult++;
		} else {
			countKid++;
		}

		if (k >= 19) {
			countAdult++;
		} else {
			countKid++;
		}
		
		int a = (adultOneWayFlightFare * countAdult) + (kidOneWayFlightFare + countKid);
		return a;
	}
	

	public static void main(String[] args) {


		int resultA = calculate(minutes, seconds);
		System.out.println(resultA);
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		System.out.println(timeA(processTime) + "시" + timeB(processTime) + "분");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");

	
		double resultB = temp(celsius, fahrenheit);
		System.out.println(resultB);
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");



		String result = score(korScore, engScore, mathScore, progScore, sum, average);
		System.out.println("점수는 " + result);
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		

		int resultC = tripAmount(father, mother, kid);	//가족 총합 예산 구하는 식만 메소드로 돌림
		
		if (resultC < money) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에 가자!");
		}
		

	}

}
