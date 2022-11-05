package Chapter1;

import java.util.Scanner;
public class wordgame {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=input.next();
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		System.out.println("Enter your cityname");
		String cityname=input.next();
		
		System.out.println("Enter your college name");
		String collegename=input.next();
		
		System.out.println("Enter your profession");
		String profession=input.next();
		
		System.out.println("Enter type of animal");
		String animaltype=input.next();
		
		System.out.println("Enter your pet name");
		String petname=input.next();
		
		System.out.println("There once was a person named "+name+" who lived in "+cityname+". At the age of "+age+","+"\n"+name+" went to college at "+collegename+". "+name+" graduated and went to work as a"+"\n"+profession+". Then, "+name+" adopted a(n) "+animaltype+" named "+petname+". They both lived"+"\n"+"happily ever after!");

	}

}
