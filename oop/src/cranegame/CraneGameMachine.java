package cranegame;

import java.util.Random;

public class CraneGameMachine {

	boolean isInsertCoin;
	int dolls;

	public void insertCoin() {
		if (dolls > 0) {
			isInsertCoin = true;
		}
//		isInsertCoin = dolls > 0;
	}

	public int doGame() {
		if (isInsertCoin) {
			Random random = new Random();
			// int result = (int)(Math.random() * 2);
			int result = random.nextInt(2); // 0 ~ 1

			dolls -= result;
			isInsertCoin = false;
			return result;
		}
		return 0;
	}

}