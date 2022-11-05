package Chapter1;

import java.util.Scanner;
public class starpattern {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int row=input.nextInt();
		
		for(int i=1;i<=row;i++) {
			
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int k=row-1;k>=i;k--) {
				System.out.print("*");
			}
			
			for(int l=row;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
