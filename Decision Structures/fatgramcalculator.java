package Chapter3;

import java.util.Scanner;
public class fatgramcalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of calories in food");
		double calories=input.nextDouble();
		
		System.out.println("Enter the number of fat gram in food");
		double fatgram=input.nextDouble();
		
		double caloriesfromfat=fatgram*9;
		
		double percalfromfat=caloriesfromfat/calories;
		
		if(caloriesfromfat<calories) {
			
			if(caloriesfromfat<(calories*0.30)) {
				System.out.println("the food is low in fat.");
			}
			
			else {
				System.out.println("the percentage of the calories that come from fat is:"+percalfromfat);
			}
		}
		
		else if(caloriesfromfat > calories) {
			System.out.println("the input is invalid");
		}

	}

}
