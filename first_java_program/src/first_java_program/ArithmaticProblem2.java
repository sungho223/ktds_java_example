/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 과제 2
 * */

package first_java_program;

public class ArithmaticProblem2 {

	/**
	 * 산술연산자를 이용해 processTime으로 분,초를 구한다음 minutes, seconds 변수에 할당하고 출력.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int processTime = 300;
		int minutes = processTime / 60;
		int seconds = processTime % 60;
		
		System.out.println(processTime + "초는 " + minutes + "분 " + seconds + "초 입니다.");
//		System.out.println(minutes);
//		System.out.println(seconds);
		
	}
}