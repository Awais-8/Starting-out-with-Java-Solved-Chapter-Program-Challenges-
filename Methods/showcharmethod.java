package Methods;

import java.util.Scanner;

public class showcharmethod {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter any word");
		String word=input.nextLine();
		
		System.out.println("Enter the position of word");
		int position=input.nextInt();
		
		showchar(word,position);

	}
	
	public static void showchar(String word,int pos) {
		System.out.println("the character in position :"+pos+" is "+word.charAt(pos));
	}

}
