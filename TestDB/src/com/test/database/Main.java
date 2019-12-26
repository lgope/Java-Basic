package com.test.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

//    public static final String

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:G:\\TestDB\\firstdb.db");
            Statement statement = connection.createStatement();

            statement.execute("CREATE table if not exists contacts (name TEXT , phone INTEGER , email TEXT)");

            statement.execute("INSERT INTO contacts (name, phone, email)" +
                                  "values ('Ram', 95656566, 'iramgope@gmail.com')");

            statement.close();
            connection.close();
        } catch (SQLException sqException) {
            System.out.println("Something went wrong : " + sqException.getMessage());
        }
    }
}
