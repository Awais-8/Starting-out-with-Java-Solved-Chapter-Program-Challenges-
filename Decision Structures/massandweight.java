package Chapter3;

import java.util.Scanner;
public class massandweight {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the mass of an object ");
		double mass=input.nextDouble();
		
		double weight=mass*9.8;
		
		if(weight>1000) {
			System.out.println("Object is too heavy");
		}
		
		else if(weight<10) {
			System.out.println("Object is too light");
		}

	}

}
