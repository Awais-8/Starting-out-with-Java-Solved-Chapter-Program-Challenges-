package LoopsandFiles;

import java.util.Scanner;

public class celsiustfahrenheittable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double fahrenheit=0.0;
		for(int i=0;i<=20;i++) {
			fahrenheit=(1.8*i)+32;
			System.out.println(i+" Celsius is equalents to "+fahrenheit+" fahrenheit");
		}

	}

}
