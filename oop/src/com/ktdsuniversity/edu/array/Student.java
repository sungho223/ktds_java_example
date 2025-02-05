package com.ktdsuniversity.edu.array;

public class Student {

	private int python;
	private int java;
	private int cpp;
	private int csharp;

	public Student(int python, int java, int cpp, int csharp) {
		this.python = python;
		this.java = java;
		this.cpp = cpp;
		this.csharp = csharp;
	}

	public int getSumAllScores() {
		return python + java + cpp + csharp;
	}

	public double getAverage() {
		return getSumAllScores() / 4.0;
	}

	public double getCourseCredit() {
		return (getAverage() - 55 / 10.0);
	}

	public String getABCD() {
		double average = getAverage(); 
		
		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else {
			return "D";
		}
	}

}
