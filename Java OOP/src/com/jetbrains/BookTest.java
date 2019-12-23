package com.jetbrains;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Book b1 = new Book(in.nextInt(), in.next(), in.next());

        int noOfBooks = in.nextInt();

        int serialNumber = b1.typeOFBook(b1.getBookID());

        int price =  b1.priceOfBooks(serialNumber);

        int unitPrice = b1.unitPrice(b1.getBookID(), noOfBooks, price);

        System.out.println("Price: "+price);
        System.out.println("Unit price: "+unitPrice);

    }
}
