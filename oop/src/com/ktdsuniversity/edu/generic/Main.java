package com.ktdsuniversity.edu.generic;

import com.ktdsuniversity.edu.generic.ScoreArrayUseInterface.CalcAverage;
import com.ktdsuniversity.edu.generic.ScoreArrayUseInterface.CalcSum;

import student.Student;

public class Main {

	public static void main(String[] args) {

		ScoreArrayUseInterface<Integer> saui = new ScoreArrayUseInterface<>("A");
		for (int i = 0; i < 100; i++) {
			saui.add((int) (Math.random() * 101)); // int
		}

		int iSum = saui.sum(new CalcSum<Integer>() {
			@Override
			public Integer sum(Object[] arr, int size) {
				int sum = 0;
				for (int i = 0; i < size; i++) {
					sum += Integer.parseInt(arr[i].toString());
				}
				return sum;
			}
		});

		double iAverage = saui.average(new CalcAverage<Integer>() {
			@Override
			public double average(Integer sum, int size) {
				return sum / (double) size;
			}
		});

		System.out.println(iSum);
		System.out.println(iAverage);

		ScoreArrayUseInterface<String> ssaui = new ScoreArrayUseInterface<>("A");
		for (int i = 0; i < 100; i++) {
			ssaui.add((int) (Math.random() * 101) + ""); // int
		}

		String sSum = ssaui.sum((arr, size) -> {
			int tempSum = 0;
			for (int i = 0; i < size; i++) {
				tempSum += Integer.parseInt(arr[i].toString());
			}
			return tempSum + "";
		});

		double sAverage = ssaui.average((sum, size) -> Double.parseDouble(sum) / size);
		System.out.println(sSum);
		System.out.println(sAverage);

		ScoreArray<Integer> sa = new ScoreArray<>("ABC");
		for (int i = 0; i < 100; i++) {
			sa.add((int) (Math.random() * 101)); // int
		}

		Object[] intScoreArray = sa.getScoreArray();
		int intSize = sa.getSize();
		int sum = 0;
		for (int i = 0; i < intSize; i++) {
			sum += Integer.parseInt(intScoreArray[i].toString());
		}
		System.out.println(sum);

		double average = sum / (double) intSize;
		System.out.println(average);

		ScoreArray<String> sa2 = new ScoreArray<>("ABC");
		for (int i = 0; i < 100; i++) {
			sa2.add((int) (Math.random() * 101) + ""); // String
		}

		Object[] stringScoreArray = sa2.getScoreArray();
		int stringSize = sa2.getSize();
		int stringSum = 0;
		for (int i = 0; i < stringSize; i++) {
			stringSum += Integer.parseInt(stringScoreArray[i].toString());
		}
		System.out.println(stringSum);

		double stringAverage = stringSum / (double) stringSize;
		System.out.println(stringAverage);

		ScoreArray<Student> sa3 = new ScoreArray<>("ABC");
		for (int i = 0; i < 100; i++) {
			int score1 = (int) (Math.random() * 101);
			int score2 = (int) (Math.random() * 101);
			int score3 = (int) (Math.random() * 101);
			int score4 = (int) (Math.random() * 101);
			sa3.add(new Student(score1, score2, score3, score4)); // Student
		}

		Object[] studentScoreArray = sa3.getScoreArray();
		int studentSize = sa3.getSize();
		int studentSum = 0;
		for (int i = 0; i < studentSize; i++) {
			studentSum += ((Student) studentScoreArray[i]).getSumAllScores();
		}
		System.out.println(studentSum);

		double studentAverage = studentSum / (double) studentSize;
		System.out.println(studentAverage);

	}

}