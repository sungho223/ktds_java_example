package VendingMachine;

public class Mart {
	public static void main(String[] args) {
		
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 인스턴스를 생성
		Item item1 = new Item("박카스", 900, 15);
		Item item2 = new Item("몬스터", 1500, 20);
		Item item3 = new Item("핫식스", 1300, 10);
		Item item4 = new Item("밀키스", 1400, 5);

		// 자판기 인스턴스를 생성
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 상품 인스턴스도 함께 전달한다.
		VendingMachine lotte = new VendingMachine(item1, item2, item3, item4);

		// 자판기에서 상품 버튼을 눌러 구매한다. 
		// 반환된 정보는 구매자가 구매한 상품 정보
		Item orderedItem = lotte.pressItemButton("박카스", 10);
		
		// orderItem("박카스", 900, 10): Item
		System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");

		// VendingMachine의 아래 부분이 반환해서 이렇게 되는거임
		// return new Item(this.item1.name, this.item1.price, orderCount);
		orderedItem = lotte.pressItemButton("핫식스", 5);
		// orderItem("핫식스", 1300, 5): Item
		System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");

		// orderedItem = null
		// VendingMachine에서 return null 였기 때문에 "NullPointerException" 에러 발생
		orderedItem = lotte.pressItemButton("박카스", 30);
		// Error! => NullPointerException
//		System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");
		
		// 아래와 같이 우회하여 해결 가능(나중에 예외처리로 하면 될 듯)
		if(orderedItem != null) {
			System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");
		}

		// orderedItem = null
		// VendingMachine에서 return null 였기 때문에 "NullPointerException" 에러 발생
		orderedItem = lotte.pressItemButton("갈아만든 배", 50);
		// Error! => NullPointerException
//		System.out.println(orderedItem.name + "을 " + orderedItem.stock + "개 구입했습니다.");
		
		// 아래와 같이 우회하여 해결 가능(나중에 예외처리로 하면 될 듯)
		if(orderedItem != null) {
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
