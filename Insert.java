import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.SQLException;

 

public class Insert{ 

    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/Demo11";

        String USER = "root";

        String PASSWORD = "Saran@2003";

 

        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

 

            // Corrected query for inserting data into the Employee table

            String insertSQL = "INSERT INTO Employee (Id, F_Name, L_Name, Email, Joining_date) VALUES (?, ?, ?, ?, ?)";

 

            PreparedStatement insertStatement = con.prepareStatement(insertSQL);

            insertStatement.setInt(1, 101); // Id

            insertStatement.setString(2, "saran"); // F_Name

            insertStatement.setString(3, "raj"); // L_Name

            insertStatement.setString(4, "saranraj@gmail.com"); // Email (Corrected, Email must be provided as per schema)

            insertStatement.setString(5, "2024-08-19"); // Joining_date in proper format 'YYYY-MM-DD'

 

            insertStatement.executeUpdate();

            System.out.println("Insert operation completed successfully");

        } catch (SQLException ex) {

            System.out.println(ex);

        }

    }
}