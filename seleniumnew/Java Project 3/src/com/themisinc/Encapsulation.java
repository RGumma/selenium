package com.themisinc;

public class Encapsulation {
	
	
	private String name;
	private int idNum;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int i) {
		this.idNum = i;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String args[]){
		
		Encapsulation en = new Encapsulation();
		en.setAge(30);
		en.setIdNum(40);
		en.setName("Rajani");
		
		System.out.println(en.getIdNum()+ " "+ en.getAge() + " "+ en.getName());
		
		
	}

}
