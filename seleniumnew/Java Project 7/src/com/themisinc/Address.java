package com.themisinc;

public class Address {

	private String addr1;
	private String addr2;
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public String toString() {

		return addr1 + addr2 + street + city + state + zipCode;
	}

	public String getAddr1() {

		return addr1;
	}

	public void setAddr1(String addr1) {

		if (addr1 != null) {
			this.addr1 = addr1;
		} else {
			System.out.println("not a valid address");
		}
	}

	public String getAddr2() {

		return addr2;
	}

	public void setAddr2(String addr2) {

		this.addr2 = addr2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		if (street != null) {
			this.street = street;
		} else {

			System.out.println("not a valid street");
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if (city != null) {
			this.city = city;
		} else {
			System.out.println("not a valid city");
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		if (state != null) {
			this.state = state;
		} else {
			System.out.println("not a valid state");
		}
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		if (zipCode != null) {
			this.zipCode = zipCode;
		} else {
			System.out.println("not a valid zipcode");
		}
	}
	
	public boolean equals(Object obj){
		
		boolean result =false;
		
		if(this.addr1.equals(((Address)obj).addr1) &&
				this.addr2.equals(((Address)obj).addr2)&&
						this.city.equals(((Address)obj).city)&&
						this.state.equals(((Address)obj).state) &&
						this.street.equals(((Address)obj).street)&&
						this.zipCode.equals(((Address)obj).zipCode)){
			
			result = true;
				
		}
			return result;
		
	}

}
