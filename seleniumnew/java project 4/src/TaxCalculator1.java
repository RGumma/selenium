
public class TaxCalculator1{
	
	private static int numstates=5;
	private static String[] statecode={"AK","HI","ME","IL","CA"};
	private static double[] taxrate={5.0,8.0,4.5,7.5,10.0};
	
	public static double getTax(double subtotoal, String state){
		
		double taxRate=-1;
		double taxAmount=0;
		int i;
	for(i=0; i<numstates; i++){
		
		
	}
	
		
		
		taxAmount = (subtotal*taxRate)/100;
		return taxAmount;
	}

	
	
	
	
	
}
