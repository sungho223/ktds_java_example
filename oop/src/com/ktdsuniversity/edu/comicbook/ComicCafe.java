package com.ktdsuniversity.edu.comicbook;

public class ComicCafe {

	private final int RENTAL_FEE = 1_000;

	private int money;
	private ComicBook book1;
	private ComicBook book2;
	private ComicBook book3;
	private ComicBook book4;

	public ComicCafe(int money, ComicBook book1, ComicBook book2, ComicBook book3, ComicBook book4) {
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

	public void rentBook(String bookName) {
		System.out.println("================= 만화책 대여 =================");
		if (bookName == this.book1.getName()) {
			if (this.book1.getIsRental()) {
				System.out.println(this.book1.getName() + "은 이미 대여중인 만화책입니다.");
			} else {
				this.book1.setIsRental(true);
				this.money += this.RENTAL_FEE;
				System.out.println(this.book1.getName() + "을 대여했습니다.");
			}
		} else if (bookName == this.book2.getName()) {
			if (this.book2.getIsRental()) {
				System.out.println(this.book2.getName() + "은 이미 대여중인 만화책입니다.");
			} else {
				this.book2.setIsRental(true);
				this.money += this.RENTAL_FEE;
				System.out.println(this.book2.getName() + "을 대여했습니다.");
			}
		} else if (bookName == this.book3.getName()) {
			if (this.book3.getIsRental()) {
				System.out.println(this.book3.getName() + "은 이미 대여중인 만화책입니다.");
			} else {
				this.book3.setIsRental(true);
				this.money += this.RENTAL_FEE;
				System.out.println(this.book3.getName() + "을 대여했습니다.");
			}
		} else if (bookName == this.book4.getName()) {
			if (this.book4.getIsRental()) {
				System.out.println(this.book4.getName() + "은 이미 대여중인 만화책입니다.");
			} else {
				this.book4.setIsRental(true);
				this.money += this.RENTAL_FEE;
				System.out.println(this.book4.getName() + "을 대여했습니다.");
			}
		} else {
			System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
		}
	}

	public void returnBook(String bookName) {
		System.out.println("================= 만화책 반납 =================");

		if (bookName == this.book1.getName()) {
			if (!this.book1.getIsRental()) {
				System.out.println(this.book1.getName() + "은 대여중인 만화책이 아닙니다.");
			} else {
				System.out.println(this.book1.getName() + " 만화책이 반납되었습니다.");
			}
		} else if (bookName == this.book2.getName()) {
			if (!this.book2.getIsRental()) {
				System.out.println(this.book2.getName() + "은 대여중인 만화책이 아닙니다.");
			} else {
				System.out.println(this.book2.getName() + " 만화책이 반납되었습니다.");
			}
		} else if (bookName == this.book3.getName()) {
			if (!this.book3.getIsRental()) {
				System.out.println(this.book3.getName() + "은 대여중인 만화책이 아닙니다.");
			} else {
				System.out.println(this.book3.getName() + " 만화책이 반납되었습니다.");
			}
		} else if (bookName == this.book4.getName()) {
			if (!this.book4.getIsRental()) {
				System.out.println(this.book4.getName() + "은 대여중인 만화책이 아닙니다.");
			} else {
				System.out.println(this.book4.getName() + " 만화책이 반납되었습니다.");
			}
		} else {
			System.out.println(bookName + "은 보유중인 만화책이 아닙니다.");
		}
	}

}
