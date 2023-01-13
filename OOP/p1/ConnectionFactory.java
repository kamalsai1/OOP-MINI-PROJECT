package p1;

import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Kamalsai@2002";
    private static final String URL = "jdbc:mysql://localhost:3306/project";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties connectionProperties = new Properties();
            connectionProperties.put("user", USERNAME);
            connectionProperties.put("password", PASSWORD);
            con = DriverManager.getConnection(URL, connectionProperties);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return con;
    }
}