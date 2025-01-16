/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 형변환 공부 예제
 * */
package first_java_program;

/**
 * 묵시적 형변환 실습
 */
public class TypeCasting {

	public static void main(String[] args) {
		/* 
		 *  자동 타입 캐스팅 가능
		 *  이유: int -> long로의 형변환을 요구하기 때문
		 */

		// 1. int 타입의 변수 정의 및 값 할당
		int integerNumA = Integer.MAX_VALUE;

		// 2. long 타입의 변수 정의 및 할당(int 타입의 값을 할당)
		long longNumA = integerNumA;

		// 3. 각 변수들의 값을 출력
		System.out.println(integerNumA);
		System.out.println(longNumA);

		/* 자동 타입 캐스팅 불가능
		 * 이유: long -> int 로의 형변환을 하고자 하기 때문
		 * 방법: 앞에 강제로 타입을 적어야함
		 */
		
		// 1. long 타입 변수 정의 및 할당
		long longNumB = 3_456_789_000L;
		
		// 2. int 타입의 변수 정의 및 할당
		int integerNumB = (int)longNumB;

		// 3. 각 변수들의 값 출력
		System.out.println(longNumB);
		System.out.println("int의 최대 값 범위: "+ Integer.MAX_VALUE);
		System.out.println(integerNumB);

	}
}
