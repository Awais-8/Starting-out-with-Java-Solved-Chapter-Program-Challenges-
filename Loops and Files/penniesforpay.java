package LoopsandFiles;

import java.util.Scanner;

public class penniesforpay {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the days time period which a person work");
		int days=input.nextInt();
		
		int sum=1;
		double dollor=0;
		for(int i=1;i<=days;i++) {
			dollor=(double)sum/100;
			System.out.println("Day "+i+" he earns "+sum);
			sum=sum*2;
		}
		System.out.println("Total amount person made in dollor is: "+dollor);

	}

}
