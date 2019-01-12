package com.learning.java;

public class VehicleTest {

	public static void main(String[] args){
		
		//MotorVehicle m = new MotorVehicle();
		//MotorVehicle m1 = new MotorVehicle(10);
		
		//Cars c1 = new Cars();
		SportsCar sc = new SportsCar(1);
		
	}
}

class MotorVehicle{
	
	public MotorVehicle(){
		
		System.out.println("I'm in MotorVehicle constructor");
	}
	
	public MotorVehicle(int i){
		
		System.out.println("I'm in MotorVehicle over loader constructor with value "+i);
	}
}

class Cars extends MotorVehicle{
	
	public Cars(){
		
		System.out.println("I'm in Car constructor");
	}
	
	public Cars(int i){
		
		System.out.println("I'm in Car over loader constructor with value "+i);
	}
}

class SportsCar extends Cars{
	
	public SportsCar(){
		
		System.out.println("I'm in SportsCar constructor");
	}
	
	public SportsCar(int i){
		
		System.out.println("I'm in SportsCar over loader constructor with value "+i);
	}
	
	public SportsCar(int i, int j){
		
		System.out.println("I'm in SportsCar over loader constructor with values "+i+","+j);
	}
}
