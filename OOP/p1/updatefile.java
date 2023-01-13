package p1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p2.employee;

public class updatefile {

    public static void updated(employee emp) {
        Connection con = ConnectionFactory.getConnection();
        final String SQL = "update employee set name=?,designation=?,salary=?,experience=? where id=?";
        try (PreparedStatement stmt = con.prepareStatement(SQL)) {
			
			stmt.setString(1, emp.getname());
			stmt.setString(2, emp.getdesignation());
			stmt.setInt(3, emp.getsalary());
			stmt.setInt(4, emp.getexperience());
            stmt.setInt(5, emp.getid());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + "employee records updated.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    
}
