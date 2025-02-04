package first_java_program;

public class MethodExam {

	/**
	 * 168 - 1
	 */
	public static void printSumTo100() {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	/**
	 * 168 - 2
	 */
	public static void printSumOdds() {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	/**
	 * 168 - 3
	 */
	public static void printTimesNumber() {
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * 168 - 4
	 */
	public static void printAsters() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 172
	 * @param minutes
	 * @param seconds
	 * @return
	 */
	public static int getSeconds(int minutes, int seconds) {
		int amountSeconds = minutes * 60 + seconds;
		return amountSeconds;
	}
	
	/**
	 * 173
	 * @param processTime
	 * @return
	 */
	public static int getMinutes(int processTime) {
		return processTime / 60;
	}
	
	/**
	 * 173
	 * @param processTime
	 * @return
	 */
	public static int getRemainSeconds(int processTime) {
		return processTime % 60;
	}
	
	/**
	 * 174
	 * @param celsius
	 * @return
	 */
	public static int convertCelsiusToFahrenheit(int celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	/**
	 * 175
	 * @param kor
	 * @param eng
	 * @param math
	 * @param prog
	 * @return
	 */
	public static int getSumAllSubjects(int kor, int eng, int math, int prog) {
		return kor + eng + math + prog;
	}
	
	/**
	 * 175
	 * @param sumScore
	 * @param subjectCount
	 * @return
	 */
	public static int getAverage(int sumScore, int subjectCount) {
		return sumScore / subjectCount;
	}
	
	/**
	 * 175
	 * @param average
	 * @return
	 */
	public static String getGrade(int average) {
		
		if (average >= 95) {
			return "A+";
		}
		else if (average >= 90) {
			return "A";
		}
		else if (average >= 85) {
			return "B+";
		}
		else if (average >= 80) {
			return "B";
		}
		else if (average >= 70) {
			return "C";
		}
		else {
			return "F";
		}
	}
	
	/**
	 * 176
	 * @param age
	 * @return
	 */
	public static int getFlightFee(int age) {
		if (age >= 19) {
			return 300_000;
		}
		
		return 120_000;
	}
	
	public static void main(String[] args) {
		printSumTo100();
		printSumOdds();
		printTimesNumber();
		printAsters();
		
		int seconds = getSeconds(5, 50);
		System.out.println(seconds);
		
		int minutes = getMinutes(145);
		int remainSeconds = getRemainSeconds(145);
		System.out.println(minutes);
		System.out.println(remainSeconds);
		
		int fahrenheit = convertCelsiusToFahrenheit(30);
		System.out.println(fahrenheit);
		
		int sumScores = getSumAllSubjects(90, 88, 70, 80);
		int average = getAverage(sumScores, 4);
		String grade = getGrade(average);
		System.out.println("Sum: " + sumScores);
		System.out.println("Average: " + average);
		System.out.println("Grade: " + grade);
		
		
		int money = 1_000_000;
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int flightFee = getFlightFee(father);
		flightFee += getFlightFee(mother);
		flightFee += getFlightFee(daughter);
		
		if (money >= flightFee) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자");
		}
		
	}
}