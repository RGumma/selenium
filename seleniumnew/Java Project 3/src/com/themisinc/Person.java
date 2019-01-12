package com.themisinc;

public class Person {
	
	private String name;
	private int age;
	private char sex;

	@Override
	public String toString(){
		
		return name+age+sex;
 	}
	
	public String getName() {

		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		if(age>=20 && age <=40){
			
			this.age = age;
		}else{
			
			System.out.println(" do not accept the person age");
		}
	}
	
	public char getSex() {
	
		return sex;
	}
	
	public void setSex(char sex) {
		
		if(sex =='M' || sex =='F'){
			
			this.sex=sex;
		}else{
			
			System.out.println("do not accept the person sex");
		}
	}
		
	@Override
	public boolean equals(Object obj){
			
		boolean result =false;
			
		if(this.sex== ((Person)obj).sex && 
		    this.age==((Person)obj).age && 
			this.name.equals(((Person)obj).name)){
		 
			
		
		}
		return result;
	} 
}
		

