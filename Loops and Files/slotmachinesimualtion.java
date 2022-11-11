package LoopsandFiles;

import java.util.*;

public class slotmachinesimualtion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		

		int amount=0;
		Random rn=new Random();
		

		int number=0;
		
		while(number!=-99) {
			System.out.println("Enter the amount ");
			amount=input.nextInt();
			
			int slote1=rn.nextInt(5);
			int slote2=rn.nextInt(5);
			int slote3=rn.nextInt(5);
				
				if(slote1==0) {
					System.out.println("Slected word is: Cherries in slote1");
				}
				
				else if(slote1==1) {
					System.out.println("Slected word is: Oranges in slote1");
				}
				
				else if(slote1==2) {
					System.out.println("Slected word is: Plums in slote1");
				}
				
				else if(slote1==3) {
					System.out.println("Slected word is: Bells in slote1");
				}
				
				else if(slote1==4) {
					System.out.println("Slected word is: Melons in slote1");
				}
				
				else if(slote1==5) {
					System.out.println("Slected word is: Bars in slote1");
				}
				
				
				
				
				if(slote2==0) {
					System.out.println("Slected word is: Cherries in slote2");
				}
				
				else if(slote2==1) {
					System.out.println("Slected word is: Oranges in slote2");
				}
				
				else if(slote2==2) {
					System.out.println("Slected word is: Plums in slote2");
				}
				
				else if(slote2==3) {
					System.out.println("Slected word is: Bells in slote2");
				}
				
				else if(slote2==4) {
					System.out.println("Slected word is: Melons in slote2");
				}
				
				else if(slote2==5) {
					System.out.println("Slected word is: Bars in slote2");
				}
				
				
				
				
				
				if(slote3==0) {
					System.out.println("Slected word is: Cherries in slote3");
				}
				
				else if(slote3==1) {
					System.out.println("Slected word is: Oranges in slote3");
				}
				
				else if(slote3==2) {
					System.out.println("Slected word is: Plums in slote3");
				}
				
				else if(slote3==3) {
					System.out.println("Slected word is: Bells in slote3");
				}
				
				else if(slote3==4) {
					System.out.println("Slected word is: Melons in slote3");
				}
				
				else if(slote3==5) {
					System.out.println("Slected word is: Bars in slote3");
				}
				
				
				
				
				if(slote1!=slote2 && slote2!=slote3 && slote1!=slote3) {
					System.out.println("You win the price: 0");
				}
				
				else if(slote1==slote2 && slote1==slote3) {
					System.out.println("You win the price: "+(amount*3));
				}
	
				
				else if(slote1==slote2 || slote2==slote3 || slote1==slote3) {
					System.out.println("You win the price: "+(amount*2));
				}
				
				
				
				System.out.println("Press -99 to stop game");
				number=input.nextInt();
			}
			

		
		}

	}


