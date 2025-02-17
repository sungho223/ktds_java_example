package com.ktdsuniversity.edu.fp.builtin;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExam {

	public static void main(String[] args) {

		Consumer<String> printFn = str -> {
			System.out.println(str);
		};
		
		

		printFn.accept("hello world");
		
		List<Integer> numberArray = List.of(1,2,3,4,5);
		numberArray.forEach((number)-> System.out.println("반복중입니다" + number));
	}
}
