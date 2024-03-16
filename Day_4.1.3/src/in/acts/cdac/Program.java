package in.acts.cdac;

import java.util.Scanner;
class Employee {
	private String name;
	private int empid;
	private float salary;
	
	
	public void Employee() {
		this.name=name;
		this.empid=empid;
		this.salary=salary;
		
		
	}
	public void specification(int empid){
		System.out.println("Name	:" +name +", 	Empid	: "+ empid+", 	Salary " +salary);
	}
	public void specification(int empid, Float salary){
		System.out.println("Name	:" +name +", 	Empid	: "+ empid+", 	Salary " +salary);
	}
	public void specification(String name, int empid, Float salary){
		System.out.println("Name	:" +name +", 	Empid	: "+ empid+", 	Salary " +salary);
	}
	
}


public class Program {
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.specification(123456);
		emp.specification(654321, 25000.5f);
		emp.specification("Yachana", 555497,100000.56f);
		
	
	}

}
