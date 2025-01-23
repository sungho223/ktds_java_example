package VendingMachine;

public class VendingMachine {
	Item item1;
	Item item2;
	Item item3;
	Item item4;

	public VendingMachine(Item item1, Item item2, Item item3, Item item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;

	}

	private Item getItemByName(String itemName) {
		if (item1.name.equals(itemName))
			return item1;
		if (item2.name.equals(itemName))
			return item2;
		if (item3.name.equals(itemName))
			return item3;
		if (item4.name.equals(itemName))
			return item4;
		return null;
	}

	public Item pressItemButton(String itemName, int orderCount) {
		// 주문하기(제품명, 주문수량): 상품
		// • 몬스터를 5개 주문한다면
		// 상품(상품명: 몬스터, 재고: 5개, 가격: 1500원)을 반환한다.
		// • 주문을 하면 주문 수량만큼 재고가 감소된다.
		// • 재고가 없다면 “상품이 품절되었습니다“ 를 출력하고 null을 반환한다
		Item selectedItem = getItemByName(itemName);
		if (selectedItem == null) {
			System.out.println("존재하지 않는 상품입니다.");
			System.out.println();
			
			return null;
		}
		if (selectedItem.stock >= orderCount) {
			selectedItem.stock -= orderCount;
			System.out.println(orderCount + "개 주문 완료: " + itemName);
			return new Item(selectedItem.name, selectedItem.price, orderCount);
		} else {
			System.out.println("상품이 품절되었습니다.");
			System.out.println();
			return null;
		}
	}

	public void addItem(String itemName, int addCount) {
		// 입고하기(제품명, 입고수량): void
		// • 입고를 하면 입고 수량만큼 재고가 증가된다
		Item selectedItem = getItemByName(itemName);
		if (selectedItem == null) {
			System.out.println("존재하지 않는 상품입니다.");
			return;
		}
		selectedItem.stock += addCount;
		System.out.println(addCount + "개 입고 완료: " + itemName);
	}

	public void printItems() {
		// 재고 출력() : void
		System.out.println("현재 재고 상태:");
		printItemDetails(item1);
		printItemDetails(item2);
		printItemDetails(item3);
		printItemDetails(item4);
	}

	private void printItemDetails(Item item) {
		System.out.println("상품명: " + item.name + ", 가격: " 
	+ item.price + "원, 재고: " + item.stock + "개");
	}

}
