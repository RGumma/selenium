package sample;

public class Nestedloop {

	public static void main(String[] args) {
		
		int sum=0;
		for(int num =5; num<=10; num++){
			
			 for(int fact =2; fact<= num; fact++){
				
				if(num%fact==0)
					
					sum= sum+fact;
				
				}//end of fact loop 
			
			System.out.println( "sum is " + sum);
				
				
			}//end of num 
			
		}

	}


