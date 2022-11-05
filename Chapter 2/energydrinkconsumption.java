package Chapter1;


public class energydrinkconsumption {

	public static void main(String[] args) {
		int softdrinkserv=12467;
		double oneormore=softdrinkserv*0.14;
		double citrus=softdrinkserv*0.64;
		
		System.out.println("Soft drink serveyed is "+softdrinkserv);
		System.out.println("The approximate number of customers in the survey who purchase one or more\r\n"
				+ "energy drinks per week "+oneormore);
		System.out.println("The approximate number of customers in the survey who prefer citrus-flavored\r\n"
				+ "energy drinks is "+citrus);

	}

}
