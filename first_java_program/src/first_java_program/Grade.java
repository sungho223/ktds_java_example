package first_java_program;

public class Grade {

	public static void main(String[] args) {
		int korScore = (int) (Math.random() * 100);
		int engScore = (int) (Math.random() * 100);
		int mathScore = (int) (Math.random() * 100);
		int progScore = (int) (Math.random() * 100);

		System.out.println("국어 성적: " + korScore);
		System.out.println("영어 성적: " + engScore);
		System.out.println("수학 성적: " + mathScore);
		System.out.println("프로그램 성적: " + progScore);
		int sum = 0;
		double average = 0;

		sum = korScore + engScore + mathScore + progScore;
		average = sum / 4.0;

		if (average >= 95)
			System.out.println("성적평균: A+");
		else if (sum >= 90)
			System.out.println("성적평균: A");
		else if (sum >= 85)
			System.out.println("성적평균: B+");
		else if (sum >= 80)
			System.out.println("성적평균: B");
		else if (sum >= 75)
			System.out.println("성적평균: C+");
		else if (sum >= 70)
			System.out.println("성적평균: C");
		else
			System.out.println("성적평균: F");
	}
}
