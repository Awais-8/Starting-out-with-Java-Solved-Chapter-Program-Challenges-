package LoopsandFiles;

import java.util.Scanner;

public class filelettercounter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter a name of file");
		String file=input.nextLine();
		
		System.out.println("Enter a character");
		char character=input.nextLine().charAt(0);
		
		int count=0;
		for(int i=0;i<file.length();i++) {
			if(file.charAt(i)==character) {
				count+=1;
			}
		}
		
		if(count==0) {
			System.out.println(character+" is appears "+count+" in word: "+file);
		}
		
		else {
			System.out.println(character+" is not appears in word: "+file);
		}

	}

}
