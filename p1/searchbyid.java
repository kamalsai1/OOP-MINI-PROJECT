package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p2.employee;


public class searchbyid {
    
    public static List<employee> search(employee emp) {
		List<employee> emps = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        final String SQL = "select * from employee where id=?";
        try (PreparedStatement stmt = con.prepareStatement(SQL)) {
            stmt.setInt(1, emp.getid());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
                int id= rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                int salary = rs.getInt("salary");
                int experience = rs.getInt("experience");
                System.out.println(id + ", " + name + ", " + designation + ", " + salary + ", " + experience);
			}
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emps;
    }
}	