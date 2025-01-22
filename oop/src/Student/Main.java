package Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.java = (int) (Math.random() * 100 + 1);
		student.python = (int) (Math.random() * 100 + 1);
		student.cpp = (int) (Math.random() * 100 + 1);
		student.csharp = (int) (Math.random() * 100 + 1);

		System.out.println("java의 성적: " + student.java);
		System.out.println("python의 성적: " + student.python);
		System.out.println("c++의 성적: " + student.cpp);
		System.out.println("c#의 성적: " + student.csharp);
		System.out.println();

		System.out.println("4과목의 합계: " + student.getSumAllScores());
		System.out.println();

		System.out.println("4과목의 평균: " + student.getAverage());
		System.out.println();

		System.out.println("평균 학점 변환: " + student.getCourseCredit());
		System.out.println();

		System.out.println("평균 학점 변환(최종성적):" + student.getABCDF());
	}
}
