package com.ktdsuniversity.edu.fp.stream.collect.tolist;

import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {

	public List<String> getOtherDishes() {
			List<String> otherDish =  DishList.get()
					        .stream()
					        .filter( dish -> dish.getType() == Type.OTHER)
					        .map( dish -> dish.getName() )
					        .collect( Collectors.toList() )
					        ;
		        
		    return otherDish;
	}
	
	public List<Dish> getLowFatDishes() {
		// 400 kcal 이하의 음식의 이름들을 " - " 로 구분해서 하나의 문자열로 만든다.
		
		List<Dish> lowFat = DishList.get()
							        .stream()
							        .filter(dish -> dish.getCalories() <= 400)
//							        .map(dish -> dish.getName())
//							        .collect( Collectors.toList())
							        .toList() // since jdk16
							        ;
		return lowFat;
	}
	
	public List<Dish> getMenuWithOutFishType(){
		
		// Fish Type의 요리만 제외하고 모두 리스트로 변환해 반환
		
		List<Dish> menuWithOutFishType = DishList.get()
												 .stream()
												 .filter(dish -> dish.getType() != Type.FISH)
								                 .collect(Collectors.toList());
												 ;
		return menuWithOutFishType;
		
	}
	
	public List<String> getVegetableAndMeetMenu() {
	    return DishList.get()
	                   .stream()
	                   .filter(dish -> dish.getType() == Type.MEAT || dish.getIsVegetarian()) 
	                   .map(Dish::getName) 
	                   .collect(Collectors.toList());
	}

	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		
		List<String> names = ds.getOtherDishes();
//		System.out.println(names);
		names.forEach(System.out::print);
		System.out.println();

		
		List<Dish> lowFatNames = ds.getLowFatDishes();
		lowFatNames.forEach(dish -> {
			System.out.print(dish.getName() + " | ");
			System.out.print(dish.getCalories() + " | ");
			System.out.print(dish.getIsVegetarian() + " | ");
			System.out.print(dish.getType() + " | ");
			System.out.print("\n");
		});
		System.out.println("=".repeat(100));
//		System.out.println(ds.getLowFatDishes());
		
		List<Dish> menuWithOutFish = ds.getMenuWithOutFishType();
		menuWithOutFish.forEach(System.out::println);
		System.out.println("=".repeat(100));
		
		List<String> getVegetableAndFish = ds.getVegetableAndMeetMenu();
		getVegetableAndFish.forEach(System.out::println);
	}
}
