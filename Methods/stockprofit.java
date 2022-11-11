package Methods;

import java.util.Scanner;

public class stockprofit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number of shares");
		int NS=input.nextInt();
		
		System.out.println("Enter purchase price per share,");
		double PP=input.nextDouble();
		
		System.out.println("Enter purchase commission paid");
		double PC=input.nextDouble();
		
		System.out.println("Enter sale price per share,");
		double SP=input.nextDouble();
		
		System.out.println("Enter sale commission paid.");
		double SC=input.nextDouble();
		
		double saleofstock=saleofstock(NS,PP,PC,SP,SC);
		
		if(saleofstock>0) {
			System.out.println("Profit on sale stock is: "+saleofstock);
		}
		
		else if(saleofstock<0) {
			System.out.println("Loss on sale stock is: "+saleofstock);
		}

	}
	
	public static double saleofstock(int Ns,double Pp,double Pc,double Sp,double Sc) {
		double profit=((Ns*Sp)-Sc)-((Ns*Pp)+Pc);
		return profit;
	}

}
