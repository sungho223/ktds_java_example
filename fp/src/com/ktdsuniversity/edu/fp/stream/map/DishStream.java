package com.ktdsuniversity.edu.fp.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.ktdsuniversity.edu.fp.stream.data.DishList;

public class DishStream {

	public void printStringToInteger() {
		List<String> numberStringList = List.of("100","2O0","5O","1O1","22");
		numberStringList.stream()
						.filter(str -> str.matches("^[0-9]+$"))
						.map( str -> Integer.parseInt(str) )
//						.peek( number -> System.out.println(number.getClass()))
						.forEach( number -> System.out.println(number) );
	}
	
	public void printStringAppendLowerCase() {
		System.out.println("=".repeat(100));
		
		List<String> letterList = new ArrayList<>();
		for(int i = 65; i < 91; i++) {
			letterList.add((char)i + "");
		}
		letterList.stream()
		          .map(str -> str + str.toLowerCase())
		          .forEach( string -> System.out.println(string));
	}
	
	public void printOddLetters() {
		System.out.println("=".repeat(100));
		
		List<String> letterList = new ArrayList<>();
		
		for(int i = 65; i < 91; i++) {
			letterList.add((char)i + ""); 
		}
//		String a = "A";
//		int ascii = a.charAt(0);
//		System.out.println(ascii);
//		
//		int num = 65;
//		String a2 = ((char)num) + "";
//		System.out.println(a2);
		
        letterList.stream()
        		  .map(str -> (int) str.charAt(0)) // char → int 변환
                  .filter(ascii -> ascii % 2 == 1) // 홀수 ASCII 값 필터링
                  .map(ascii -> (char) ascii.intValue()) // int -> char로 변환
                  .forEach(System.out::println); // 출력
		

	}
	
	public void printDishesType() {
		System.out.println("=".repeat(100));
		
		/*
		 * name         String
		 * vegetarian   boolean
		 * calories     int
		 * type         type
		 */
		
		// Stream<Dish> -> Stream<Type> -> 출력
		
		DishList.get().stream()
		          .map(dish -> dish.getType())
		          .forEach(System.out::print);
		
	}
	
	public void printDishesCalories() {
		DishList.get()
				.stream()
				.map(dish -> dish.getCalories() + " ")
				.forEach(System.out::print);
	}
	
	public void printDishesCaloriesDistinct() {
		DishList.get()
				.stream()
				.map( dish -> dish.getCalories())
				.distinct()
				.flatMap(cal -> DishList.get()
						                .stream()
						                .filter(dc -> dc.getCalories() == cal ))
				.forEach(System.out::print);
	}
	
	
	public void printDishesTypeDistinct() {
		DishList.get()
		        .stream()
		        .map(dish -> dish.getType())
		        .distinct()
		        .forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		
		ds.printDishesCaloriesDistinct();
		
//		ds.printOddLetters();
		
//		ds.printStringToInteger();
//		System.out.println(result);
//		
//		ds.printStringAppendLowerCase();
//		ds.printDishesType();
//		ds.printDishesCalories();
//		ds.printDishesCaloriesDistinct();
	}
}
