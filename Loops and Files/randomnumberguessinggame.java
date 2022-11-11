package LoopsandFiles;

import java.util.Scanner;
import java.lang.Math;

public class randomnumberguessinggame {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number (Hint: number will be in 0.***)");
		double number=input.nextDouble();
		double randomnumber=Math.random();
		
		while(number!=randomnumber) {
			
			if(number>randomnumber) {
				System.out.println("Too high, try again.");
			}
			
			else if(number<randomnumber) {
				System.out.println("Too Low, try again.");
			}
			
			System.out.println("Enter the number Again");
			number=input.nextDouble();
		}
		
		if(number==randomnumber) {
			System.out.println("Your guess is correct!"+" Random number is: "+randomnumber+" Guess number is: "+number);
		}
		

	}

}
