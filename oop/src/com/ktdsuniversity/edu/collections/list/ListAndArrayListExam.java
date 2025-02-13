package com.ktdsuniversity.edu.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayListExam {

	public static void main(String[] args) {

		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(80);
		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println("=============================");

		int score = scoreList.get(0);
		System.out.println(score); // 100
		score = scoreList.get(1);
		System.out.println(score); // 90

		System.out.println("=============================");

		for (int i = 0; i < scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);
		}

		System.out.println("=============================");

		scoreList.remove(3);
		System.out.println(scoreList);
		System.out.println("=============================");

		scoreList.clear();
		System.out.println(scoreList);
		System.out.println("=============================");

		System.out.println(scoreList.isEmpty());

		System.out.println(scoreList.contains(100));
		System.out.println("=============================");

		List<Integer> scoreListt = new ArrayList<>();
		scoreListt.add(100);
		scoreListt.add(90);
		scoreListt.add(80);
		scoreListt.add(95);
		
		List<Integer> scoreListtt = new ArrayList<>();
		scoreListtt.addAll(scoreList);
		
		// 객체 고유 값 (메모리 주소)
		System.out.println(System.identityHashCode(scoreListtt));
		System.out.println(scoreListtt);
		System.out.println(scoreListtt.size());
		System.out.println("=============================");
		
		// 객체 고유 값 (메모리 주소)
		System.out.println(System.identityHashCode(scoreListtt));
		System.out.println(scoreListtt);
		System.out.println(scoreListtt.size());
		
		System.out.println("=============================");
		List<Integer> readOnlyList = List.of(1,2,3,4,5);
		System.out.println(readOnlyList);
		System.out.println(readOnlyList.size());
		System.out.println("=============================");
		
//		readOnlyList.add(5);
		int[] array = {1,2,3,4,5};
		for(int arr : array) {
			System.out.println(arr);
		}
		

	}
}
