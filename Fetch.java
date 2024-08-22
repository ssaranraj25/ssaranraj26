import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

 

public class Fetch {

    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/Demo11";

        String USER = "root";

        String PASSWORD = "Saran@2003";

 

        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

 

            // Read Operation

            String selectSQL = "SELECT * FROM Employee";

            Statement selectStatement = con.createStatement();

            ResultSet resultSet = selectStatement.executeQuery(selectSQL);

 

            System.out.println("Read operation results:");

            while (resultSet.next()) {

                // Corrected column names to match your table schema

                System.out.println("ID: " + resultSet.getInt("Id")

                    + ", First Name: " + resultSet.getString("F_Name")

                    + ", Last Name: " + resultSet.getString("L_Name")

                    + ", Email: " + resultSet.getString("Email")

                    + ", Joining Date: " + resultSet.getDate("Joining_date"));

            }

        } catch (SQLException e) {

            System.out.println(e);

        }

    }

}

 