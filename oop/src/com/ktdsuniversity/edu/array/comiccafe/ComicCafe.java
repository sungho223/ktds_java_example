package com.ktdsuniversity.edu.array.comiccafe;

public class ComicCafe {

	private final int RENTAL_FEE = 1_000;

	private int money;
	private ComicBook[] books;

//	private ComicBook book1;
//	private ComicBook book2;
//	private ComicBook book3;
//	private ComicBook book4;

	public ComicCafe(int money, ComicBook[] books) {
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

	public void rentBook(String bookName) {
		System.out.println("================= 만화책 대여 =================");

		for (ComicBook book : books) {
			if (book.getName().equals(bookName)) {
				if (book.getIsRental()) {
					System.out.println(book.getName() + "은 이미 대여중인 만화책입니다.");
				} else {
					book.setIsRental(true);
					this.money += this.RENTAL_FEE;
					System.out.println(book.getName() + "을 대여했습니다.");
				}
				return;
			}

			System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
		}
	}

	public void returnBook(String bookName) {
		System.out.println("================= 만화책 반납 =================");

		for (ComicBook book : books) {
			if (book.getName().equals(bookName)) {
				if (!book.getIsRental()) {
					System.out.println(book.getName() + "은 대여중인 만화책이 아닙니다.");
				} else {
					book.setIsRental(false);
					System.out.println(book.getName() + " 만화책이 반납되었습니다.");
				}
				return;
			}
		}

		// 반복문이 끝나면 책이 없는 경우
		System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
	}

}
