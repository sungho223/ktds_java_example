package com.ktdsuniversity.edu.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashSetExam {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		for (int n : numbers) {
			System.out.println(n);
		}

		numbers.remove(30);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		numbers.clear();
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		boolean isEmpty = numbers.isEmpty();
		System.out.println(isEmpty);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		numbers.clear();
		isEmpty = numbers.isEmpty();
		System.out.println(isEmpty);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		if (!numbers.contains(20)) {
			numbers.add(20);
		}
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		Set<Integer> numbers2 = new HashSet<>();
		numbers2.addAll(numbers);
		System.out.println(System.identityHashCode(numbers));
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("============================");

		System.out.println(System.identityHashCode(numbers2));
		System.out.println(numbers2);
		System.out.println(numbers2.size());

	}

}
