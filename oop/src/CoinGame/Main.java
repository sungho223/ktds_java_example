package CoinGame;

public class Main {
	public static void main(String[] args) {
		CraneGameMachine cgm = new CraneGameMachine();
		cgm.dolls = 10;

		cgm.insertCoin();
		int result = cgm.doGame();

		System.out.println("동전 투입 여부(false는 없음, true는 있음): " + cgm.isInsertCoin);
		System.out.println();
		
		System.out.println("남이있는 인형의 수: " + cgm.dolls);
		System.out.println();
		
		System.out.println("뽑은 인형의 수: " + result);
		System.out.println();
	}
}
