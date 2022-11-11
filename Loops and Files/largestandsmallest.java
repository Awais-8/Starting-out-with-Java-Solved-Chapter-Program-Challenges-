package LoopsandFiles;

import java.util.Scanner;

public class largestandsmallest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the  number.");
		int number=input.nextInt();
		
		int min=number;
		int max=number;
		
		while(number!=-99) {
			System.out.println("Enter the  number -99 to stop.");
			System.out.println("Enter a  number.");
			number=input.nextInt();
			
		if(number>max) {
			max=number;
		}
		
		if(number!=-99) {
			if(number<min) {
				min=number;
			}
		}

		}
		System.out.println("The smallest number is "+min);
		System.out.println("The largest number is "+max);
	}

}
