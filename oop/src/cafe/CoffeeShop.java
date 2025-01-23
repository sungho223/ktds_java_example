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
		System.out.println("아메리카노 가격 " + this.hotAmericano);
		lineChange();

	}

	public CoffeeShop(int iceAmericano, int hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;

//		System.out.println("바뀐 아이스 아메리카노 가격: " + iceAmericano);
//		System.out.println("바뀐 아메리카노 가격 " + hotAmericano);
//		lineChange();
	}

	/**
	 * CoffeeShop에서 커피를 주문한다.
	 * 
	 * @param menu     1번: 아이스 아메리카노, 2번 아메리카노
	 * @param quantity 주문 수량(1번에 1개의 커피만 주문 가능)
	 * @return 결제해야 하는 금액
	 */
	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			return this.iceAmericano * quantity;
		} else if (menu == 2) {
			return this.hotAmericano * quantity;
		}
		// 판매하지 않은 커피를 주문함녀 결제할 금액은 0원이다.
		return 0;
	}

	public static void lineChange() {
		System.out.println();
	}

}
