package cafe;

public class MainStreet {

	public static void main(String[] args) {
		CoffeeShop banapresso = new CoffeeShop();
//		System.out.println("mainStreet의 인스턴스: " + banapresso);
		System.out.println();
		
		banapresso = new CoffeeShop(3500, 4000);
		
		CoffeeShop starbucks = new CoffeeShop();
		starbucks.iceAmericano = 6000;
		System.out.println("스타벅스 아메리카노 가격: " + starbucks.hotAmericano);
		System.out.println("스타벅스 아이스 아메리카노 가격: " + starbucks.iceAmericano);
		

	}
}
