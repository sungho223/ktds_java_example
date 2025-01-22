package Student;

public class Student {

	int java;
	int python;
	int cpp;
	int csharp;

	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}

	public double getAverage() {
		double sum = getSumAllScores();
		return Math.round((sum / 4.0) * 100) / 100.0;
	}

	public double getCourseCredit() {
		double avg = getAverage();
		double cradit = Math.round(((avg - 55) / 10) * 100) / 100.0;
		return Math.abs(cradit);
	}

	public String getABCDF() {
		String grade = "";
		double cradit = getCourseCredit();
		if (cradit >= 4.1)
			grade = "A+";
		else if (cradit >= 3.6)
			grade = "A";
		else if (cradit >= 3.1)
			grade = "B+";
		else if (cradit >= 2.6)
			grade = "B";
		else if (cradit >= 1.6)
			grade = "C";
		else if (cradit >= 0.6)
			grade = "D";
		else
			grade = "F";

		return grade;
	}

}
