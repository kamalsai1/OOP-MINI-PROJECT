package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p2.employee;

public class delete {
    public static void deleted(employee emp) {
        Connection con = ConnectionFactory.getConnection();
        final String SQL = "delete from employee where id=?";
        try (PreparedStatement stmt = con.prepareStatement(SQL)) {
			stmt.setInt(1, emp.getid());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + "employee records effected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
