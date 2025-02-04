/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 과제 1
 * */
package first_java_program;

public class ArithmaticProblem1 {

	/**
	 * 산술 연산자를 이용해 minutes 와 seconds 의 값을 초로 변환해 time 변수에 할당하고 출력.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int minutes = 5;
		int seconds = 50;
		int time = minutes * 60 + seconds;
		System.out.println( minutes + "분 " + seconds + "초는 " + time + "초 입니다." );
		
	}

}