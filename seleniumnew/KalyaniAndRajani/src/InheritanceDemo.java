

class A
{

	int age;
	String name;
	
	void employee_details(){
	
	System.out.println("The age is"+age);
	System.out.println("The name is"+name);
}

}
	
	
 class InheritanceDemo extends A{
	
	
	public static void main(String args[])
	{
	InheritanceDemo i1=new InheritanceDemo();
	i1.employee_details();
	
	}
}
