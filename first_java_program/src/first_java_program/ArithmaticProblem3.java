/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 과제 3
 * */
package first_java_program;

public class ArithmaticProblem3 {

	/**
	 * 섭씨온도(celsius)를 화씨온도(fahrenheit)변수로 변환해 출력. 
	 * 
	 * 화씨온도 = (섭씨 X 9 / 5) + 32
	 * @param args
	 */
	public static void main(String[] args) {
		double celsius = 36.5;
		double fahrenheit = (celsius *  9 / 5) + 32;
		
		System.out.println("섭씨 " + celsius + " 도는 화씨 " + fahrenheit + "도 입니다.");
	}

}