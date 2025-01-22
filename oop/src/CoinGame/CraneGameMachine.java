package CoinGame;

import java.util.*;
public class CraneGameMachine {

	boolean isInsertCoin;	//  동전 투입 유무
	int dolls;				//	보유한 인형의 숫자
	
	public void insertCoin() {
		if(dolls>0) {
			isInsertCoin = true;
		}
	}
	
	public int doGame() {
		if(isInsertCoin) {
			Random random = new Random();
			int result = random.nextInt(7); // 0 ~ 6을 랜덤하게 생성
			dolls -= result;				// 현재 인형 - 뽑은 인형
			isInsertCoin = false;			// 반환전 false로 만들기
			return result;					// 뽑은 인형 수 반환
		}
		return 0;							// 동전이 없으면 0 반환
	}
}
