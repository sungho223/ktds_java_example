package com.ktdsuniversity.edu.string;

public class StringExam {

	public static void printFileName() {

		// Java 에서 \ (백슬래쉬) 는 Escape Code.
		// 문자열 내부에서 표현할 수 없는 특수 문자들을 입력하기 위한 방법
//		String escape = "    My name is \"Min chang jang\" ";
//		System.out.println(escape);

//		escape = "    My name is 'Min chang jang' ";
//		System.out.println(escape);

//		escape = "    My\n name\t is 'Min chang\n     \r\t jang' ";
//		System.out.println(escape);

		String path = "C:\\devprograms\\eclipse-workspace\\eclipse.exe";
//		System.out.println(path);

		// lastIndexOf, substring 을 이용해 "eclipse.exe" 만 출력.
		int lastSlashIndex = path.lastIndexOf("\\");
		String fileName = path.substring(lastSlashIndex + 1);
		System.out.println("\"" + path + "\".substring(lastSlashIndex + 1); " + fileName);

		// "eclipse.exe"에서 indexOf, substring 을 이용해 "eclipse"만 출력
		int lastDotIndex = fileName.lastIndexOf(".");
		String fileNameWithoutExtension = fileName.substring(0, lastDotIndex);
		System.out.println("\"" + fileName + "\".substring(0, lastDotIndex + 1); " + fileNameWithoutExtension);

		// "eclipse.copy.exe" 에서 indexOf, lastIndexOf, substring 을 이용해 "copy" 만 출력.
		String copyName = "eclipse.copy.exe";
		int firstDotIndex = copyName.indexOf(".");
		lastDotIndex = copyName.lastIndexOf(".");
		String copy = copyName.substring(firstDotIndex + 1, lastDotIndex);
		System.out.println("\"" + copyName + "\".substring(firstDotIndex + 1, lastDotIndex); " + copy);
	}

	public static void toUpper() {
		String name = "ktdsUniversity";
		String upperName = name.toUpperCase();
		System.out.println("\"" + name + "\".toLowerCase(); " + upperName);
	}

	public static void toLower() {
		String name = "ktdsUniversity";
		String lowerName = name.toLowerCase();
		System.out.println("\"" + name + "\".toLowerCase(); " + lowerName);
	}

	public static void valueOf() {
		String intStr = String.valueOf(1) + 1;
		System.out.println("String.valueOf(1) + 1; " + intStr);
	}

	public static void trim() {
		String datetime = "     2023-05-02 14:56:13     ";
		System.out.println("before \"" + datetime + "\".trim(); '" + datetime + "'");

		datetime = datetime.trim();
		System.out.println("after \"     " + datetime + "     \".trim(); '" + datetime + "'");
	}

	public static void substring3() {
		String datetime = "2023-05-02 14:56:13";
		String time = datetime.substring(11);
		System.out.println("\"" + datetime + "\".substring(11); " + time);
	}

	public static void substring2() {
		String datetime = "2023-05-02 14:56:13";
		String hour = datetime.substring(11, 13);
		System.out.println("\"" + datetime + "\".substring(11, 13); " + hour);
	}

	public static void substring1() {
		String datetime = "2023-05-02 14:56:13";
		String year = datetime.substring(0, 4);
		System.out.println("\"" + datetime + "\".substring(0, 4); " + year);
	}

	public static void startsWith() {
		String phone = "+8210-1234-5678";
		boolean isKoreanNum = phone.startsWith("+82");
		System.out.println("\"" + phone + "\".startsWith(\"+82\"); " + isKoreanNum);
	}

	public static void split() {
		String phone = "010-1234-5678";
		String[] phoneArea = phone.split("-");
		System.out.println("\"" + phone + "\".split(\"-\");");
		System.out.println("split phoneArea[0]: " + phoneArea[0]);
		System.out.println("split phoneArea[1]: " + phoneArea[1]);
		System.out.println("split phoneArea[2]: " + phoneArea[2]);
	}

	public static void replaceAll() {
		String phone = "010-1234-1234";
		phone = phone.replaceAll("[^0-9]", "");
		System.out.println("\"010-1234-1234\".replaceAll(\"[^0-9]\", \"\"); " + phone);
	}

