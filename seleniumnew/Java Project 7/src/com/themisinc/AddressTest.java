package com.themisinc;

public class AddressTest {

	public static void main(String[] args) {
		
		Address a1= new Address();
		
		String addr1= null;
		String addr2= "Macurthur";
	     String state="Texas";
	     String street ="houghton drive";
		String city = "Mckinney";
		String zipCode = "75070";
	     
		 
		a1.setAddr1(addr1);
		a1.setAddr2(addr2);
		a1.setState(state);
		a1.setStreet(street);
		a1.setCity(city);
		a1.setStreet(street);
		a1.setZipCode(zipCode);
		
		System.out.println("value of address  is" + a1);
		
		
		
	}

}
