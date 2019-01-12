package sample;

public class Immutable {

	public static void main(String[] args){
	
	String s = "sachin";
	
	String a = s.concat("Tendulkar");
	
  System.out.println(a);
  
  
  StringBuilder s1 = new StringBuilder("abc");
  
  s1.append("!!!");
  
  System.out.println(s1);
  
  
  String a1 = "abc";
  
  String b =  a1.toUpperCase();
  
  b= b.replace("B", "2").replace('C','3');
  
  System.out.println(b);
  
  
  
  
  
  
  
  
  
  
			
			
	}
	
	
	
	
	
	
	

}
