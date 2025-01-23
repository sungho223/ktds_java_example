package VendingMachine;

public class Main {
	public static void main(String[] args) {
		Item bakas = new Item("박카스", 900, 15);
		Item monster = new Item("몬스터", 1500, 20);
		Item hotSix = new Item("핫식스", 1300, 10);
		Item milkis = new Item("밀키스", 1400, 5);

		VendingMachine vendingMachine = new VendingMachine(bakas, monster, hotSix, milkis);

		// 초기 재고 출력
		vendingMachine.printItems();

		// 주문 테스트
		vendingMachine.pressItemButton("몬스터", 5);
		vendingMachine.pressItemButton("밀키스", 6); // 재고 부족

		// 입고 테스트
		vendingMachine.addItem("밀키스", 10);
		vendingMachine.addItem("콜라", 5); // 존재하지 않는 상품

		// 재고 출력
		vendingMachine.printItems();
	}
}
