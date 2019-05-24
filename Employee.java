import java.util.*;

public class Employee {
	private String name;
	private double baseSalary;
	//private String manager_name;
	private int count = 0;
	
	public Employee(String name, double baseSalary){
		count++;
		this.name = name;
		this.baseSalary = baseSalary;
		this.count = count;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
	public String getName(){
		return name;
	}
	//have to think about thsi method.
	//this method is not corredt
	//implemented done(:
	public int getEmployeeID(){
		return count;
	}
	public Employee getManager(){
		String n = this.name;
		double s = this.baseSalary;
		Employee f = new Employee(n, s);
		return f;
	}
	public boolean equals(Employee other){
		int id1= this.count;
		int id2=other.count;
		if (id1==id2){
			return true;
		} else {return false;}
	}
	public String toString(){
		int id = count;
		String nam = name;
		return (id + " " + name);
	}
	/*public String employeeStatus(){
		return 
	}*/
	


}