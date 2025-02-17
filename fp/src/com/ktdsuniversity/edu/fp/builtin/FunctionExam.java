package com.ktdsuniversity.edu.fp.builtin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

/** 
 * input data로 "안녕하세요" 주면
 * 안녕하세요" 가 아웃풋 함수 나오기
 */
public class FunctionExam {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		
//		Function<String, String> concat = str -> str.concat("?") ;
//		String result = concat.apply(s);
//		System.out.println(result);
		
		
		// 안녕하세요, 지금은 함수형프로그래밍을 배우고 있습니다. -> 던지면 30이 나오도록
		// 반갑습니다. 안녕하세요? -> 13
		// 문자열을 보내면 정수형으로 문자열의 길이를 반환하는 함수 만들기
		
		
		String s2 = sc.nextLine();
		Function<String, char[]> changeToNum = str -> str.toCharArray();
		char[] cNum = changeToNum.apply(s2);
		System.out.println(cNum.length);
		
		String s3 = sc.nextLine();
		Function<String, String[]> split =  str -> str.split(" ");
		String[] sResult = split.apply(s3);
		System.out.println(Arrays.toString(sResult));
		
		Map<String, Integer> valueMap = new HashMap<>();
		valueMap.put("A", (int) 'A');
		System.out.println(valueMap);
		

		sc.close();
	}

}
