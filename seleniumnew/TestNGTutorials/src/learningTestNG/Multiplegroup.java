package learningTestNG;

import org.testng.annotations.Test;

public class Multiplegroup {

	@Test(groups={"group-one"})
	public void testmethodone(){
	
		System.out.println("Test method one belonging to group");
		
	}
	
	@Test(groups={"group-one", "groups-two"})
	
	public void testmethodtwo(){
		
		System.out.println("Test method two belonging to both the group");
	}
	
	@Test(groups={"group-two"})
	public void testmethodthree(){
		
		System.out.println("Test method three belonging to group");
	}
		
		
		
		
		

	}


