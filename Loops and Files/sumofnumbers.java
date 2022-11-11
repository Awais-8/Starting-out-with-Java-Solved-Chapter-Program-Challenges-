package LoopsandFiles;

import java.util.Scanner;
public class sumofnumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the positve integer");
		int num=input.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		
		System.out.println("Sum of intger from 1 to "+num+" is: "+sum);
		
	}

}
