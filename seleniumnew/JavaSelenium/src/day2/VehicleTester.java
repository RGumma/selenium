package day2;

public class VehicleTester {

	public static void main(String[] args){
	
		MotorVehicle xyz = new SportsCar();
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		if(o1==o2) {
			
			System.out.println("true");
		}else{
			
			System.out.println("false");
		}
		
		System.out.println(o1.equals(o2)); // this == obj
		
		String s1 = new String("Ravi");
		String s2 = new String("Ravi");
		if(s1==s2){
			
			System.out.println("True");
		}else{
			
			System.out.println("false");
		}
		
		System.out.println(s1.equals(s2));

		Name n1 = new Name("Ravi");
		Name n2 = new Name("Ravi");
		
		if(n1==n2) 
			System.out.println("True");
		else 
			System.out.println("false");
		
		System.out.println(n1.equals(n2));
		
		String s3 = "Ravi";
		String s4 = "Ravi";
		
		if(s3==s4) 
			System.out.println("True");
		else 
			System.out.println("false");
		
		System.out.println(s3.equals(s4));
	}
}

class Name{
	
	String name;
	Name(String name){
		
		this.name = name;
	}
}

class MotorVehicle{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected void drive(){
		
		System.out.println("Motorvehicle is driving");
	}
}

class Car extends MotorVehicle{
	
	@Override
	public void drive(){
		
		System.out.println("Car is driving");
	}
}

class SportsCar extends Car{
	
	@Override
	public void drive(){
		
		System.out.println("SportsCar is driving");
	}
}

class Truck extends MotorVehicle{
	
	@Override
	public void drive(){
		
		System.out.println("Truck is driving");
	}
}
