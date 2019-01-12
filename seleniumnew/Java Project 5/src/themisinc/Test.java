package themisinc;

public class Test {
	
	
	public static int a=5;
	
	public int b= 10;
	
	public void modifyStatic(){
		
		a++;
	}
	
	public void modifyInstance(){
		
		b++;
	}
	
	public static void main(String[] args) {
	
		Test t1 = new Test();
		Test t2 = new Test();
		
		System.out.println(Test.a);
		System.out.println(t1.b);
		System.out.println(Test.a);
		System.out.println(t2.b);
		
		Test.modifyStatic();
		System.out.println(Test.a);
		System.out.println(t2.a);
		t1.modifyInstance();
		System.out.println(t1.b);
		System.out.println(t2.b);
	
	}
}

