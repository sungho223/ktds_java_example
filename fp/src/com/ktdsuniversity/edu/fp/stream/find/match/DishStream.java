package com.ktdsuniversity.edu.fp.stream.find.match;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {
// 	모든 반환 타입은 boolean

	public void anyMatch() {
//	채식 요리가 하나라도 있는지 확인
		boolean hasVegetarian = DishList.get()
		                                .stream()
		                                .anyMatch( dish -> dish.getIsVegetarian());
		if(hasVegetarian) {
			System.out.println("채식 요리가 있는 식당입니다.");
			System.out.println();
		}
		
		
// 육류 요리 중에 칼로리가 300 미만인 것이 있는지 확인
		
		boolean hasMeetCalorisUnder300 = DishList.get()
				                             .stream()
				                             .filter(dish -> dish.getType() == Type.MEAT)
				                             .anyMatch(dish -> dish.getCalories() < 300);
		if(hasMeetCalorisUnder300) {
			System.out.println("저칼로리 육류 요리가 있습니다.");
			System.out.println();
		}

	}

	public void allMatch() {
//	모든 요리가 채식요리인지 확인해보자
		boolean isAllVege = DishList.get()
				                    .stream()
				                    .allMatch(dish -> dish.getIsVegetarian());
		if(isAllVege) {
			System.out.println("모든 요리가 채식입니다.");
			System.out.println();
		}

// 	모든 어류 요리의 칼로리가 500 미만인지 확인해보자
		
		boolean isAllFishLow = DishList.get()
				                       .stream()
				                       .filter(dish -> dish.getType() == Type.FISH)
				                       .allMatch(dish -> dish.getCalories() < 500);
		if(isAllFishLow) {
			System.out.println("모든 어류 요리의 칼로리가 500 미만입니다.");
			System.out.println();
		}

// 	모든 어류 요리의 칼로리가 500 이상인지 확인해보자
		boolean isAllFishHigh = DishList.get()
				                        .stream()
				                        .filter(dish -> dish.getType() == Type.FISH)
				                        .allMatch(dish -> dish.getCalories() >=500);
		if(isAllFishHigh) {
			System.out.println("모든 어류 요리의 칼로리가 500 이상입니다.");
		}
	}

	public void noneMatch() {
// 육류 요리 중에 채식요리가 없는지 확인해보자		
		boolean isMeetExist = DishList.get()
				                      .stream()
				                      .filter(dish -> dish.getType() == Type.MEAT)
				                      .noneMatch(dish -> dish.getIsVegetarian());
		if(isMeetExist) {
			System.out.println("육류 요리 중에 채식요리가 없습니다.");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		DishStream ds = new DishStream();

		ds.anyMatch();
		ds.allMatch();
		ds.noneMatch();
	}
}
