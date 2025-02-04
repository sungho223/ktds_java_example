/*
 * 2025년 01월 15일
 * kt ds 교육 1일차
 * 변수 타입 공부 예제
 * */

package first_java_program;


import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		System.out.println( Byte.MAX_VALUE );
		System.out.println( Byte.MAX_VALUE + 1 );
		
		byte byteNumberVariable = Byte.MAX_VALUE;
		byteNumberVariable = (byte) (byteNumberVariable + 1);
		System.out.println(byteNumberVariable);
				
		int intNumberVariable;
		intNumberVariable = 50;
		System.out.println(intNumberVariable);
		
		double doubleNumberVariable = 3.14;
		System.out.println(doubleNumberVariable);
		
		float floatNumberVariable = 3.14F;
		
		
		
		
		byte firstNumber = 10;
		byte secondNumber = 11;
		byte thirdNumber = (byte) (firstNumber + secondNumber);
		System.out.println(thirdNumber);
	
		long hugeNumber = 3_000_000_000L;
		
		boolean yesOrNo = true;
		boolean yesOrNo2 = false;
		
		boolean isGreateThan = 3 > 1;
		System.out.println(isGreateThan);
		
		char letter = 'a';
		System.out.println(letter);
		System.out.println(letter + 1);
		System.out.println( (char) (letter + 1) );
		
	}
	
}