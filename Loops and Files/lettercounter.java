package LoopsandFiles;

import java.util.Scanner;

public class lettercounter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter a string value");
		String text=input.nextLine();
		
		System.out.println("Enter a character");
		char character=input.nextLine().charAt(0);
		
		int count=0;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)==character) {
				count+=1;
			}
		}
		
		if(count==0) {
			System.out.println(character+" is appears "+count+" in word: "+text);
		}
		
		else {
			System.out.println(character+" is not appears in word: "+text);
		}

	}

}
