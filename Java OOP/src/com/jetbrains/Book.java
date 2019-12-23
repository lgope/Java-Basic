package com.jetbrains;

public class Book {

    private int bookID;
    private String bookName;
    private String bookAuthor;

    public Book(int id, String bookName, String bookAuthor) {
        this.bookID = id;
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

    public int typeOFBook(int bookid) {
        if (bookid >= 0 && bookid <= 100) {
            System.out.println("Type: Thiller ");
            return 1;
        } else if (bookid >= 101 && bookid <= 200) {
            System.out.println("Type: Action ");
            return 2;
        } else {
            System.out.println("Type: Literature ");
            return 3;
        }

    }

    public int priceOfBooks(int number) {

        if (number == 1) {
            return 200;
        } else if (number == 2) {
            return 300;
        } else {
            return 450;
        }
    }

    public int unitPrice(int bookID, int noOfBook, int price){

        return price*noOfBook;
    }
}
