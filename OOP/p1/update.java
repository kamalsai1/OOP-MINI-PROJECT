package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p2.employee;

public class update {
    
    public static void updated(employee emp) {
        Connection con = ConnectionFactory.getConnection();
        final String SQL = "update employee set experience=? where id=?";
        try (PreparedStatement stmt = con.prepareStatement(SQL)) {
			stmt.setInt(1, emp.getexperience());
			stmt.setInt(2, emp.getid());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + "employee records effected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}	