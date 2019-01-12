
public class MethodOverLoading {

	
	int num1,num2,num3,num4,add;
	
	public MethodOverLoading(int num1,int num2) {
		
		int num6;
		add=num1+num2;
		System.out.println("the additionof num"+add);
		
	}
	
public MethodOverLoading(int num1,int num2,int num3) {
		
		add=num1+num2+num3;
		System.out.println("the additionof num"+add);
		
	}
	
public MethodOverLoading(int num1,int num2,int num3,int num4) {
	
	add=num1+num2+num3+num4;
	System.out.println("the additionof num"+add);
	
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading m1=new MethodOverLoading(10,20,30);
		MethodOverLoading m2 =new MethodOverLoading(20, 30);
	}

}
