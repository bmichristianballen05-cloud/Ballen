package kita;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_kita?useSSL=false&serverTimezone=UTC",
                "root",
                ""
            );
            System.out.println("CONNECTED SUCCESSFULLY");
            return con;
        } catch (Exception e) {
            System.out.println("CONNECTION FAILED");
            e.printStackTrace();
            return null;
        }
    }

    // 🔴 THIS IS THE TEST
    public static void main(String[] args) {
        getCon();
    }
}
