package Chapter3;

import java.util.Scanner;

public class bookclubpoints {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of purchased books");
		int books=input.nextInt();
		
		if(books==0) {
			System.out.println("Customer purchases"+books+" he or she earns 0 points");
		}
		
		else if(books==1) {
			System.out.println("Customer purchases"+books+" he or she earns 5 points");
		}
		
		else if(books==2) {
			System.out.println("Customer purchases"+books+" he or she earns 15 points");
		}
		
		else if(books==3) {
			System.out.println("Customer purchases"+books+" he or she earns 30 points");
		}
		
		else if(books>=4) {
			System.out.println("Customer purchases"+books+" he or she earns 60 points");
		}

	}

}
