package com.ktdsuniversity.edu.fp.stream.find.find;

import java.util.Optional;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {
	
	public void findAnyFood() {
//	육류 고기 중 4개 음식은 건너띄고 5개를 가져와서
//  그 중 아무 음식만 가져온다. 
		
		Optional<Dish> anyDish = 
				DishList.get()
						.stream()
						.filter(dish -> dish.getType() == Type.MEAT)
						.skip(4)
						.limit(5)
						.findAny();
		System.out.println(anyDish); // Optional.empty
		
		Optional<Dish> anyMatch =
				DishList.get()
						.stream()
						.findAny();
		System.out.println(anyMatch); // Optional[돼지고기]
		System.out.println(anyMatch.get().getName()); // 돼지고기
		
		// 데이터가 없을 때 이렇게 하라는 가이드 라인
		if(anyDish.isPresent()) {
			String anyDishName = anyDish.get().getName(); // 데이터 없음			
			System.out.println(anyDishName);              // 그래서 오류 출력
		}
		
		// 데이터가 없으면 기본값으로 출력하는 가이드 라인
		Dish anyDishOrDefault = anyDish.orElse(new Dish("nothing selected",false, 0, null));
		System.out.println(anyDishOrDefault.getName());
		
		
		//실무 가이드 라인
		Dish anyDishInWork = 
				DishList.get()
				        .stream()
				        .filter(dish -> dish.getType() == Type.MEAT)
				        .skip(4)
				        .limit(5)
				        .findAny()
				        .orElse(null)
				        ;
		
		if(anyDishInWork != null) System.out.println(anyDishInWork);
		
		
	}
	
	public void findFirstFood() {
		Dish firstDish = 
			DishList.get()
			        .stream()
			        .findFirst()
			        .orElse(null)
			        ;
		System.out.println(firstDish);
	}
	
	public static void main(String[]args) {
		DishStream ds = new DishStream();
		
		ds.findAnyFood();
		ds.findFirstFood();
	
	}

}
