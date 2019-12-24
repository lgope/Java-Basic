package com.jetbrains;

import java.io.*;

public class MaxSum {
    private int sum = 0;

    public void getTotalSum(String file) {
        try {
            String line = null;

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                try {
                    int num = Integer.parseInt(line);
                    this.sum += num;
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException f) {
            System.out.println(f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void putSumToFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(String.valueOf("Sum is : " + this.sum));

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
