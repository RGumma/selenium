
 interface InterfaceDemo1 {
	
	abstract void test();
	void test1();
	

}
 
 interface InterfaceDemo2 extends InterfaceDemo1
 {
	 
 }
 

 class InterfaceDemo  implements InterfaceDemo1
{

	@Override
	public void test() {
		
		System.out.println("This is testmethod1");
		
	}

	@Override
	public void test1() {
		System.out.println("This is testmethod2");
		
	}
	
	public static void main(String args[])
	{
		InterfaceDemo1 i12 =new InterfaceDemo();
		InterfaceDemo i1=new InterfaceDemo();
		i1.test();
	}
	
}