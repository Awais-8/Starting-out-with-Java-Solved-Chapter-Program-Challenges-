package Chapter1;

public class stocktransactionprogram {

	public static void main(String[] args) {
	
		double commbought=(1000*32.87)*0.02;
		double commsold=(1000*33.92)*0.02;
		double soldstock=1000*33.92;
		double paidstock=1000*32.87;
		double profit=((1000*33.92)+((1000*33.92)*0.02))-((1000*32.87)+((1000*32.87)*0.02));
		
		System.out.println("The amount of money Joe paid for the stock is "+paidstock);
		System.out.println("The amount of commission Joe paid his broker when he bought the stock is "+commbought);
		System.out.println("The amount that Joe sold the stock for is "+soldstock);
		System.out.println("The amount of commission Joe paid his broker when he sold the stock is "+commsold);
		System.out.println("The amount of profit that joe made is"+profit);
	}

}
