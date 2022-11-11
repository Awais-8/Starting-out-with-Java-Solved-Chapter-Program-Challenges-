package LoopsandFiles;

import java.io.*;
import java.util.Scanner;

public class uppercasefileconverter {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the  name of file to read.");
		String name=input.nextLine();
		
		File file=new File(name+".txt");
		
		Scanner inputfile=new Scanner(file);
		
		System.out.println("Enter the  name of file to write.");
		String namewrite=input.nextLine();
		
		FileWriter fw=new FileWriter(namewrite+".txt");
		String line;
		
		while(inputfile.hasNext()) {
			line=inputfile.nextLine();
			fw.write(line.toUpperCase());
	}
		fw.close();
	}

}
