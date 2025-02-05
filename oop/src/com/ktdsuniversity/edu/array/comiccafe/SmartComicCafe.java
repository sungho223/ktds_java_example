package com.ktdsuniversity.edu.array.comiccafe;

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
	private ComicBook[] books;

	public SmartComicCafe(int money, ComicBook[] books) {
		this.money = money;
		this.books = books;
	}

	public int getMoney() {
		return money;
	}

	public void printAllBooks() {
		System.out.println("================= 보유중인 만화책 목록 =================");
		for (ComicBook book : books) {
			System.out.println(book.getName() + " > " + book.getIsRental());
		}
	}

//		ComicBook book = null;
//		for(int i=0;i<this.books.length; i++) {
//			book = this.books[i];
//		}

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

		for (ComicBook book : books) {
			if (book.getName().equals(bookName)) { // 문자열 비교는 equals() 사용
				rent(book);
				return;
			}
		}

		System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
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

		for (ComicBook book : books) {
			if (book.getName().equals(bookName)) {
				retBook(book);
				return;
			}

		}
	}
}
