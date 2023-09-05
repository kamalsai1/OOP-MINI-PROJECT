package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p2.employee;

public class create {
    
    public static void created(employee emp) {
        Connection con = ConnectionFactory.getConnection();
        final String SQL = "insert into employee values (?,?,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(SQL)) {
			stmt.setInt(1, emp.getid());
			stmt.setString(2, emp.getname());
			stmt.setString(3, emp.getdesignation());
			stmt.setInt(4, emp.getsalary());
			stmt.setInt(5, emp.getexperience());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + "employee records created.");
        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println("record already exist");
        }
    }
}	