package com.jetbrains;

import java.io.*;

public class RestManage {
    private int menuNumber;
    private int unitPrice;
    private int quantity;

    public RestManage(int menuNumber, int unitPrice) {
        this.menuNumber = menuNumber;
        this.unitPrice = unitPrice;
    }

    public void findQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void CalcPrice() {
        int totalPrice = this.unitPrice * this.quantity;

        try {
            FileWriter fileWriter = new FileWriter("G:\\JavaFile Prac\\src\\com\\jetbrains\\total");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(String.valueOf(totalPrice));

            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException file) {
            System.out.println(file);
        } catch (NumberFormatException nu) {
            System.out.println(nu);
        } catch (IOException io) {
            System.out.println(io);
        }
    }

    public void CalcServiceCharge() {
        String line = null;
        int charge = 0;
        int price = 0;

        try {
            FileReader fileReader = new FileReader("G:\\JavaFile Prac\\src\\com\\jetbrains\\total");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {

                try {
                    price = Integer.parseInt(line);

                    charge = price / 10;

                    if (charge > 50)
                        price += 50;
                    else price += charge;
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }

            System.out.println("Service : " + charge);
            System.out.println("Total Price : " + price);
        } catch (FileNotFoundException fi) {
            System.out.println(fi);
        } catch (IOException io) {
            System.out.println(io);
        }
    }
}
