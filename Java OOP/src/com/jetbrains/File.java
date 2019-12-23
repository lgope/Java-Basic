package com.jetbrains;
import java.io.*;

public class File {

        private int sum = 0;

        public void getMaxNumberFromFile(String file){
            String line = null;
            try {
// for reading character files.
                FileReader fileReader = new FileReader(file);
// Reads text from a character-input stream
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    try {
                        this.sum += Integer.parseInt(line);

                    }catch (NumberFormatException e){
                        System.out.println(e);
                    }
                }

                bufferedReader.close();
                fileReader.close();
                System.out.println("Sum is : "+this.sum);

            }catch (FileNotFoundException e){
                System.out.println(e);
            }catch (IOException e){
                System.out.println(e);
            }catch (NumberFormatException e){
                System.out.println(e);
            }

            System.out.println("Ok");
        }

        public void putResultInAFile(String file){

            String line = null;

            try {
// for writing character files
                FileWriter fileWriter = new FileWriter(file);
// Writes text to a character-output stream
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.valueOf(this.sum));
//bufferedWriter.write((this.max));
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }

}
