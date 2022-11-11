package Methods;


public class fallingdistance {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			double fdistance=fallingdistance(i);
			System.out.println("falling distance in "+i+" seconds is :"+fdistance+"meters");
		}

	}
	
	public static double fallingdistance(int time) {
		double distance=0.5*(9.8*Math.pow(time, 2));
		return distance;
	}

}
