package com.ktdsuniversity.edu.comicbook;

public class SmartComicCafe {

	// 클래스 상수 선언과 동시에 값 초기화 하는 방식
	public static final int RENTAL_FEE = 1_000;

	// static {} 은 자신의 클래스가 가지고 있는 클래스 상수/변수를 초기화 하는 목적 => 지양
	// 자신의 변수/상수를 초기화하기에 클래스명은 생략
	public static final int VIP_RANTAL_FEE;
	static {
		VIP_RANTAL_FEE = 500;
	}

	private int money;
	private ComicBook book1;
	private ComicBook book2;
	private ComicBook book3;
	private ComicBook book4;

	public SmartComicCafe(int money, ComicBook book1, ComicBook book2, ComicBook book3, ComicBook book4) {
		this.money = money;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
		this.book4 = book4;
	}

	public int getMoney() {
		return money;
	}

	public void printAllBooks() {
		System.out.println("================= 보유중인 만화책 목록 =================");
		System.out.println(this.book1.getName() + " > " + this.book1.getIsRental());
		System.out.println(this.book2.getName() + " > " + this.book2.getIsRental());
		System.out.println(this.book3.getName() + " > " + this.book3.getIsRental());
		System.out.println(this.book4.getName() + " > " + this.book4.getIsRental());
	}

	private void rent(ComicBook book) {
		if (book.getIsRental()) {
			System.out.println(book.getName() + "은 이미 대여중인 만화책입니다.");
		} else {
			book.setIsRental(true);
			this.money += this.RENTAL_FEE;
			System.out.println(book.getName() + "을 대여했습니다.");
		}
	}

	public void rentBook(String bookName) {
		System.out.println("================= 만화책 대여 =================");
		if (bookName == this.book1.getName()) {
			rent(this.book1);
		} else if (bookName == this.book2.getName()) {
			rent(this.book2);
		} else if (bookName == this.book3.getName()) {
			rent(this.book3);
		} else if (bookName == this.book4.getName()) {
			rent(this.book4);
		} else {
			System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
		}
	}

	private void retBook(ComicBook book) {
		if (!book.getIsRental()) {
			System.out.println(book.getName() + "은 대여중인 만화책이 아닙니다.");
		} else {
			System.out.println(book.getName() + " 만화책이 반납되었습니다.");
		}
	}

	public void returnBook(String bookName) {
		System.out.println("================= 만화책 반납 =================");

		if (bookName == this.book1.getName()) {
			retBook(this.book1);
		} else if (bookName == this.book2.getName()) {
			retBook(this.book2);
		} else if (bookName == this.book3.getName()) {
			retBook(this.book3);
		} else if (bookName == this.book4.getName()) {
			retBook(this.book4);
		} else {
			System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
		}
	}

}