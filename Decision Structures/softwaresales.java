package Chapter3;

import java.util.Scanner;
public class softwaresales {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the of packages of purchased");
		int quantity=input.nextInt();
		
		int packageprice=99;
		
		int totalamount=packageprice*quantity;
		double totalpricediscount;
		
		if(quantity>=10 && quantity<=19) {
			totalpricediscount=totalamount*0.20;
			System.out.println("Discount on purchase is 20% and total price price after discount is :"+totalpricediscount);
		}
		
		else if(quantity>=20 && quantity<=49) {
			totalpricediscount=totalamount*0.30;
			System.out.println("Discount on purchase is 30% and total price price after discount is :"+totalpricediscount);
		}
		
		else if(quantity>=50 && quantity<=99) {
			totalpricediscount=totalamount*0.20;
			System.out.println("Discount on purchase is 40% and total price price after discount is :"+totalpricediscount);
		}
		
		else if(quantity>=100) {
			totalpricediscount=totalamount*0.50;
			System.out.println("Discount on purchase is 50% and total price price after discount is :"+totalpricediscount);
		}
		
		else {
			System.out.println("No discount on purchase is and total price price is :"+totalamount);
		}
	}

}
