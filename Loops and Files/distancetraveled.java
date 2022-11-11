package LoopsandFiles;

import java.util.Scanner;

public class distancetraveled {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the speed of vehicle");
		int speed=input.nextInt();
		
		System.out.println("Enter the number of hour ");
		int hours=input.nextInt();
		
		int distance;
		
		System.out.println("Hour			Distance traveled");
		System.out.println("---------------------------------");
		
		for(int i=1;i<=hours;i++) {
			distance=speed*i;
			System.out.println(i+"			"+distance);
		}

	}

}
