package day1;

public class Person {

	private int age = 30;
	public String name = "Rajani";
	public static String message = "Hello World";
	
	private void method1(){

		System.out.println("I'm in method1");
	}
	
	public void method2(){
	
		System.out.println("I'm in method2");
	}
	
	public static void method3(){
		
		System.out.println("I'm in method3");
	}
	
	public static void main(String[] args){
	
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(Person.message);
		
		p1.method1();
		p1.method2();
		p1.method3();
	}
}

