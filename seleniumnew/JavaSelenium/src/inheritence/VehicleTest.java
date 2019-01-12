package inheritence;

public class VehicleTest {

	
	public static void main(String[] args){
		
		//Vehicle v = new Vehicle();
		
	//	v.method2(); // vechile protected method
//		v.method3();  //vechile public method
//		v.method4(); // vechicle default method*/
		
		Car c1 = new Car();
		Vehicle v1 = new Car();
		
		v1.method2();  //car protected method
		v1.method3();  //   car public method
		v1.method4();  //       car default method*/
		
		
		c1.method2();    // car protected method
		c1.method3();    //  cat public method
		c1.method4();    //      car default method
		c1.method5();    // car methd 5 method*/
		
		SportsCar s1 = new SportsCar();
		Car c2 = new SportsCar();
		Vehicle v2 = new SportsCar();
		
		c2.method3(); 
		c2.method5(); 
	
		s1.method6(); 
		s1.method5(); 	
	}
}
