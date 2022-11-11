package LoopsandFiles;

import java.util.Scanner;

public class barchart {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int sales=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter todays sales for store "+i);
			sales=input.nextInt();
			
			System.out.print("Store "+i);
			for(int j=1;j<sales;j+=100) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
