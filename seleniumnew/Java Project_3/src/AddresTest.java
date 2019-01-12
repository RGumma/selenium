
public class AddresTest {

	public static void main(String[] args) {
		
		
		Addres addr = new Addres();
		
		String State = "ME";
		
		
		
		
		addr.setState(State);
		addr.setStreet("houghton drive");
	
		System.out.println(addr.getState());
		System.out.println(addr.getStreet());
		
		System.out.println("Testing invalid data");
		
		 String state = "KI";
		addr.setState(state);
	
		System.out.println(addr.getState());
		
		
		
		
		
	}

}
