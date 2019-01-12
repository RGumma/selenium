package themisinc;

public class Name {
	
 String name;
 int age;
	
	public Name(String name, int age){
		this.name=name;
		this.age = age;
	 
	}

	@Override
	public String toString() {
		return "Name [name=" + name + ", age=" + age + "]";
	}

}
