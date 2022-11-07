package Chapter3;

import java.util.Scanner;
public class bodymassindex {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds");
		double weight=input.nextDouble();
		
		System.out.println("Enter your height in inches");
		double heigth=input.nextDouble();
		
		double bmi=weight*(703/Math.pow(heigth, 2));
		
		if(bmi>=18.5 && bmi<=25) {
			System.out.println("Optimal Weight");
		}
		
		else if(bmi<18.5) {
			System.out.println("Underwieght Weight");
		}
		
		else if(bmi>25) {
			System.out.println("Overwieght Weight");
		}

	}

}
