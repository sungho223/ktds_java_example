package com.ktdsuniversity.edu.fp.stream.filter;

import com.ktdsuniversity.edu.fp.stream.data.DishList;

public class DishStream {
	
	public void printVegetarian() {
		DishList.get()
		.stream()
		.filter( ed ->ed.getIsVegetarian() )
		.forEach( ed -> System.out.println(ed) );

/*
 * 1. .stream() 돼지고기 => vegetarian : false
 *    .filter() 돼지고기는 채식이냐?
 * 	  .forEach() 실행 안함
 * 
 * 2. .stream() 소고기 => vegetarian : false
 * 	  .filter() 소고기는 채식이냐? 
 *    .forEach() 실행 안함
 *    
 * 3. .stream() 치킨 => vegetarian : false
 * 	  .filter() 치킨은 채식이냐?
 * 	  .forEach() 실행 안함
 * 
 * 4. .stream() 프렌치 프라이 => vegetarian : false
 *    .filter() 프렌치 프라이는 채식이냐?
 *    .forEach() 실행함
 */
	}
	public void printLowCaloryVegetarian() {
		DishList.get()
				.stream()
				.filter(ed -> ed.getIsVegetarian())
				.filter(ed -> ed.getCalories() < 300)
//				.peek(ed -> System.out.println("under 300 calories : " + ed.getName()))
				.forEach(ed -> System.out.println(ed + "/" + ed.getCalories()));
	}

	public static void main(String[] args) {

		DishStream ds = new DishStream();
		ds.printVegetarian();
		ds.printLowCaloryVegetarian();
		
	}
}
