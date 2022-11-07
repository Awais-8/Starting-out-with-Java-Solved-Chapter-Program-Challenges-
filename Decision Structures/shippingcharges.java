package Chapter3;

import java.util.Scanner;
public class shippingcharges {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the weigth of packages");
		int weigth=input.nextInt();
		
		System.out.println("Enter the dsitance");
		int distance=input.nextInt();
		
		int distanceremainder=distance/500;
		
		if(distance == 500) {
			
			if(weigth<=2) {
				System.out.println("Total shipment cost is :"+(distanceremainder*1.10));
			}
			
			else if(weigth>2 && weigth<=6) {
				System.out.println("Total shipment cost is :"+(distanceremainder*2.20));
			}
			
			else if(weigth>6 && weigth<=10) {
				System.out.println("Total shipment cost is :"+(distanceremainder*3.70));
			}
			
			else if(weigth>10) {
				System.out.println("Total shipment cost is :"+(distanceremainder*3.80));
			}
		}
		
		else if(distance > 500) {
			
			if(weigth<=2) {
				System.out.println("Total shipment cost is :"+((distanceremainder+1)*1.10));
			}
			
			else if(weigth>2 && weigth<=6) {
				System.out.println("Total shipment cost is :"+((distanceremainder+1)*2.20));
			}
			
			else if(weigth>6 && weigth<=10) {
				System.out.println("Total shipment cost is :"+((distanceremainder+1)*3.70));
			}
			
			else if(weigth>10) {
				System.out.println("Total shipment cost is :"+((distanceremainder+1)*3.80));
			}
		}

	}

}
