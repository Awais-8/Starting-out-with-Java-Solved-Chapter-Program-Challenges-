package LoopsandFiles;

import java.util.Scanner;

public class budetanalysis {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the  budget for a month.");
		int budget=input.nextInt();
		
		int total=0;
		int expenses=0;
		
		while(expenses!=-99) {
			System.out.println("Enter the amount of your expenses");
			expenses=input.nextInt();
			total=total+expenses;
			System.out.println("To stop enter -99");
			expenses=input.nextInt();
		}
		
		if(total<=budget) {
			System.out.println("Your expenses: "+total+" is under budget: "+budget);
		}
		
		if(total>budget) {
			System.out.println("Your expenses: "+total+" is over budget: "+budget);
		}

	}

}
