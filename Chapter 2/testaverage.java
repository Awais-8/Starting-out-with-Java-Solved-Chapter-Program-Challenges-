package Chapter1;

import java.util.Scanner;
public class testaverage {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the score of test1 ");
		double test1=input.nextInt();
		
		System.out.println("enter the score of test2 ");
		double test2=input.nextInt();
		
		System.out.println("enter the score of test3 ");
		double test3=input.nextInt();
		
		System.out.println("The score of test1 is "+test1);
		System.out.println("The score of test2 is "+test2);
		System.out.println("The score of test3 is "+test3);
		System.out.println("The average of scores is "+((test1+test2+test3)/3));

	}

}
