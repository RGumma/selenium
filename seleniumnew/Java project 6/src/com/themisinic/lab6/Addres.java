package com.themisinic.lab6;

public class Addres {
	
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Addres(){}
	
	public Addres(String street, String city){
		
		this.street=street;
		this.city=city;
	}
	public Addres(String street, String city, String state, String zipCode){
		
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
	}
	
	public String toString(){
	 
		return street + city + state +zipCode;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		
		if(state==null){
			System.out.println(" states codes are not accepted");
			}if(state.length()!=2){
				System.out.println("state should accept only two character");
			}
			
			if(state.equals("HI")||
					state.equals("ME")||
					state.equals("AK")||
					state.equals("IL")||
					state.equals("CA")){
				this.state = state;
				
			}else{
				System.out.println("not a valid state");
				
			}
					
		
	}
		
	public String getzipCode(){
		return zipCode;
		
	}
	
	public void setzipCode(String zipCode){
		this.zipCode= zipCode;
		
		if(zipCode.length()!=5){
			
			System.out.println("Zipcode length is not valid");
		}
				
	
	}
	
	public static void main(String[] args){
		
		System.out.println("Hi");
	}
		
	}


