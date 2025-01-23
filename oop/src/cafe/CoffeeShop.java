package cafe;

/**
 * 아이스 아메리카노 따뜻한 아메리카노 초코 핫초코 판매하는 카페
 */
public class CoffeeShop {
	int iceAmericano = 2500;
	int hotAmericano = 2000;

	public CoffeeShop() {
//		System.out.println("커피숍 인스턴스를 만들었습니다.");
//		System.out.println("커피숍 인스턴스: " + this);
//		System.out.println();

		System.out.println("아이스 아메리카노 가격: " + this.iceAmericano);
		System.out.println("아메리카노 가격 " + hotAmericano);
		lineChange();

	}

	public CoffeeShop(int iceAmericano, int hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;

		System.out.println("바뀐 아이스 아메리카노 가격: " + this.iceAmericano);
		System.out.println("바뀐 아메리카노 가격 " + this.hotAmericano);
		lineChange();
	}
	
	public static void lineChange() {
		System.out.println();
	}

}
