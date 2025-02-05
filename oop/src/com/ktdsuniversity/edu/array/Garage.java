package com.ktdsuniversity.edu.array;

import com.ktdsuniversity.edu.comicbook.ComicBook;

public class Garage {

	public static void main(String[] args) {
		ComicBook[] bookGarage = new ComicBook[4];
		bookGarage[0] = new ComicBook("만화책1", false);
		bookGarage[1] = new ComicBook("만화책2", false);
		bookGarage[2] = new ComicBook("만화책3", false);
		bookGarage[3] = new ComicBook("만화책4", false);

		// 모든 만화책의 이름을 출력
		for (int i = 0; i < bookGarage.length; i++) {
			ComicBook book = bookGarage[i];
			System.out.println(book.getName());
//			book.setIsRental(true);
		}

		for (int i = 0; i < bookGarage.length; i++) {
			ComicBook book = bookGarage[i];
			if (book.getName() == "만화책2" || book.getName() == "만화책3") {
				System.out.println(book.getName());
				System.out.println(book.getIsRental());
			}
		}
	}

}
