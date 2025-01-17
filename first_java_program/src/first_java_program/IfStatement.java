package first_java_program;

public class IfStatement {

	public static void main(String[] args) {

		int coffeePrice = 1500; // 커피 가격

		// 현금 보유량
		int myWallet = (int) (Math.random() * 10000); // 0~9999까지 나오는 난수
		int friendWallet = (int) (Math.random() * 10000);

		// 커피 5잔을 사먹을 수 있을 까?
		boolean factCheck = coffeePrice * 5 <= myWallet;
//		System.out.println(factCheck);
//		System.out.println("현금 보유량: " + wallet);
//		System.out.println();

		if (factCheck) {
			System.out.println("현금 보유량: " + myWallet);
			System.out.println("커피 주문 했습니다.");
			System.out.println("커피 사고 남은 금액: " + (myWallet - (coffeePrice * 5)));
		} else if (myWallet < 4 * coffeePrice) {
			int loan = Math.abs(coffeePrice * 4) - myWallet;
			System.out.println("돈을 빌려서 4잔은 먹을 수 있어요");
			System.out.println("빌린돈은: " + loan);
			System.out.println("내가 가진돈: " + myWallet);
		} else if (friendWallet >= (coffeePrice * 5) - myWallet) {
			System.out.println("빌려서 사먹으세요.");
			System.out.println("친구는 사줄 수 있는 돈이 있데요.");

		} else {
			System.out.println("나랑 친구의 현금 보유량: " + (myWallet + friendWallet));
			System.out.println((coffeePrice * 5) - (myWallet + friendWallet) + "원이 없어서 못먹어요");

		}
		System.out.println();

	}
}
