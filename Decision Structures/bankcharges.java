package Chapter3;

import java.util.Scanner;

public class bankcharges {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of checks");
		int checks=input.nextInt();
		double totalfees;
		
		if(checks<20) {
			totalfees=10+(checks*0.10);
			System.out.println("the bank’s service fees for the month is: "+totalfees);
		}
		
		else if(checks>=20 && checks<=39) {
			totalfees=10+(checks*0.08);
			System.out.println("the bank’s service fees for the month is: "+totalfees);
		}
		
		else if(checks>=40 && checks<=59) {
			totalfees=10+(checks*0.06);
			System.out.println("the bank’s service fees for the month is: "+totalfees);
		}
		
		else if(checks>=60) {
			totalfees=10+(checks*0.04);
			System.out.println("the bank’s service fees for the month is: "+totalfees);
		}

	}

}
