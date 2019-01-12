package themisinc;

public class Smallestofallnumbers {

	public void findingsmallestnumber(int x, int y, int z) {

		if (x < y) {

			System.out.print("x is smallest");

		} else if (y<z) {

			System.out.println("y is smallest");

		}else{
			
			
			System.out.println("z is smallest");
		}

		}
       
	

	public static void main(String[] args) {
		
		Smallestofallnumbers sn = new Smallestofallnumbers();
		
		sn.findingsmallestnumber(40,10,20);

	}

}
