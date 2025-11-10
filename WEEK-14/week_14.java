package com.company;
import java.sql.*;
public class week_14 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // your DB
        String user = "root";  // MySQL username
        String password = "root"; // MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // Create table if not exists
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Employee (" +
                    "id INT PRIMARY KEY, name VARCHAR(50), age INT, salary DOUBLE)");

            // Insert 5 records safely
            for (int i = 1; i <= 5; i++) {
                try {
                    switch(i) {
                        case 1: stmt.executeUpdate("INSERT INTO Employee VALUES(1,'Sadia',25,50000)"); break;
                        case 2: stmt.executeUpdate("INSERT INTO Employee VALUES(2,'Ali',30,60000)"); break;
                        case 3: stmt.executeUpdate("INSERT INTO Employee VALUES(3,'Ayesha',28,55000)"); break;
                        case 4: stmt.executeUpdate("INSERT INTO Employee VALUES(4,'Ahmed',35,70000)"); break;
                        case 5: stmt.executeUpdate("INSERT INTO Employee VALUES(5,'Zara',26,52000)"); break;
                    }
                } catch(Exception e) {} // ignore duplicates
            }

            // Delete 2 records safely
            stmt.executeUpdate("DELETE FROM Employee WHERE id IN (2,4)");

            // Display remaining records
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
            System.out.println("Remaining Employees:");
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Salary: " + rs.getDouble("salary"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
