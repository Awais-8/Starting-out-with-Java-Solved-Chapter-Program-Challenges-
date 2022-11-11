package LoopsandFiles;

import java.util.Scanner;
import java.io.*;

public class fileheaddisplay {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the  name of file.");
		String name=input.nextLine();
		
		File file=new File(name+".txt");
		
		Scanner inputfile=new Scanner(file);
		String line; 
		int counter=0;
		
		while(inputfile.hasNext()) {
			line=inputfile.nextLine();
			if(counter<5) {
				System.out.println(line);
			}
			counter+=1;
		}

	}

}
