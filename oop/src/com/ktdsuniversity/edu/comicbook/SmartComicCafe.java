package com.ktdsuniversity.edu.comicbook;

public class SmartComicCafe {
	public static void main(String[] args) {

		ComicBook batman = new ComicBook("배트맨", false);
		ComicBook harlequin = new ComicBook("할리퀸", true);
		ComicBook superman = new ComicBook("슈퍼맨", false);
		ComicBook joker = new ComicBook("조커", true);

		ComicCafe dcComics = new ComicCafe(0, batman, harlequin, superman, joker);
		System.out.println("만화카페 보유 금액: " + dcComics.getMoney());
		dcComics.printAllBooks();
		System.out.println();

		dcComics.rentBook("배트맨");
		dcComics.rentBook("배트맨");
		dcComics.rentBook("조커");
		dcComics.rentBook("스파이더맨");
		System.out.println();

		dcComics.printAllBooks();
		dcComics.returnBook("아이언맨");
		dcComics.returnBook("헐크");
		dcComics.returnBook("조커");
		System.out.println();

		dcComics.printAllBooks();
		System.out.println("만화카페 보유금액: " + dcComics.getMoney());

	}

}
