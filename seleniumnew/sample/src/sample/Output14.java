package sample;

public class Output14 {

	public static void main(String[] args) {
		
		String s ="Hello";
		
		String t = new String(s);
		
		if("Hello".equals(s)){
			
			System.out.println("One");
		}
			
		if(t==s){
		
			System.out.println("Two");
			
		}
		
        if(t.equals(s)){
        	
        	
        	System.out.println("three");
       
       }
        
        
        if("Hello" ==s){
        	
        	System.out.println("four");
        }
        
        if("Hello" ==t){
        	
        	System.out.println("five");
        }
        
        
	}

}
