package com.learning.java;

public class Car {

	
	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	private int modelNumber;
	
	@Override
	public boolean equals(Object obj){

		boolean result = false;
		if(this.modelNumber==((Car)obj).modelNumber){
			
			result = true;
		}
		
		return result;
	}
}
