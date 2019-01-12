package inheritence;

public abstract class Vehicle {
	
	private void method1(){
		
		System.out.println("Vehicle.Private Method");
	}
	
	public abstract void methodx();
	
	protected void method2(){
		
		System.out.println("Vehicle.Protected Method");
	}
	
	public void method3(){
		
		System.out.println("Vehicle.public Method");
	}
	
	void method4(){
		
		System.out.println("Vehicle.default Method");
	}
}

class Car extends Vehicle{
	
	@Override
	public void method3(){
		
		System.out.println("Car.public method");
	}
	
	@Override
	public void method2(){
		
		System.out.println("Car.protected method");
	}
	
	public void method5(){
		
		System.out.println("Car.method5 method");
	}
	
	@Override
	void method4(){
		
		System.out.println("Car.default Method");
	}

	@Override
	public void methodx() {
		// TODO Auto-generated method stub
		
	}
}


class SportsCar extends Car{
	
	public void method6(){
		
		System.out.println("SportCar.method6");
	}

	@Override
	public void methodx() {
		// TODO Auto-generated method stub
		
	}
}

