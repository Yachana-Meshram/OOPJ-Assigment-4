package in.acts.cdac;
import java.util.Scanner;

class Student{
	//Fields
	private String name;	//Instance Variable
	private int rollno;	 //Instance Variable
	private int marks;	//Instance Variable
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name		:	");
		this.name =sc.nextLine();
		System.out.println("Roll No		:	");
		this.rollno =sc.nextInt();
		System.out.println("marks		:	");
		this.marks =sc.nextInt();
		
	}
	public void printRecord() {
		System.out.println(this.name + " "+this.rollno +" "+this.marks +" ");
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.acceptRecord();
		stud.printRecord();
		

	}

}
