package com.jetbrains;

public class FileHandlingTest {

    public static void main(String[] args) {

        FileHandling fileHandling = new FileHandling();

        fileHandling.getMaxNumber(
                "G:\\JavaFile Prac\\src\\com\\jetbrains\\Input"
        );

        fileHandling.putMaxToAFile(
                "G:\\JavaFile Prac\\src\\com\\jetbrains\\output"
        );
    }
}
