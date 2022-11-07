package Chapter3;

import java.util.Scanner;
public class timecalculator {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of seconds ");
		double seconds=input.nextDouble();
		
		double minute=seconds/60;
		double hour=seconds/3600;
		double day=seconds/86400;
		
		if(seconds>=60) {
			System.out.println("There are "+minute+" minute in "+seconds+" seconds");		
		}
		
		else if(seconds>=3600) {
			System.out.println("There are "+hour+" hour in "+seconds+" seconds");		
		}
		
		else if(seconds>=86400) {
			System.out.println("There are "+hour+" hour in "+seconds+" seconds");		
		}

	}

}
