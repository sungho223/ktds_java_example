package com.ktdsuniversity.edu.fruitseller;

public class FruitSeller {

	private final int FRUIT_PRICE = 500;
	private int money;
	private int fruitStock;
	
	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitStock = fruitStock;
	}

	/** 
	 * 과일 판매자의 지갑 잔고
	 * @return
	 */
	public int getMoney() {
		return this.money;
	}
	
	/** 
	 * 과일 판매자의 과일 잔고
	 * @return
	 */
	public int getFruitStock() {
		return this.fruitStock;
	}
	
	/**
	 * 과일을 판매한다
	 * 과일을 판매하면 판매개수만큼 재고가 줄어야 하며, 
	 * 판매 개수만큼 소지금이 증가해야 한다.
	 * @param quantity 
	 * @return
	 */
	public void sell(int quantity) {
		if(this.fruitStock > quantity) {
			fruitStock -= quantity;
			this.money += quantity * FRUIT_PRICE;
		}
	}
}
