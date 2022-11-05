package Chapter1;

import java.util.Scanner;
public class milespergallon {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the gallon gas used");
		double gallonused=input.nextInt();
		
		System.out.println("enter the milesdriven");
		double milesdriven=input.nextInt();
		
		System.out.println("A car's miles-per-gallon is "+(milesdriven/gallonused));

	}

}
