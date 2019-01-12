package codingbat;

class Myclaculator implements AdvancedArithmeitc{


	public void divior_sum(int n) {
		
		int sum=0;
	     int j= 1;
		   
		for(int i=1; i<=n ; i++){
			
			if(n%i==0){
				
				sum = sum+i;
			}
		}
   
		System.out.print(sum);
	}
	

	

	public static void main(String[] args){
		
		
		Myclaculator c = new Myclaculator();
		
		c.divior_sum(6);
		
		
		
		
	}

}
