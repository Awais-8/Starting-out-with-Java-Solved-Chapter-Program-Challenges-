package Chapter3;

import java.util.Scanner;
public class runningtherace {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the name of runner 1");
		String name1=input.nextLine();
		
		System.out.println("Enter the name of runner 2");
		String name2=input.nextLine();
		
		System.out.println("Enter the name of runner 3");
		String name3=input.nextLine();
		
		System.out.println("Enter the time for runner 1");
		double time1=input.nextDouble();
		
		System.out.println("Enter the time for runner 2");
		double time2=input.nextDouble();
		
		System.out.println("Enter the time for runner 3");
		double time3=input.nextDouble();
		
		if(time1 < time2 && time1 < time3) {
			if(time2<time3) {
			System.out.println(name1+"finished the race first in "+time1+" and second place is "+name2+" in "+time2+" and third place is "+name3+" in "+time3);
			}
			
			else {
				System.out.println(name1+"finished the race first in "+time1+" and second place is "+name3+" in "+time3+" and third place is "+name2+" in "+time2);
			}
		}
		

		if(time2 < time1 && time2 < time3) {
			if(time1<time3) {
			System.out.println(name2+"finished the race first in "+time2+" and second place is "+name1+" in "+time1+" and third place is "+name3+" in "+time3);
			}
			
			else {
				System.out.println(name1+"finished the race first in "+time1+" and second place is "+name3+" in "+time3+" and third place is "+name1+" in "+time1);
			}
		}
		
		

		if(time3 < time2 && time3 < time1) {
			if(time1<time2) {
			System.out.println(name3+"finished the race first in "+time3+" and second place is "+name1+" in "+time1+" and third place is "+name2+" in "+time2);
			}
			
			else {
				System.out.println(name1+"finished the race first in "+time1+" and second place is "+name2+" in "+time2+" and third place is "+name1+" in "+time1);
			}
		}

		
		
		

		


	}

}
