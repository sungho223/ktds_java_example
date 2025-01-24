package com.ktdsuniversity.edu.comicbook;

public class ComicCafe {

    static final int rentCost = 1000; // 대여 비용
    private int money; // 카페 보유 금액
    ComicBook comic1;
    ComicBook comic2;
    ComicBook comic3;
    ComicBook comic4;
    
    public ComicCafe(int money, ComicBook comic1, ComicBook comic2, ComicBook comic3, ComicBook comic4) {
        this.money = money;
        this.comic1 = comic1;
        this.comic2 = comic2;
        this.comic3 = comic3;
        this.comic4 = comic4;
    }

    public int getMoney() {
        return this.money;
    }

    // 책 대여
    public void rentBook(String bookName) {
        ComicBook comic = findComic(bookName);
        if (comic != null) {
            if (comic.rentBook()) {
                this.money += rentCost;
                System.out.println(bookName + " 대여완료 \n현재 보유 금액: " + this.money);
            } else {
                System.out.println(bookName + " 은 대여중입니다.");
            }
        } else {
            System.out.println(bookName + "은 이 가게에 없습니다.");
        }
    }

    // 책 반납
    public void returnBook(String bookName) {
        ComicBook comic = findComic(bookName);
        if (comic != null) {
            if (comic.returnBook()) {
                System.out.println(bookName + " 반납완료");
            } else {
                System.out.println(bookName + " 은 대여중이지 않습니다.");
            }
        } else {
            System.out.println(bookName + "은 이 가게에 없습니다.");
        }
    }

    // 책 찾기 (책의 이름으로 해당 책을 찾는 메서드)
    private ComicBook findComic(String bookName) {
        if (comic1.getBookName().equals(bookName)) return comic1;
        if (comic2.getBookName().equals(bookName)) return comic2;
        if (comic3.getBookName().equals(bookName)) return comic3;
        if (comic4.getBookName().equals(bookName)) return comic4;
        return null;
    }

    public void printAllBooks() {
        System.out.println("현재 보유 만화책 목록:");
        System.out.println(comic1.getBookName() + " (대여중: " + comic1.getBookStat() + ")");
        System.out.println(comic2.getBookName() + " (대여중: " + comic2.getBookStat() + ")");
        System.out.println(comic3.getBookName() + " (대여중: " + comic3.getBookStat() + ")");
        System.out.println(comic4.getBookName() + " (대여중: " + comic4.getBookStat() + ")");
    }
}
