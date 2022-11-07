package Chapter1;

import java.util.Scanner;
public class stockcommision {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//600 shares of stock at a price of 21.77 per share
		double stockprice=600*21.77;
		double commision=stockprice*0.02;
		double totalamount=stockprice+commision;
		
		System.out.println("The amount paid for the stock alone (without the commission) is "+stockprice);
		System.out.println("The amount of the commission is "+commision);
		System.out.println("The total amount paid (for the stock plus the commission "+totalamount);

	}

}
