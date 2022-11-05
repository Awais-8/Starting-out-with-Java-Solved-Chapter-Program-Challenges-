package Chapter1;

import java.util.Scanner;
public class restaurantbill {
	
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the meal charge");
			double charge=input.nextDouble();
			
			double tax=charge*0.0675;
			double tip=(tax+charge)*0.20;
			
			System.out.println("Meal charge is "+charge);
			System.out.println("Tax on meal  is "+tax);
			System.out.println("Tip on meal  is "+tip);
			System.out.println("Total amount of meal  is "+(charge+tax+tip));
}
}
