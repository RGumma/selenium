package sample;

public class Orde {

	String value = "t";
	
	{
		
		value += "a";
		
	}
	
	{ 
		value +="c";

  }

public Orde(){

	value +="b";
	
}


public Orde(String s){
	value +=s;
	
}
	
public static void main(String[] args){
	Orde od = new Orde("f");
	
	od = new Orde();
	
	System.out.println(od.value);
	
}





}
