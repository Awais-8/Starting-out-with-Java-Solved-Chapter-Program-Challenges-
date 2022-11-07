package Chapter3;

import java.util.Scanner;
public class magicdates {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter th date between 1-31");
		int date=input.nextInt();
		
		System.out.println("Enter th month between 1-12");
		int month=input.nextInt();
		
		System.out.println("Enter th year last digit 90(1990),98(1998)");
		int year=input.nextInt();
		
		if(year==date*month) {
			System.out.println(date+"/"+month+"/"+year+" is magical date");
		}
		
		else {
			System.out.println(date+"/"+month+"/"+year+" is not magical date");
		}

	}

}
