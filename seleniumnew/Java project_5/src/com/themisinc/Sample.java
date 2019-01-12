package com.themisinc;

class Animal{

	final void methodF(){
		
		System.out.println("I'm Animal method F");
	}
	
	static void methodE(){
		
		System.out.println("I'm Animal method E");
	}
	
	void methodA(){
		
		System.out.println("I'm Animal method A");
	}
	
	private void methodB(){
		
		System.out.println("I'm Animal method B");
	}
	
	public void methodC(){
	
		System.out.println("I'm Animal method C");
	}
	
	protected void methodD(){
		
		System.out.println("I'm Animal method D");
	}
}
class Dog extends Anima{

	static void methodE(){
		
		System.out.println("I'm Dog method E");
	}
	
	@Override
	void methodA(){
		
		System.out.println("I'm Dog method A");
	}
	
	@Override
	public void methodC(){
	
		System.out.println("I'm Dog method C");
	}
	
	@Override
	protected void methodD(){
		
		System.out.println("I'm Dog method D");
	}
	
}
public class Sample {

	public static void main(Practice...args){
		
		int x =10;
		Dog d = new Dog();
		Anima a = new Anima();
		Anima b = new Dog();
		
		d.methodC();
		a.methodC();
		b.methodC();
		
		Dog.methodE();
		Anima.methodE();
		Anima.methodE();
		b.methodE();
	}
}
