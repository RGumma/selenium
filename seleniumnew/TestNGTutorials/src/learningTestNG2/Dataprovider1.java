package learningTestNG2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {

	
		
		@Test(dataprovider="getdata")
		
			public void setdata(String username, String password){
				
				System.out.println("you have provided username " +username);
				System.out.println("you have provided the password" +password);
				
				
			}
			
		@DataProvider
		public Object[][] getData(){
			
			
			
			
			return data;
					
					
			
			
		}
		
		
		

	}


