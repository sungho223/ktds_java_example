package student;

public class Student {

	int java;
	int python;
	int cpp;
	int csharp;

	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}

	public Student() {
	}

	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}

	public double getAverage() {
		// getSumAllScores() / 4.0 => 12.23431212
		// getSumAllScores() / 4.0 => 12.23431212 => 1223
		int average = (int) (getSumAllScores() / 4.0 * 100);
		return average / 100.0; // 12.23
	}

	public double getCourseCredit() {
		int courseCredit = (int) ((getAverage() - 55) / 10.0 * 100);
		return courseCredit / 100.0; // 0.5
	}

	public String getABCDF() {
		double courseCredit = getCourseCredit();

		if (courseCredit >= 4.1) {
			return "A+";
		} else if (courseCredit >= 3.6) {
			return "A";
		} else if (courseCredit >= 3.1) {
			return "B+";
		} else if (courseCredit >= 2.6) {
			return "B";
		} else if (courseCredit >= 1.6) {
			return "C";
		} else if (courseCredit >= 0.6) {
			return "D";
		} else {
			return "F";
		}
	}

}