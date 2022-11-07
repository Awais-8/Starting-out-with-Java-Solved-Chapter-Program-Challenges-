package Chapter3;


import java.util.Scanner;
public class thespeedofsound {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter air or water or steel");
		String name=input.nextLine();
		
		System.out.println("Enter the distance of sound wave in medium");
		double distance=input.nextDouble();
		
		double time;
		
		if(name.equals("air") || name.equals("water") || name.equals("steel") ) {
			
			if(name .equals("air")) {
				time=distance/1100;
				System.out.println("Sound wave will travel in "+time+" in medium "+name);
			}
			
			else if(name .equals("water")) {
				time=distance/4900;
				System.out.println("Sound wave will travel in "+time+" in medium "+name);
			}
			
			else if(name .equals("steel")) {
				time=distance/16400;
				System.out.println("Sound wave will travel in "+time+" in medium "+name);
			}
		}
		
		else {
			System.out.println("Invalid input! Please enter air or water or steel");
		}

	}

}
