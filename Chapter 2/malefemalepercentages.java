package Chapter1;

import java.util.Scanner;
public class malefemalepercentages {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of males in class");
		int male=input.nextInt();
		
		System.out.println("Enter the number of females in class");
		int female=input.nextInt();
		
		int students=male+female;
		double permale=male/students;
		double perfemale=female/students;
		
		System.out.println("The number of students in class is "+students);
		System.out.println("The number of males in class is "+male);
		System.out.println("The number of females in class is "+female);
		System.out.println("The percenatge of male in class is "+permale+"%");
		System.out.println("The percenatge of female in class is "+perfemale+"%");

	}

}
