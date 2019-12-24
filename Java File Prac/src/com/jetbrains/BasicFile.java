package com.jetbrains;

import java.io.File;

public class BasicFile {

    public static void main(String[] args) {

        File file = new File("G:\\JavaText File");
        file.mkdir();

        String path = file.getAbsolutePath();

        File in = new File(path+"Input.txt");
        File out = new File(path+"Output.txt");

        try{
            in.createNewFile();
            out.createNewFile();

            System.out.println("Files are created");

        }catch (Exception e){
            System.out.println("Exception : "+e);
        }

        if (in.exists())
            System.out.println("\"Input.txt\" file created....");

        if (out.exists())
            System.out.println("\"Output.txt\" file created....");
    }
}
