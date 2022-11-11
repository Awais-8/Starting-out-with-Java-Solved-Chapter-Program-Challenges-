package Methods;

import java.util.Scanner;

public class conversionprogram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		int choice=0; 
		
		while(choice!=4) {
			System.out.println("Enter distance in meter");
			double distance=input.nextDouble();
			
			System.out.println("Enter enter your choice");
			choice=input.nextInt();
			
			if(choice==1) {
				showKilometers(distance);
			}
			
			else if(choice==2) {
				showinches(distance);
			}
			
			else if(choice==3) {
				showfeet(distance);
			}
		}
		
		

	}
	
	public static void showKilometers(double distance) {
		double kilometer=distance*0.001;
		System.out.println(distance+"meters is: "+kilometer+"kilometer");
	}
	
	public static void showinches(double distance) {
		double inces=distance*39.37;
		System.out.println(distance+"meters is: "+inces+"inces");
	}
	
	public static void showfeet(double distance) {
		double feet=distance*3.281;
		System.out.println(distance+"meters is: "+feet+"feet");
	}

}
