package Methods;

import java.util.Scanner;

public class retailpricecalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter item cost");
		double cost=input.nextDouble();
		
		System.out.println("Enter markup percentage");
		double markup=input.nextDouble();
		
		double retailprice=calculateRetail(cost,markup);
		System.out.println("Retail price is: "+retailprice);
	}
	
	public static double calculateRetail(double cost,double markup) {
		return (cost+(cost*(markup/100)));
		
	}

}
