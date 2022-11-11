package LoopsandFiles;

import java.util.Scanner;

public class averagerainfall {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number of years");
		int years=input.nextInt();
		double inches=0;
		int months=0;
		double totalinches=0;
		
		while(years<1) {
			System.out.println("Invalid input!.Enter again number of years 1 or greater");
			years=input.nextInt();
		}
		
		for(int i=1;i<=years;i++) {
			
			for(int j=1;j<=12;j++) {
				System.out.println("Enter the number of inches of rainfall in month "+j);
				inches=input.nextInt();
				
				while(inches<1) {
					System.out.println("invalid input! Enter the number of inches greater than 0");
					inches=input.nextInt();
				}
				
				totalinches+=inches;
				months+=1;
			}
		}
		double averagerainfall=totalinches/months;
		
		System.out.println("Number of motnh in "+years+" years time period is: "+months);
		System.out.println("Number of total ineches in entire time perioid is: "+totalinches);
		System.out.println("the average rainfall per month for the entire period is: "+averagerainfall);

	}

}
