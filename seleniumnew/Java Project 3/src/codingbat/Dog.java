package codingbat;

public class Dog extends Animal{
	
	
	public void introduce(){
		
		System.out.println("i am a dog");
	}

	public static void main(String[] args){
		
		
		Animal a = new Dog();
		
		a.introduce();
	}
	
	
}
