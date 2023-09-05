package p2;

public class employee {
	private int id;
	private String name;
	private String designation;
	private int salary;
	private int experience;
    public int getexperience;
	
	public employee(int id, String name, String designation, int salary, int experience){
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
	}
	
	public employee(String rec) {
        String values[] = rec.split(",");
		this.id = Integer.valueOf(values[0]);
        this.name = values[1];
        this.designation = values[2];
		this.salary = Integer.valueOf(values[3]);
		this.experience = Integer.valueOf(values[4]);
    }

	public int getid() {return id;}
	public void setid(int id) {this.id = id;}
	
	public String getname() {return name;}
	public void setname(String name) {this.name = name;}
	
	public String getdesignation() {return designation;}
	public void setdesignation(String designation) {this.designation = designation;}
	
	public int getsalary() {return salary;}
	public void setsalary(int salary) {this.salary = salary;}
	
	public int getexperience() {return experience;}
	public void setexperience(int experience) {this.experience = experience;}
	
	@Override
	public String toString(){
		return "employee id: "+ id + ", name: "+ name + ", designation:" + designation +", salary:"+salary+ ", experience:"+experience;
	
	}

}