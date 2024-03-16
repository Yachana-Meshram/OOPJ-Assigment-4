package in.acts.cdac;

import java.util.Scanner;
class Vehicle {
	private String color;
	private String brand;
	private float price;
	private int year;
	
	public void Vehicle() {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.year=year;
		
	}
	public void specification(int year){
		System.out.println("Brand :" +brand +",Price: "+ price+",Year" +year);
	}
	public void specification(Float price, int year){
		System.out.println("Brand :" +brand +",Price: "+ price+",Year" +year);
	}
	public void specification(String brand,Float price, int year){
		System.out.println("Brand :" +brand +",Price: "+ price+",Year" +year);
	}
	
}


public class Program {
	public static void main(String[] args) {
		Vehicle car= new Vehicle();
		car.specification(1998);
		car.specification(1200.0f,2010);
		car.specification("BMW",1234.56f,2000);
		
	
	}

}
