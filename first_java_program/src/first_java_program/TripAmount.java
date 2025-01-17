package first_java_program;

public class TripAmount {
	public static void main(String[] args) {
		int money = (int) (Math.random() * 300_000) + 700_000;
		System.out.println("여행경비: " + money);
		System.out.println();

		int father = (int) (Math.random() * 50) + 30;
		int mother = (int) (Math.random() * 50) + 30;
		int kid = (int) (Math.random() * 30);
		System.out.println("아빠의 나이: " + father);
		System.out.println("엄마의 나이: " + mother);
		System.out.println("자식의 나이: " + kid);
		System.out.println();

		int adultOneWayFlightFare = (int) (Math.random() * 500_000) + 200_000;
		int kidOneWayFlightFare = (int) (Math.random() * 200000) + 100_000;

		System.out.println("어른 여행 가격:" + adultOneWayFlightFare);
		System.out.println("아이 여행 가격:" + kidOneWayFlightFare);
		System.out.println();

		int countAdult = 0;
		int countKid = 0;

		if (father >= 19) {
			countAdult++;
		} else {
			countKid++;
		}

		if (mother >= 19) {
			countAdult++;
		} else {
			countKid++;
		}

		if (kid >= 19) {
			countAdult++;
		} else {
			countKid++;
		}

		System.out.println("어른의 수: " + countAdult + " 아이의 수:" + countKid);
		System.out.println();

		int amount = (adultOneWayFlightFare * countAdult) + (kidOneWayFlightFare + countKid);
		System.out.println("금액의 합계: " + amount);
		System.out.println();

		if (amount < money) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에 가자!");
		}

	}
}
