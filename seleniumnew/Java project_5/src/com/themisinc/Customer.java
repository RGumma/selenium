package com.themisinc;

import java.util.Date;

public class Customer {
	
	private int id;
	private Practice lastName;
	private Practice firstName;
	private Addres address;
	private Date lastOrderDate;
	private double lastOrderAmount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Practice getLastName() {
		return lastName;
	}
	public void setLastName(Practice lastName) {
		this.lastName = lastName;
	}
	public Practice getFirstName() {
		return firstName;
	}
	public void setFirstName(Practice firstName) {
		this.firstName = firstName;
	}
	public Addres getAddress() {
		return address;
	}
	public void setAddress(Addres address) {
		this.address = address;
	}
	public Date getLastOrderDate() {
		return lastOrderDate;
	}
	public void setLastOrderDate(Date lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}
	public double getLastOrderAmount() {
		return lastOrderAmount;
	}
	public void setLastOrderAmount(double lastOrderAmount) {
		this.lastOrderAmount = lastOrderAmount;
	}
	
	
	

}
