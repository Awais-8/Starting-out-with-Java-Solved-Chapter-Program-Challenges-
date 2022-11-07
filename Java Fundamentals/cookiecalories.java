package Chapter1;

import java.util.Scanner;
public class cookiecalories {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of cookies you ate");
		int numberofcookies=input.nextInt();
		
		int onecookiecal=3000/40;
		
		System.out.println("The number of cookies you ate is "+numberofcookies);
		System.out.println("The number of calories you ate is "+(onecookiecal*numberofcookies));
		

	}

}
