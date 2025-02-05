package com.ktdsuniversity.edu.string;

import java.util.Scanner;

public class StringBufferEx {

	public static void cycleLastWord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 단어를 입력해 주세요 >>");
		String firstWord = sc.next();
		System.out.println("==========================");
		String newWord = " ";
		int count = 0;
		StringBuffer sb = new StringBuffer();
		String resultWord = "";
		while (true) {
			System.out.print("그 다음 단어를 입력해주세요 >>");
			newWord = sc.next().trim();

			if (newWord.startsWith(firstWord.substring(firstWord.length() - 1)) && newWord.length() >= 3) {

				count++;
				firstWord = newWord;

				sb.append(newWord + " ");
				resultWord = sb.toString();

			} else {
				System.out.println(resultWord);
				System.out.println("이어나간 단어의 수: " + count);
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
		sc.close();
	}
	
	

	public static void main(String[] args) {
		cycleLastWord();
	}
}
