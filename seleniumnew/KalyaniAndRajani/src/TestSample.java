


//Author:Arun
//Date:  
 class TestSample122 {
	
	
	int a;
	String name;
	float f;
	
	void method1(int b,String name1,float f1)
	{
		
		a=b;
		name=name1;
		f=f1;
		
		System.out.println("The value of a is"+a);
		System.out.println("The value of name is"+name);
		System.out.println("The value of name is"+f);
		
	}
	
	 TestSample122(String name,float f) {
		
		 //System.out.println("I am in a Constructor method");
		 
		 System.out.println("The value of a is"+a);
			System.out.println("The value of name is"+name);
			System.out.println("The value of name is"+f);
	}
	
	public static void main(String args[]){
	
	TestSample122 testSample =new TestSample122("arun",11.25f);
	
	
	//testSample.method1(10,"arun",10.25f);
	//testSample.method1(20,"kumar",11.25f);
	

}
}
