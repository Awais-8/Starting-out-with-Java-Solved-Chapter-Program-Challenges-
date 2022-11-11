package Methods;

import java.util.Scanner;

public class rectanglearea {

	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
	
	double length=getlength();
	double width=getwidth();
	double area=getarea(length,width);
	displayarea(length,width,area);	
		

	}
	
	public static double getlength() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter recatngle length");
		double length=input.nextDouble();
		
		return length;
	}
	
	public static double getwidth() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter recatngle width");
		double width=input.nextDouble();
		
		return width;
	}
	
	public static double getarea(double length,double width) {
		double area=length*width;
		return area;
	}
	
	public static void displayarea(double length,double width,double area) {
		System.out.println("Length of rectangle is: "+length);
		System.out.println("width of rectangle is: "+width);
		System.out.println("area of rectangle is: "+area);
	}
	
	

}
