package com.ktdsuniversity.edu.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void makeLottoNumbers() {

		// 로또 복권
		// 1 ~ 45 6개 찍기 (중복불가) --> 1게임 당 1000원
		// 내가 찍은 6개의 번호와 주관사가 랜덤하게 찍은 6개의 벊와 정확하게 일치하면 1등
		// 1등 당첨자가 적립금을 다 먹는 게임

		// 로또 번호 6개를 모아보기
		/*
		 * 시작: [0, 0, 0, 0, 0, 0] 
		 * 1. 1 ~ 45 중 랜덤하게 하나만 뽑기 -> 결과 37 
		 * => 1번의 결과: [37, 0, 0, 0, 0, 0]
		 * 
		 * 2. 1 ~ 45 중 랜덤하게 하나만 뽑기 => 결과 15 
		 * => 2번째의 결과: [37, 15, 0, 0, 0, 0]
		 * 
		 * 3. 나머지 배열의 6번째 값까지 이렇게 뽑는다 
		 * 4. 뽑은 숫자를 오름차순으로 정렬한다.
		 * 
		 * 단 숫자의 중복은 허용하지 않는다. 
		 */

		Random random = new Random();
		int[] lottoNumber = new int[6];
		
		for(int i=0; i<lottoNumber.length; i++) {
			lottoNumber[i] = random.nextInt(45) + 1;
			System.out.println(Arrays.toString(lottoNumber));
			
			for(int j=0; j<i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					System.out.println("중복된 값이 나왔습니다.");
					System.out.println("다시 뽑겠습니다.");
					i--;
					break;
				}
			}
		}
		System.out.println();
		
		System.out.println("최종 결과: " + Arrays.toString(lottoNumber));
		System.out.println();
		
		sortNumbers(lottoNumber);
	}

	public static void sortNumbers(int[] lottoNumbers) {
		
		for(int i = lottoNumbers.length-1; i>0 ;i--) {
			for(int j=0; j<i; j++) {
				if(lottoNumbers[j] > lottoNumbers[j+1]) {
					int temp = lottoNumbers[j];
					lottoNumbers[j] = lottoNumbers[j+1];
					lottoNumbers[j+1] = temp;
				}
			}
		}
		System.out.println("정렬된 값: " + Arrays.toString(lottoNumbers));

	}

	public static void main(String[] args) {
		makeLottoNumbers();
	}
}
