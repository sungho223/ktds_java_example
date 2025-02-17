package com.ktdsuniversity.edu.fp.builtin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateExam {

	public static void main(String[] args) {

		Predicate<Integer> isOdd = (number) -> number % 2 == 1;
		boolean result = isOdd.test(12);
		System.out.println("홀수 인가요??  " + result);

		List<Integer> numberArray = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numberArray);

		numberArray.removeIf((element) -> element <= 5);
		System.out.println(numberArray);
		

	}
}
