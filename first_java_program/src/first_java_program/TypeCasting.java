/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 형변환 공부 예제
 * */
package first_java_program;


/**
 * 묵시적 형변환 실습.
 */
public class TypeCasting {

	public static void main(String[] args) {
		
		// 1. int (4byte)  타입의 변수 정의 및 값 할당.
		int intNumber = Integer.MAX_VALUE;
		
		// 2. long (8byte)  타입의 변수 정의 및 값 할당.( int  타입의 값을 할당 )
		long longNumber = intNumber; // 아무런 문제 없이 할당. (묵시적 형변환: 작은 바이트에 큰 바이트로 자연스러운 이동)
		
		// 3. 각 변수들의 값을 출력.
		System.out.println(intNumber); // 2147483647
		System.out.println(longNumber); // 2147483647
		
		// ==========================================================
		
		// 반대 케이스 실습.
		// 1. long (8byte) 타입의 변수 정의 및 값 할당 (30억 이상의 값으로 할당)
		long longNumber2 = 3_000_000_000L;
		
		// 2. int (4byte) 타입의 변수 정의 및 값 할당 ( long 타입의 값을 할당 )
		// int intNumber2 = longNumber2; // 에러 발생! int 의 바이트가 부족해서 생기는 문제.
		// 묵시적 형변환이 불가능하므로, 개발자가 직접 형변환을 해주어야 한다.
		//    --> long 타입의 값을 int 타입으로 명시해서 변환이 필요 ==> 명시적 형변환.
		int intNumber2 = (int) longNumber2;
		
		// 3. 각 변수들의 값을 출력.
		System.out.println(longNumber2);
		System.out.println(intNumber2);
		
		
		System.out.println("==================");
		
		// ===========================================================
		// 실습: 정수 -> 부동소수점 (83슬라이드)
		long num = Long.MAX_VALUE;
		float fnum = num;
		double dnum = num;
		
		System.out.println(num);
		System.out.println(fnum);
		System.out.println(dnum);
		
		// 실습: 부동소수점 -> 정수 (84슬라이드)
		System.out.println("Float Number => Decimal");
		float fnum2 = 10.9f;
		int num2 = (int) fnum2;
		System.out.println(fnum2);
		System.out.println(num2);
		
		double dnum2 = 11.15;
		num2 = (int) dnum2;
		System.out.println(dnum2);
		System.out.println(num2);
		
		System.out.println(" 소수점 처리 ");
		// 실습: 부동소수점 소수점 처리 (85슬라이드)
		double dnum3 = 10.1;
		// 소수점 올림
		dnum3 = Math.ceil(dnum3);
		System.out.println(dnum3);
		
		// 소수점 버림
		dnum3 = 10.9;
		dnum3 = Math.floor(dnum3);
		System.out.println(dnum3);
		
		// 소수점 반올림
		dnum3 = 15.18;
		dnum3 = Math.round(dnum3);
		System.out.println(dnum3);
		
		dnum3 = 10.56;
		dnum3 = Math.round(dnum3);
		System.out.println(dnum3);
		
		System.out.println(" 소수점 이동시키기. ");
		// 실습: 부동소수점 소수점 올림처리 (86슬라이드)
		double dnum4 = 29.37;
		double dnum5 = dnum4 * 10;
		System.out.println(dnum5); // 293.7
		
		dnum5 = Math.round(dnum5); // 294.0
		System.out.println(dnum5);
		
		double dnum6 = dnum5 / 10; // 29.4
		System.out.println(dnum6);
		
		System.out.println(" 문자열 정수 변환");
		// 실습: 문자열 -> 정수 변환 (88슬라이드)
		String numberString = "100"; // -128 ~ 127
		byte byteNumber = Byte.parseByte(numberString);
		System.out.println(byteNumber);
		
		numberString = "10000";
		short shortNumber = Short.parseShort(numberString);
		System.out.println(shortNumber);
		
		numberString = "1000000";
		int intNumber3 = Integer.parseInt(numberString);
		System.out.println(intNumber3);
		
		numberString = "1000000000";
		long longNumber3 = Long.parseLong(numberString);
		System.out.println(longNumber3);
		
		// 실습: 문자열 -> 정수 오류 실습 (89슬라이드)
//		String numberString2 = "백만";
//		byte byteNumber2 = Byte.parseByte(numberString2);
//		System.out.println(byteNumber2);
		
//		String numberString3 = "10.5";
//		byte byteNumber3 = Byte.parseByte(numberString3);
//		System.out.println(byteNumber3);
		
		System.out.println(" 소수점 변환");
		// 실습: 문자열 -> 부동소수점 변환 (90슬라이드)
		String numberString4 = "10.666666666666";
		float floatNumber = Float.parseFloat(numberString4);
		System.out.println(floatNumber);
		
		numberString4 = "11.12345678901234567890"; // 소수점 이하 16자리 까지 지원.
		double doubleNumber = Double.parseDouble(numberString4);
		System.out.println(doubleNumber);
		
		numberString4 = "12";
		double doubleNumber2 = Double.parseDouble(numberString4); // 12.0
		System.out.println(doubleNumber2);
		
		// 실습: 문자열 -> 불린 변환 (91슬라이드 - 92슬라이드)
		String str = "true";
		boolean bool = Boolean.parseBoolean(str);
		System.out.println(bool);
		
		str = "TRUE";
		bool = Boolean.parseBoolean(str);
		System.out.println(bool);
		
		str = "tRue";
		bool = Boolean.parseBoolean(str);
		System.out.println(bool);
		
		String str2 = "false"; // true가 아니면 무조건 false 다.
		boolean bool2 = Boolean.parseBoolean(str2);
		System.out.println(bool2);
		
		str2 = "";
		bool2 = Boolean.parseBoolean(str2);
		System.out.println(bool2);
		
		str2 = "anystring";
		bool2 = Boolean.parseBoolean(str2);
		System.out.println(bool2);
		
		// 숫자를 문자로 변경하기
		// 1. 
		int age = 30;
		String ageString = String.valueOf(age);
		
		System.out.println(age + 1); // 31
		System.out.println(ageString + 1); // ? "301"
		
		// 2.
		int count = 16;
		String countString = count + "";
		System.out.println(count + 1); // 17
		System.out.println(countString + 1); // "161"
		
	}
	
}