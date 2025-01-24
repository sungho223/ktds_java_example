package com.ktdsuniversity.edu.comicbook;

public class ComicBook {

    private String bookName;
    private boolean bookStat; // true: 대여중, false: 대여안함

    // 생성자
    public ComicBook(String bookName, boolean bookStat) {
        this.bookName = bookName;
        this.bookStat = bookStat;
    }

    // Getter
    public String getBookName() {
        return this.bookName;
    }

    public boolean getBookStat() {
        return this.bookStat;
    }

    // Setter
    public void setBookStat(boolean bookStat) {
        this.bookStat = bookStat;
    }

    // 책 대여 메서드
    public boolean rentBook() {
        if (!this.bookStat) { // 대여 가능한 상태인 경우
            this.bookStat = true; // 대여 중으로 변경
            return true; // 대여 성공
        }
        return false; // 대여 중이라면 실패
    }

    // 책 반납 메서드
    public boolean returnBook() {
        if (this.bookStat) { // 대여 중인 경우에만 반납 가능
            this.bookStat = false; // 대여 중 상태에서 반납으로 변경
            return true; // 반납 성공
        }
        return false; // 대여 중이 아니면 반납 실패
    }
}