	public static void replace() {
		String message = "안녕하세요, 홍길동님, 안녕히가세요, 홍길동님.";
		message = message.replace("홍길동", "ktds");
		System.out.println("\"안녕하세요, 홍길동님, 안녕히가세요, 홍길동님.\".replace(\"홍길동\", \"ktds\"); " + message);
	}

	public static void matches() {
		String phone = "01012341234";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println("\"" + phone + "\".matches(\"^[0-9]+$\"); " + isNumber);

		phone = "01AA01234AA1234";
		isNumber = phone.matches("^[0-9]+$");
		System.out.println("\"" + phone + "\".matches(\"^[0-9]+$\"); " + isNumber);
	}

	public static void length() {
		String message = "abcdefgaijkb";
		int length = message.length();
		System.out.println("\"" + message + "\".length(); " + length);
	}

	public static void lastIndexOf2() {
		String message = "abcdefgaijkb";
		int letterJJLastIndex = message.lastIndexOf("jj");
		System.out.println("\"" + message + "\".lastIndexOf(\"jj\"); " + letterJJLastIndex);
	}

	public static void lastIndexOf1() {
		String message = "abcdefgaijkb";
		int letterALastIndex = message.lastIndexOf("a");
		System.out.println("\"" + message + "\".lastIndexOf(\"a\"); " + letterALastIndex);
	}

	public static void join() {
		String message = "안녕하세요";
		String name = "홍길동님";
		String helloMessage = String.join(", ", message, name);
		System.out.println("String.join(\", \", message, name); " + helloMessage);
	}

	public static void isEmpty() {
		String str = "     ";
		boolean isEmpty = str.isEmpty();
		System.out.println("\"" + str + "\".isEmpty(); " + isEmpty);
	}

	public static void isBlank() {
		String str = "     ";
		boolean isBlank = str.isBlank();
		System.out.println("\"" + str + "\".isBlank(); " + isBlank);
	}

	public static void indexOf3() {
		String alphas = "abcedefg";
		int letterDEFIndex = alphas.indexOf("def");
		System.out.println("\"" + alphas + "\".indexOf(\"def\"); " + letterDEFIndex);
	}

	public static void indexOf2() {
		String alphas = "abcedfg";
		int letterCIndex = alphas.indexOf("C");
		System.out.println("\"" + alphas + "\".indexOf(\"C\"); " + letterCIndex);
	}

	public static void indexOf1() {
		String alphas = "abcedfg";
		int letterCIndex = alphas.indexOf("c");
		System.out.println("\"" + alphas + "\".indexOf(\"c\"); " + letterCIndex);
	}

	public static void formatted() {
		String format = "%s에서 교육하는 %s 과정";
		String str = format.formatted("ktds university", "Java");
		System.out.println("\"" + format + "\".formatted(\"ktds university\", \"Java\"); " + str);
	}

	public static void format() {
		String format = "%s에서 교육하는 %s 과정";
		String str = String.format(format, "ktds university", "Java");
		System.out.println("String.format(format, \"ktds university\", \"Java\"); " + str);
	}

	public static void equalsIgnoreCase() {
		String name = "ktdsuniversity";
		boolean isEqualsIgnoreCase = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println("\"" + name + "\".equalsIgnoreCase(\"ktdsUniversity\"); " + isEqualsIgnoreCase);
	}

	public static void equals() {
		String name = "ktdsuniversity";
		boolean isEquals = name.equals("ktdsUniversity");
		System.out.println("\"" + name + "\".equals(\"ktdsUniversity\"); " + isEquals);
	}

	public static void endsWith() {
		String address = "서울특별시 서초구 효령로 176";
		boolean is176 = address.endsWith("176");
		System.out.println("\"" + address + "\".endsWith(\"176\"); " + is176);
	}

	public static void contains() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println("\"" + address + "\".contains(\"서울\"); " + isSeoul);
	}

	public static void main(String[] args) {
		toUpper();
		toLower();
		contains();
		endsWith();
		equals();
		equalsIgnoreCase();
		format();
		formatted();
		indexOf1();
		indexOf2();
		indexOf3();
		isBlank();
		isEmpty();
		join();
		lastIndexOf1();
		lastIndexOf2();
		length();
		matches();
		replace();
		replaceAll();
		split();
		startsWith();
		substring1();
		substring2();
		substring3();
		trim();
		valueOf();

		printFileName();
	}

}