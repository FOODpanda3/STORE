package ordersystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jd {
    
    /**
     * Establishes a connection to the MySQL database.
     * 
     * @return A Connection object to the MySQL database.
     */
    public static Connection mycon() {
       Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ordersystem", "root", "password"); // Update with your DB name, user, and password
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database Connection Error: " + e.getMessage());
        }
        return con;
    }
}