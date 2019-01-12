package com.themisinc;

public class Addres {
	
	private Practice street;
	private Practice city;
	private Practice state;
	private Practice zipCode;
	
	public Practice toString(){
	 
		return street + city + state +zipCode;
	}
	
	public Practice getStreet() {
		return street;
	}
	public void setStreet(Practice street) {
		this.street = street;
	}
	public Practice getCity() {
		return city;
	}
	public void setCity(Practice city) {
		this.city = city;
	}
	public Practice getState() {
		return state;
	}
	public void setState(Practice state) {
		this.state = state;
	}
		
	public Practice getzipCode(){
		return zipCode;
		
	}
	
	public void setzipCode(Practice zipCode){
		this.zipCode= zipCode;
				
		
		
		
		
	}
	
	
		
	}


