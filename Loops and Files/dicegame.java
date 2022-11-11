package LoopsandFiles;

import java.util.*;

public class dicegame {

	public static void main(String[] args) {
		
		Random rn=new Random();
		int randcomp=0;
		int randuser=0;
		int countcomp=0;
		int countuser=0;
		
		for(int i=1;i<=10;i++) {
			randcomp=rn.nextInt(7);
			randuser=rn.nextInt(7);
			
			if(randcomp>randuser) {
				countcomp+=1;
			}
			
			else if(randcomp<randuser) {
				countuser+=1;
			}
		}
		
		if(countcomp>countuser) {
			System.out.println("Winner is computer! score is: "+countcomp);
			System.out.println("User loose! score is: "+countuser);
		}
		
		else if(countcomp<countuser) {
			System.out.println("Winner is user! score is: "+countuser);
			System.out.println("Computer loose! score is: "+countcomp);
		}
		
		else if(countcomp==countuser) {
			System.out.println("Both Tie! score is computer is: "+countcomp+" score is user is: "+countuser);
		}

	}

}
