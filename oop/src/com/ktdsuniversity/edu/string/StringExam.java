package com.ktdsuniversity.edu.string;

import java.util.Scanner;

public class StringExam {

	public static void toUpper() {
		String name = "ktdsUniversity";
		String upperName = name.toUpperCase();
		System.out.println(upperName);
	}

	public static void toLower() {
		String name = "ktdsUniversity";
		String lowerName = name.toLowerCase();
		System.out.println(lowerName);
	}

	public static void contains() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println(isSeoul);
	}

	public static void endwith() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.endsWith("서울");
		System.out.println(isSeoul);
	}

	public static void equals() {
		String name = "ktdsUniversity";
		boolean isEqual = name.equals("ktdsUniversity");
		System.out.println(isEqual);
	}

	public static void equalsIgnoreCase() {
		String name = "ktdsuniversity";
		boolean isEqual = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println(isEqual);
	}

	public static void format() {
		String format = "%s에서 교육하는 %s과정";
		String str = String.format(format, "ktdsuniversity", "Java");
		System.out.println(str);
	}

	public static void formatted() {
		String format = "%s에서 교육하는 %s과정";
		String str = format.formatted("ktdsuniversity", "Java");
		System.out.println(str);
	}

	public static void indexOf() {
		String alphabets = "abcdefg";
		int letterCIndex = alphabets.indexOf('c');
		System.out.println(letterCIndex);

		letterCIndex = alphabets.indexOf('C');
		System.out.println(letterCIndex);

		int letterDEFIndex = alphabets.indexOf("def");
		System.out.println(letterDEFIndex);
	}

	public static void isBlank() {
		String str = "   ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
	}

	public static void isEmpty() {
		String str = "   ";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
	}

	public static void join() {
		String message = "안녕하세요";
		String name = "홍길동님";
		String helloMessage = String.join(", ", message, name);
		System.out.println(helloMessage);
	}

	public static void lastIndexOf() {
		String message = "abcdefgaijkb";
		int letterALastIndex = message.lastIndexOf("a");
		System.out.println(letterALastIndex);

		message = "abcdefgaijkb";
		int letterJJLastIndex = message.lastIndexOf("jj");
		System.out.println(letterJJLastIndex);

	}

	public static void length() {
		String message = "abcdefgaijkb";
		int length = message.length();
		System.out.println(length);
	}

	public static void maches() {
		String phone = "01012341234";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println(isNumber);
	}

	public static void replace() {
		String message = "안녕하세요, 홍길동님, 안녕히 가세요, 홍길동님.";
		message = message.replace("홍길동", "ktds");
		System.out.println(message);

		String phone = "010-1234-1234";
		phone = phone.replaceAll("[^0-9]", "");
		System.out.println(phone);
	}

	public static void split() {
		String phone = "010-1234-1234";
		String[] phoneArea = phone.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
	}

	public static void startwith() {
		String phone = "+82-010-1234-1234";
		boolean isKoreaNum = phone.startsWith("+82");
		System.out.println(isKoreaNum);
	}

	public static void subString() {
		String datetime = "2023-05-02 14:56:13";
		String year = datetime.substring(0, 4);
		System.out.println(year);

		datetime = "2023-05-02 14:56:13";
		String hour = datetime.substring(11, 13);
		System.out.println(hour);

		datetime = "2023-05-02 14:56:13";
		String time = datetime.substring(11);
		System.out.println(time);
	}

	public static void trim() {
		String datetime = "  2023-05-02 14:56:13  ";
		System.out.println(datetime.length());
		System.out.println(datetime);
		datetime = datetime.trim();
		System.out.println(datetime.length());
		System.out.println(datetime);
	}

	public static void overloaing() {
		String iStr = String.valueOf(1);
		System.out.println(iStr);
	}

	public static void printFileName() {
		// java에서 \ 는 escape code
		// 문자열 내부에서 표현할 수 없는 특수 문자들을 입력하기 위한 방법

		String escape = "My name is \"Yoon\" ";
		System.out.println(escape);
		System.out.println();

		// lastIndexOf, substring을 이용해 "eclipse.exe"만 출력
		String path = "C:\\devprograms\\eclipse-workspace\\eclipse.exe";
		String result1 = path.substring(path.lastIndexOf("eclipse.exe"));
		System.out.println(result1);
		System.out.println();

		// "eclipse.exe"에서 indexOf, substring을 이용해 "eclipse"만 출력
		String result2 = result1.substring(0, result1.indexOf(".exe"));
		System.out.println(result2);
		System.out.println();

		// "eclipse.copy.exe" 에서 indexOf, lastIndexOf, substring을 이용해 copy만 출력
		String eclipse_copy_exe = "eclipse.copy.exe";
		int range1 = eclipse_copy_exe.indexOf(".") + 1;
		int range2 = eclipse_copy_exe.lastIndexOf(".");
		String result3 = eclipse_copy_exe.substring(range1, range2);
		System.out.println(result3);

	}

	public static void firstWord() {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (true) {
			String first_workd = sc.next();
			if (first_workd.startsWith("나") && first_workd.trim().length() >= 2) {
				count++;
			} else {
				break;
			}
		}

		System.out.println("이어나간 단어의 수: " + count);
		sc.close();
	}

	public static void lastWord() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			String last_word = sc.next();
			if (last_word.endsWith("기") && last_word.trim().length() >= 2) {
				count++;
			} else {
				break;
			}
		}

		System.out.println("이어나간 단어의 수: " + count);
		sc.close();
	}

	public static void cycleLastWord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 단어를 입력해 주세요 >>");
		String firstWord = sc.next();
		System.out.println("==========================");
		String newWord = " ";
		int count = 0;
		while (true) {
			System.out.print("그 다음 단어를 입력해주세요 >>");
			newWord = sc.next().trim();

			if (newWord.startsWith(firstWord.substring(firstWord.length() - 1)) && newWord.length() >= 3) {
				count++;
				firstWord = newWord;
			} else {
				System.out.println("이어나간 단어의 수: " + count);
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {

	}
}
