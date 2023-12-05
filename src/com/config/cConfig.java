package com.config;
import java.sql.*;

public class cConfig {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_project";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Statement statement;
    public static ResultSet resultSet;
    public static Connection connect;

    public static void connection() {
        try {
            Class.forName(JDBC_DRIVER);
            connect = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal");
        }
    }
}
