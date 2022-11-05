package Chapter1;

import java.util.Scanner;
public class stringmanipulator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the name of your favorite city");
		String cityname=input.nextLine();
		
		System.out.println(cityname.length());
		System.out.println(cityname.toUpperCase());
		System.out.println(cityname.toLowerCase());
		System.out.println(cityname.charAt(0));

	}

}
