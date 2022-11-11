package Methods;

import java.util.Scanner;

public class paintjobestimator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of rooms");
		int rooms=input.nextInt();
		
		System.out.println("Enter the number of sqaure feet rooms");
		int squarefeetrooms=input.nextInt();
		
		double gallons=numberofgallons(squarefeetrooms);
		double labourhors=hoursoflabour(squarefeetrooms);
		double paintcost=costofpaint();
		double labourcharge=labourcharges(labourhors,squarefeetrooms);
		double totalcostpaintjob=totalcost(gallons,paintcost,labourcharge,rooms);
		display(gallons,labourhors,paintcost,labourcharge,totalcostpaintjob);

	}
	
	public static double numberofgallons(int squarefeetrooms) {
		double requiredgallons=squarefeetrooms/115;
		return requiredgallons;
		
	}
	
	public static double hoursoflabour(int squarefeetrooms) {
		double requiredhours=(squarefeetrooms/115)*8;
		return requiredhours;
		
	}
	
	public static double costofpaint() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the  cost of paint");
		double paintcost=input.nextDouble();
		return paintcost;
		
	}
	
	public static double labourcharges(double hours,int squarefeetrooms) {
		double labourcharges=hours*(squarefeetrooms/115)*18;
		return labourcharges;
		
	}
	
	
	public static double totalcost(double gallons,double paintcost,double labourcharges,int rooms) {
		double totalcost=rooms*((gallons*paintcost)+labourcharges);
		return totalcost;
		
	}
	
	public static void display(double gallons,double labourhors,double paintcost,double labourcharge,double totalcostpaintjob) {
		System.out.println("Number of gallons required: "+gallons);
		System.out.println("Labour hours  required: "+labourhors);
		System.out.println("paintcost: "+paintcost);
		System.out.println("labourcharge: "+labourcharge);
		System.out.println("totalcostpaintjob: "+totalcostpaintjob);
	}
	

}
