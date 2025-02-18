package com.ktdsuniversity.edu.fp.stream.slice;

import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {
	
	public void printMenuSkip(int skipSize) {
		DishList.get()
				.stream()
				.skip(skipSize)
				.forEach(ed -> System.out.println(ed));
	}
	
	public void printMenuLimit(int limit) {
		DishList.get()
				.stream()
				.limit(limit)
				.forEach(ed -> System.out.println(ed));
	}
	
	public void printMenuLimitAndSkip(int limit, int skip) {
		// 치킨, 프렌치 프라이, 쌀밥 출력
		
		DishList.get()
				.stream()
				.limit(limit)
				.skip(skip)
				.forEach(ed -> System.out.print(ed + " "));
	}
	
	public void printMenuSkipAndLimit(int skip, int limit) {
		// 치킨, 프렌치프라이, 쌀밥, 계절과일, 피자, 새우 출력
		DishList.get()
		.stream()
		.skip(skip)
		.limit(limit)
		.forEach(ed -> System.out.print(ed + " "));
	}
	
	public void printMeat() {
		// 육류 음식만 가져온다.
		DishList.get()
				.stream()
				.filter(dish -> dish.getType() == Type.MEAT)
				.forEach(ed -> System.out.println(ed));
		
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		// 프렌치프라이, 쌀밥, 계절과일, 피자, 새우, 연어 출력
//		ds.printMenuSkip(3);
		
		// 돼지고기, 소고기, 치킨, 프렌치프라이 출력
//		ds.printMenuLimit(4);
		
		// 치킨, 프렌치프라이, 쌀밥 출력
//		ds.printMenuLimitAndSkip(5, 2);
		
		// 치킨, 프렌치프라이, 쌀밥, 계절과일, 피자, 새우 출력
//		ds.printMenuSkipAndLimit(2, 6);
		
		ds.printMeat();
	}

}
