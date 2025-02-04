package first_java_program;

public class IfStatementProblem1 {

	public static void main(String[] args) {
		
		int korScore = (int) (Math.random() * 101); // 0 ~ 100
		int engScore = (int) (Math.random() * 101); // 0 ~ 100
		int mathScore = (int) (Math.random() * 101); // 0 ~ 100
		int progScore = (int) (Math.random() * 101); // 0 ~ 100
		
		int sum = korScore + engScore + mathScore + progScore;
		int average = sum / 4;
		
		System.out.println("korScore: " + korScore);
		System.out.println("engScore: " + engScore);
		System.out.println("mathScore: " + mathScore);
		System.out.println("progScore: " + progScore);
		
		System.out.println("sum: " + sum);
		System.out.println("average: " + average);
		
		if (average >= 95) {
			System.out.println("A+");
		}
		else if (average >= 90) {
			System.out.println("A");
		}
		else if (average >= 85) {
			System.out.println("B+");
		}
		else if (average >= 80) {
			System.out.println("B");
		}
		else if (average >= 70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}
	
}