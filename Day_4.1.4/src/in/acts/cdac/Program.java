package in.acts.cdac;

public class Program {
private static void details(String name, int rollno, float marks ) {
	System.out.println("Name:	"+name +"	Roll No:		"+rollno +"	marks:		"+marks);
}
public static void details( float marks, int rollno ) {
	System.out.println("Roll No:		"+rollno +"	marks:		"+marks);
}
public static void details( String  name ) {
	System.out.println("Name:	"+name);
}


	public static void main(String[] args) {
		
		
		
	
Program.details("Yachana ",10 , 20.2f);
		
		Program.details(10.1f, 20);
		
		Program.details("Prisha");
		
		
	}

}
