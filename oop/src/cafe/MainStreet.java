package cafe;

public class MainStreet {

	public static void main(String[] args) {
		CoffeeShop banapresso = new CoffeeShop();
//		System.out.println("mainStreet의 인스턴스: " + banapresso);
//		System.out.println();

		banapresso = new CoffeeShop(3500, 4000);

		CoffeeShop starbucks = new CoffeeShop(5000, 10000);
		starbucks.iceAmericano = 6000;
		System.out.println("스타벅스 아메리카노 가격: " + starbucks.hotAmericano);
		System.out.println("스타벅스 아이스 아메리카노 가격: " + starbucks.iceAmericano);
		CoffeeShop.lineChange();

		System.out.println("바나프레소에서 결제한 금액은: " + banapresso.orderCoffee(1, 2));
		CoffeeShop.lineChange();
		System.out.println("스타벅스에서 결제할 바뀐 금액은: " + starbucks.orderCoffee(2, 5));
		
		

	}
}
