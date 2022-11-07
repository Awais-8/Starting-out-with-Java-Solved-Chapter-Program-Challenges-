package Chapter3;

import java.util.Scanner;
public class internetserviceprovider {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the name of package you subscribed");
		String name=input.nextLine();
		
		System.out.println("Enter the number of hours you used");
		double hours=input.nextDouble();
		double billperhour;
		double extrahours;
		double extrahoursprice;
		double totalbill;
		
		if(name.equals("A")) {
			totalbill=9.95;
			
			if(hours>10) {
			extrahours=hours-10;
			extrahoursprice=extrahours*2.00;
			totalbill=totalbill+extrahoursprice;
			System.out.println("Total bill of this month is "+totalbill);
			}
			
			else {
				System.out.println("Total bill of this month is "+totalbill);
			}
		}
		
		else if(name.equals("B")) {
			totalbill=13.95;
			
			if(hours>20) {
			extrahours=hours-20;
			extrahoursprice=extrahours*1.00;
			totalbill=totalbill+extrahoursprice;
			System.out.println("Total bill of this month is "+totalbill);
			}
			
			else {
				System.out.println("Total bill of this month is "+totalbill);
			}
		}
		
		else if(name.equals("C")) {
			totalbill=19.95;
				System.out.println("Total bill of this month is "+totalbill);
		}

}

}