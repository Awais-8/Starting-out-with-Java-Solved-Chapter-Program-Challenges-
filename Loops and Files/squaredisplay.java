package LoopsandFiles;

import java.util.Scanner;

public class squaredisplay {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number (less than or 15)");
		int number=input.nextInt();
		
		for (int i=1;i<=number;i++) {
			
			for(int j=1;j<=number;j++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
