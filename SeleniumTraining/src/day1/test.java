package day1;

public class test 
{

	int y = 10;
	int marks=100;
	static int rollno=2;
	
	public static void main(String[] args) {
		
		test t = new test();
		int y= t.marks;
		System.out.println(y);
		{
			y = 200;
			System.out.println(y);
		}
		 System.out.println(y);
		 System.out.println(rollno);
		 System.out.println(t.marks);
		 t.print();
	}
	
	private void print(){
		
		//int y = 40;
		/* int y =40*/
		test t = new test();
		t.print();
		System.out.println(y);
	}
}


