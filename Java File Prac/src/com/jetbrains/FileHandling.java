package com.jetbrains;

import java.io.*;

public class FileHandling {

    private int max;
    private int min;

    public void getMaxNumber(String file) {
        try {

            String line = null;

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader (fileReader);

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                try {
                   int temp = Integer.parseInt(line);
                    if (this.max < temp)
                        this.max = temp;

                }catch (NumberFormatException e){
                    System.out.println(e);
                }
              //this.temp=Integer.parseInt(line);
            }

            /*String str = null;

            while ((str = bufferedReader.readLine()) != null){
                try{
                    int num = Integer.parseInt(str);

                    if (this.max > num)
                        this.min = num;
                }catch (NumberFormatException nu){
                    System.out.println(nu);
                }
            }*/

            bufferedReader.close();
            fileReader.close();
            System.out.println("Max is : "+this.max);

        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException io){
            System.out.println(io);
        }catch (NumberFormatException nu){
            System.out.println(nu);
        }
    }

    public void putMaxToAFile(String filePath){

        String line = null;

        try{
            FileWriter fileWriter = new FileWriter (filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Max is : "+ String.valueOf(this.max));
            System.out.println("Write successfully");

            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
