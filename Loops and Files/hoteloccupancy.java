package LoopsandFiles;

import java.util.Scanner;

public class hoteloccupancy {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number of floor which a hotel have");
		int floor=input.nextInt();
	
		int rooms=0;
		int numberofoccupiedrooms=0;
		int totalroom=0;
		int totalroomoccupied=0;
		
		while(floor<1) {
		System.out.println("Invalid input!. Please enter a number of floor 1 or greater");
		floor=input.nextInt();
		}
		
		for(int i=1;i<=floor;i++) {
			System.out.println("enter the number of rooms in floor "+i);
			rooms=input.nextInt();
			
			while(rooms>=10) {
				System.out.println("Invalid input!. Please enter a number of floor 1 or greater");
				rooms=input.nextInt();
			}
			
			System.out.println("enter the number of occupied rooms in floor "+i);
			numberofoccupiedrooms=input.nextInt();
			
			totalroom+=rooms;
			totalroomoccupied+=numberofoccupiedrooms;
			
		}
		
		int vacant=totalroom-totalroomoccupied;
		double occupancyrate=(double)totalroomoccupied/totalroom;
		
		System.out.println("Total number of rooms the hotel has: " + totalroom);
		System.out.println("Total number of rooms occupied: " + totalroomoccupied);
		System.out.println("Total number of rooms vacant: " + vacant);
		System.out.println("Occupancy rate: " + occupancyrate);
		
		

	}

}
