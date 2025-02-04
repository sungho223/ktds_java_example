package first_java_program;

public class IfStatementProblem2 {

	public static void main(String[] args) {
		
//		int money = 1_000_000;
		int money = (int) (Math.random() * 1_000_000);
		
//		int father = 40;
//		int mother = 36;
//		int daughter = 11;
		int father = (int) (Math.random() * 100);
		int mother = (int) (Math.random() * 100);
		int daughter = (int) (Math.random() * 100);
		
		int adultFee = 300_000;
		int kidFee = 120_000;
		
		int adultCount = 0;
		int kidCount = 0;
		
		if (father >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		if (mother >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		if (daughter >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		int oneWayFee = (adultCount * adultFee) + (kidCount * kidFee);
		System.out.println("성인 " + adultCount + "명");
		System.out.println("아동 " + kidCount + "명");
		System.out.println("총 여행 경비 " + oneWayFee + "원");
		System.out.println("여행자금 " + money + "원");
		
		if (oneWayFee <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자");
		}
	}
	
}