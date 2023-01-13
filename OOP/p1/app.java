package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import p2.employee;

public class app{
	public static void main (String[] args){

		String command = "expense";
		switch(command) {
       case ("createCSV") :
		try{
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Downloads\\OOP\\p1\\employee.csv"));
			String emp;
			while ((emp = reader.readLine())!= null) {
				create.created(new employee(emp));
			}
			reader.close();
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("error");
		}
		break;

		case ("updateCSV") :
		try{
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Downloads\\OOP\\p1\\employee.csv"));
			String emp;
			while ((emp = reader.readLine())!= null) {
				updatefile.updated(new employee(emp));
			}
			reader.close();
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("error");
		}
		
		break;

		case ("create") :
		employee emp1 = new employee(6,"arjun","CFO",2500000,25);
		create.created(emp1); 
		break;

		case("read") :
		List<employee> allemployee = read.getAllemployee();
		allemployee.forEach(System.out::println);
		break;

		case("update") :
		employee e1 =new employee(0, null, null, 0, 0);
		e1.setid(3);
		e1.setexperience(9);
		update.updated(e1);
		break;

		case("delete") :
		employee e2 = new employee(0, null, null, 0, 0);
		e2.setid(5);
		delete.deleted(e2);
		break;

		case("searchbyname") :
        employee e3 = new employee(0, null, null, 0, 0);
		e3.setname("sai");
		searchbyname.search(e3);
		break;

       case("searchbyid") :
		employee e4 = new employee(0, null, null, 0, 0);
		e4.setid(1);
		searchbyid.search(e4);
		break;

		case("searchbyexp") :
		employee e5 = new employee(0, null, null, 0, 0);
		e5.setexperience(26);
		searchbyexperience.search(e5);
		break;

		case("expense") :
		List<employee> exp = read.getAllemployee();
		int sum=0;
		int k = exp.size();
		for(int i = 0 ; i<k ; ){
           sum += ((employee) exp).getsalary();
		   System.out.println("expense = " + sum);
           return;
		}
		break;
        
	    }	
	}
}