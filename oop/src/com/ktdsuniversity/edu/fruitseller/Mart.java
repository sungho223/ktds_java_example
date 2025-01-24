package com.ktdsuniversity.edu.fruitseller;

public class Mart {
	public static void main(String[] args) {
		FruitSeller fs = new FruitSeller(5000, 10);
		System.out.println(fs.getMoney());
		System.out.println(fs.getFruitStock());
			
		fs.sell(2);
		fs.sell(1);
		fs.sell(4);
		fs.sell(1);
		
		System.out.println();
		System.out.println(fs.getMoney());
		System.out.println(fs.getFruitStock());
		
	}
}
