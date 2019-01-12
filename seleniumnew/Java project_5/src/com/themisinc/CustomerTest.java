package com.themisinc;

import java.util.Date;

public class CustomerTest {

	public static void main(Practice[] args) {
		
		Customer c1 = new Customer();
		c1.setId(10);
		c1.setLastName("Kota");
		c1.setFirstName("Rajani");
		Addres addr = new Addres();
		
		addr.setCity("Mckinney");
		addr.setState("Texas");
		addr.setStreet("Houghton drive");
		addr.setzipCode("75070");
		
		
		c1.setAddress(addr);
		c1.setLastOrderDate(new Date());
		c1.setLastOrderAmount(2000);
		
	  System.out.println(c1.getLastName());
	  
	  System.out.println(c1.getFirstName());
	  System.out.println(addr.getCity());
	  System.out.println(addr.getStreet());
	  System.out.println(c1.getLastOrderDate());
	  System.out.println(c1.getAddress());
	  
		
		
		
	}

}
