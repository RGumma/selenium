package day3;

public class ExcerciseTest {
	
	
	
	public static void main(String[] args){
		
		int y;
		int z;
	   Excercise desk = new Excercise();
	   Excercise chair = new Excercise();
	   
	  
	   desk.setName("oak desk");
	   desk.setPrice(1400);
	   desk.setQuantity(2);
	   
	   chair.setName("folded chair");
	   chair.setPrice(200);
	   chair.setQuantity(2);
	   
	   
	  y= desk.getPrice() * desk.getQuantity();
	  
	 z= chair.getPrice() * chair.getQuantity();
			  
	   
	   
	    System.out.println(desk.getName() + "price is" + y);
	    System.out.println(chair.getName() + "price is " + z);
	    System.out.println("total price is" + ( y+z));
	    
	    		
	    
	    		
	}

}
