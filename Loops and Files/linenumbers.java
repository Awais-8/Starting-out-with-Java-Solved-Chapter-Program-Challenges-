package LoopsandFiles;

import java.io.*;
import java.util.Scanner;

public class linenumbers {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the  name of file.");
		String name=input.nextLine();
		
		File file=new File(name+".txt");
		
		Scanner inputfile=new Scanner(file);
		String line; 
		int linenumber=1;
		
		while(inputfile.hasNext()) {
			line=inputfile.nextLine();
			System.out.println("Content in Line: "+linenumber+" is: "+line);
		}

	}

}
