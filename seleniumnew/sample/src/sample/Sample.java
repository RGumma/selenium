package sample;

public class Sample {
	static int i;
	public static void main(String...args){
		int i;
		for(i=2;i<5;){
			
			System.out.println(++i);
		}
		
		System.out.println("Value "+i);
		print();
		
		String name1 = "Ravi";
		final String name2 ="Kota";
		testSwitch(name1,name2);
		
		
	}
	
	public static void print(){
		
		System.out.println(i);
	}
	
	public static void testSwitch(String value1, final String value2){
		
		final String value3 = "kota";
		switch(value1){
		
		case value3:{}
		}
	}
}
