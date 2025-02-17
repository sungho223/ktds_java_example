package com.ktdsuniversity.edu.fp.stream.basic;

import java.util.List;
import java.util.stream.Stream;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;

public class BasicStream {

	public void printMenuStream() {
		List<Dish> menuList = DishList.get();

		Stream<Dish> menuStream = menuList.stream();
		menuStream.forEach(eachDish -> System.out.println("in stream: " + eachDish));
		
		menuList.stream()
				.forEach(ed -> System.out.println("In Stream2 : " + ed));

	}

	public void printMenuNotStream() {
		List<Dish> menuList = DishList.get();

		for (Dish eachMenu : menuList) {
			System.out.println(eachMenu);
		}
	}

	public static void main(String[] args) {
		BasicStream bs = new BasicStream();
		bs.printMenuStream();
		bs.printMenuNotStream();
	}

}
