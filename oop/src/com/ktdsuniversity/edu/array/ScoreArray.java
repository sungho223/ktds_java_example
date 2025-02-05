package com.ktdsuniversity.edu.array;

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);

//		int[] scoreArray1 = new int[7];
//		int scoreArray2[] = new int[7];

//		String[] scoreArray3 = {"Java","Python","CPP","JavaScrip"}; // <- 4개의 아이템을 가진 배열
//		int scoreArray4[] = {};

//		for(int i=0; i<scoreArray1.length; i++) {
//			scoreArray1[i] = sc.nextInt();
//		}

		int[] scoreArray = new int[7];
		scoreArray[0] = 50;
		scoreArray[1] = 70;
		scoreArray[2] = 65;
		scoreArray[3] = 95;
		scoreArray[4] = 55;
		scoreArray[5] = 70;
		scoreArray[6] = 40;

		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(i + " => " + scoreArray[i]);
		}
		System.out.println();

		int sum = 0;
		for (int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
		}
		System.out.println("합계: " + sum);

		double average = sum / (double) scoreArray.length;

		for (int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] += 5;
		}

	}
}
