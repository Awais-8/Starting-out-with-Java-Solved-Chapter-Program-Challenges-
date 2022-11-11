package LoopsandFiles;

import java.util.Scanner;

public class population {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number of organisms.");
		int organisms=input.nextInt();
		
		System.out.println("Enter number for average daily population increase.");
		double averageincrease=input.nextDouble();
		
		System.out.println("Enter the number of days they will multiply.");
		int daysmultiply=input.nextInt();
		
		int population=organisms;
		
		while(organisms<2) {
			System.out.println("Invalid input! Enter number of organisms 2 or greater.");
			organisms=input.nextInt();
		}
		
		while(averageincrease<0) {
			System.out.println("Invalid input! Enter number for average daily population increase greater than 0.");
			averageincrease=input.nextDouble();
		}
		
		while(daysmultiply<1) {
			System.out.println("Invalid input! Enter the number of days they will multiply.");
			daysmultiply=input.nextInt();
		}

		for(int i=1;i<=daysmultiply;i++) {
			population= (int) (population+(population*averageincrease));
			System.out.println("Population increse in day: "+i+" is: "+population);
		}
	}

}
