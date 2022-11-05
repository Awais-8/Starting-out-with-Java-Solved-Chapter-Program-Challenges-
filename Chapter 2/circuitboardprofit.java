package Chapter1;

import java.util.Scanner;
public class circuitboardprofit {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the retail price of circuit board");
		double retailprice=input.nextDouble();
		
		double profit=retailprice*0.4;
		
		System.out.println("The retail price of circuit board is "+retailprice);
		System.out.println("The profit of product "+profit);
	}

}
