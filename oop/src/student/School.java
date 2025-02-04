package student;

public class School {

	public static void main(String[] args) {
		Student jang = new Student();
		jang.java = 100;
		jang.python = 97;
		jang.cpp = 81;
		jang.csharp = 99;
		
		int sum = jang.getSumAllScores();
		double average = jang.getAverage();
		double courseCredit = jang.getCourseCredit();
		String abcdf = jang.getABCDF();
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
		System.out.println("학점: " + courseCredit);
		System.out.println("등급: " + abcdf);
	}
	
}