package Chapter3;

import java.util.Scanner;
public class romannumerals {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter the number between 1-10 to disply roman value of that number");
	int n=input.nextInt();
	String roman;
	if(n>0 && n<=10) {
		
		if(n==1) {
			System.out.println("Roman value of "+n+" is : I");
		}
		
		else if(n==2) {
			System.out.println("Roman value of "+n+" is : II");
		}
		
		else if(n==3) {
			System.out.println("Roman value of "+n+" is : III");
		}
		
		else if(n==4) {
			System.out.println("Roman value of "+n+" is : IV");
		}
		
		else if(n==5) {
			System.out.println("Roman value of "+n+" is : V");
		}
		
		else if(n==6) {
			System.out.println("Roman value of "+n+" is : VI");
		}
		
		else if(n==7) {
			System.out.println("Roman value of "+n+" is : VII");
		}
		
		else if(n==8) {
			System.out.println("Roman value of "+n+" is : VIII");
		}
		
		else if(n==9) {
			System.out.println("Roman value of "+n+" is : IX");
		}
		
		else if(n==10) {
			System.out.println("Roman value of "+n+" is : X");
		}
		
	}
	
	else {
		System.out.println("Please enter number between 1-10");
	}
	
	}
}
