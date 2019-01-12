package com.learning.java;

public class Car1 {
	
	private static int x;
	private int y;
	
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		Car1.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public static void main(String[] args){

		Car1 c1=new Car1();
		
		Car1 c2 = new Car1();
		Car1 c3= new Car1();
		
		Car1.setX(1);
		c1.setY(2);
		c1.setX(1);
		
		c2.setX(2);
		c3.setX(3);
		
		c1.setY(4);
		
		System.out.println(c1.getY());
		System.out.println(c2.getY());
		
		System.out.println(c2.getX());
		System.out.println(c3.getX());
		System.out.println(c3.getX());
		
		System.out.println(c1.getX());
		System.out.println(c2.getX());
		
		System.out.println(c1.getX());
		System.out.println(c2.getX());
		System.out.println(c3.getX());
		
		System.out.println(Car1.getX()); //1
		System.out.println(c1.getY()); //2
		
		System.out.println(c2.getX()); //1
		System.out.println(c2.getY()); //2
		
		System.out.println(c3.getX()); //1
		System.out.println(c3.getY()); //2
		
		
	}
}
