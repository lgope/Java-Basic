package com.assignment.two;

public class Main {

    public static void main(String[] args) {

        Book book = new Book(21, "Memory man", "David Baldacci");

        int bookTypeNumber = book.bookType(21);
        int bookPrice = book.calculateBookPrice(bookTypeNumber, 5);

        System.out.println("Price: " + bookPrice);
    }
}
