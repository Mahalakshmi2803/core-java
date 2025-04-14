package com.xworkz.temple.overRiding.internal;

public class BookUser {
    public BookUser() {
        System.out.println("BookUser constructor");
    }
    public void show(Book book) {
        if (book != null) {
            book.open();
            if (book instanceof Novel) {
                Novel novel = (Novel) book;
                novel.readChapter();
            } else {
                System.out.println("Book is not a Novel");
            }
        } else {
            System.out.println("Book is null");
        }
    }
}
