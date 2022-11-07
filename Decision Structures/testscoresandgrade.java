package Chapter3;

import java.util.Scanner;
public class testscoresandgrade {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your test score 1 ");
		int test1=input.nextInt();
		
		System.out.println("Enter your test score 2 ");
		int test2=input.nextInt();
		
		System.out.println("Enter your test score 3 ");
		int test3=input.nextInt();
		
		double avg=(test1+test2+test3)/3;
		
		if(avg>=90 && avg<=100) {
			System.out.println("Your Garde is A");
		}
		
		else if(avg>=80 && avg<=89) {
			System.out.println("Your Garde is A");
		}
		
		else if(avg>=70 && avg<=79) {
			System.out.println("Your Garde is A");
		}
		
		else if(avg>=60 && avg<=69) {
			System.out.println("Your Garde is A");
		}
		
		else if(avg<60) {
			System.out.println("Your Garde is F");
		}

	}

}
