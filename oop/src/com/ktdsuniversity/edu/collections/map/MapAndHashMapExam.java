package com.ktdsuniversity.edu.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapAndHashMapExam {
	public static void main(String[] args) {

		Map<String, Integer> priceMap = new HashMap<>();
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		System.out.println("==================================");

		priceMap.put("LG Gram", 1_800_000);
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		System.out.println("==================================");

		
		int applePrice = priceMap.get("Apple Macbook Pro");
		System.out.println(applePrice);
		System.out.println("==================================");

		priceMap.remove("Apple Macbook Pro");
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		System.out.println("==================================");

		priceMap.clear();
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		System.out.println("==================================");

		boolean isEmpty = priceMap.isEmpty();
		System.out.println(isEmpty);
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		System.out.println("==================================");

		
		boolean isContainKey = priceMap.containsKey("LG Gram");
		System.out.println(isContainKey);
		
		boolean isContainValue = priceMap.containsValue(1500000);
		System.out.println(isContainValue);
		System.out.println("==================================");

		
		Map<String, Integer> priceMap2 = new HashMap<>();
		priceMap2.putAll(priceMap2);
		System.out.println(System.identityHashCode(priceMap));
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		System.out.println(System.identityHashCode(priceMap2));
		System.out.println(priceMap2);
		System.out.println(priceMap2.size());

		
		
	}
}
