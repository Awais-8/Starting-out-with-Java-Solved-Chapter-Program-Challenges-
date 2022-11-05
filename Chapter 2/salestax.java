package Chapter1;

import java.util.Scanner;
public class salestax {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		 System.out.println("Enter the amount of purchase");
		 double purchase=input.nextDouble();
		 
		 double statetax=purchase*0.04;
		 
		 double countytax=purchase*0.02;
		 
		 double totalsaletax=statetax+countytax;
		 
		 System.out.println("Amount of purchase is "+purchase);
		 System.out.println("State sales tax is "+statetax);
		 System.out.println("county sales tax is "+countytax);
		 System.out.println("total sales tax is "+totalsaletax);
		 System.out.println("total of the sales is "+(purchase+totalsaletax));
		
	}

}
