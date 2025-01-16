/*
 * 2025년 01월 16일
 * kt ds 교육 2일차
 * 형변환 공부 실습
 * */
package first_java_program;

public class TypeCastingEx {
	public static void main(String[] args) {

		int n = 1234567;
		double d = 3.141592;
		String str = "123456789";
		String fact = "True";

		// 1. 정수 -> 부동소수점
		double firstResult = n;
		System.out.println(firstResult); // 1234567.0

		// 2. 부동소수점 -> 정수
		int integerNum = (int) d;
		System.out.println(integerNum); // 3

		// 3. 부동소수점 소수 처리
		double dA = Math.round(d);
		System.out.println(dA); // 3.0

		// 4. 부동소수점 소수점 올림 처리
		double dB = Math.ceil(d);
		System.out.println(dB); // 4.0

		// 5. 문자열 -> 정수 변환
		int stResult = Integer.parseInt(str);
		System.out.println(stResult); // 123456789
		// 아래 코드 처음 보는 것임 -> 근데 그냥 확인용이므로 상관 없음
		System.out.println(((Object) stResult).getClass().getName()); // java.lang.Integer

		// 6. 문자열 -> 정수 오류 실습
		try {
			byte byteResult = Byte.parseByte(str); // 문자열을 바이트로 변환
			System.out.println("Parsed byte value: " + byteResult);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input: '" + str + "' is not a valid byte value.");
			// Invalid input: '123456789' is not a valid byte value.
		}

		str = "1234.56789"; // 위에 int에서 에러 걸려서 여기에서 str값 다시 정의
		// 7. 문자열 -> 부동소수점 변환
		double doubleResult = Double.parseDouble(str);
		System.out.println(doubleResult); // 1.23456789E8

		// 8. 문자열 -> 불린 변환
		boolean booleanResult = Boolean.parseBoolean(fact);
		System.out.println(booleanResult); // true

		// 추가로 해보고 싶었던 내용
		while (booleanResult) {
			if (booleanResult == true) {
				System.out.println("exchange success"); // exchange success
				break;
			}
		}

		// 숫자를 문자로 바꾸는 방법
		int age = 30;
		String stringAge = String.valueOf(age);
		System.out.println(age + 10);
		System.out.println(stringAge + 10);

		int count = 10;
		String stringCount = count + " ";
		System.out.println(count + 100);
		System.out.println(stringCount + 100);

	}

}
