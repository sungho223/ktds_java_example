package vendingmachine;

/**
 * 자판기를 생성하고 판매/운영 수행.
 */
public class Mart {

	public static void main(String[] args) {

		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 인스턴스들 생성.
		Item item1 = new Item("박카스", 900, 15);
		Item item2 = new Item("몬스터", 1500, 20);
		Item item3 = new Item("핫식스", 1300, 10);
		Item item4 = new Item("밀키스", 1400, 5);

		// 자판기 인스턴스를 생성.
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 상품 인스턴스도 함께 전달한다.
		VendingMachine lotte = new VendingMachine(item1, item2, item3, item4);

		// 자판기에서 상품 버튼을 눌러 구매한다.
		// 반환된 정보는 구매자가 구매한 상품정보.
		Item orderedItem = lotte.pressItemButton("박카스", 10);
		// orderedItem("박카스", 900, 10): Item
		System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");

		orderedItem = lotte.pressItemButton("핫식스", 5);
		// orderedItem("핫식스", 1300, 5): Item
		System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");

		orderedItem = lotte.pressItemButton("박카스", 30);
		// orderedItem = null
		// Error! => NullPointerException
		if (orderedItem != null) {
			System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");
		}

		orderedItem = lotte.pressItemButton("갈아만든 배", 50);
		// orderedItem = null
		// Error! => NullPointerException
		if (orderedItem != null) {
			System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");
		}

		lotte.printItems();

		lotte.addItem("박카스", 100);
		lotte.addItem("핫식스", 100);
		lotte.addItem("핫식스", 100);
		lotte.addItem("밀키스", 100);
		lotte.printItems();
	}

}