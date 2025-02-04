/*
 * 2025년 01월 15일
 * kt ds 교육 1일차
 * 변수 범위 공부 예제
 * */
package first_java_program;

public class VariableScope {

	public static void main(String[] args) {
		
		int age = 41;
		
		{
			System.out.println( age );
			
			int limit = 30;
			System.out.println(limit);
		}
		
		System.out.println("실행이 종료되었습니다.");
		
	}
	
}