package com.assignment.two;

public class Book {
    private int bookID;
    private String bookName;
    private String bookAuthor;

    public Book(int bookID, String bookName, String bookAuthor) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public static int bookType(int bookID) {
        if (bookID >= 0 && bookID <= 100) {
            System.out.println("Type: Thriller");
            return 1;
        } else if (bookID >= 101 && bookID <= 200) {
            System.out.println("Type: Action");
            return 2;
        } else if (bookID > 200) {
            System.out.println("Type: Literature");
            return 3;
        }

        return 0;
    }

    public static int calculateBookPrice (int bookIDNumber, int theNoOfBooks) {

        if (bookIDNumber == 1) {
            return 200 * theNoOfBooks;
        } else if (bookIDNumber == 2) {
            return  300 * theNoOfBooks;
        } else return 450 * theNoOfBooks;
    }
}
