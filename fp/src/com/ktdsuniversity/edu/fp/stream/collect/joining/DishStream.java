package com.ktdsuniversity.edu.fp.stream.collect.joining;

import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {

	public String getOtherDishes() {
			return DishList.get()
					        .stream()
					        .filter( dish -> dish.getType() == Type.OTHER)
					        .map( dish -> dish.getName() )
					        .collect( Collectors.joining(",") );
		        
		        
	}
	
	public String getLowFatDishes() {
		// 400 kcal 이하의 음식의 이름들을 " - " 로 구분해서 하나의 문자열로 만든다.
		
		return DishList.get()
				       .stream()
				       .filter(dish -> dish.getCalories() <= 400)
				       .map(dish -> dish.getName())
				       .collect( Collectors.joining(" - "))
				       ;
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		
		System.out.println(ds.getOtherDishes());
		System.out.println();
		
		System.out.println(ds.getLowFatDishes());
	}
}
