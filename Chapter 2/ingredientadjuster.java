package Chapter1;

import java.util.Scanner;
public class ingredientadjuster {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//this is the value of for one cookie
		double cupofsugar=1.5/48;
		double cupofbutter=0.020833333333333333;
		double cupofflour=2.75/48;
		
		System.out.println("Enter the number of cookies you want to make ");
		int cookies=input.nextInt();
		
		System.out.println("The number of cookies you want to make is "+cookies);
		System.out.println("Recipe for "+cookies+" is :");
		System.out.println((cupofsugar*cookies)+" cups of sugar");
		System.out.println((cupofbutter*cookies)+" cups of butter");
		System.out.println((cupofflour*cookies)+" cups of flour");
		

	}

}
