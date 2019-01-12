package sample;


public class Strudent4 {

	int id;
	
	String name;
	
	static String college = "JNTU";
	
	public Strudent4(int i, String n){
		
		this.id = i;
		
		this.name = n;
		
		
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Strudent4 [id=" + id + ", name=" + name + ", college=" +college +"]";
	}



	public Strudent4(int i, String n, String c){
		
		this.id =i;
		
		this.name = n;
		
		
		
		
	}
	
 


public static void main(String[] args){
		
		Strudent4 s1 = new Strudent4(10, "Rajani" );
		Strudent4 s2 = new Strudent4(11,"Rajitha");
		
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		
	}
		
		
		
		
		
		
	}
		
		
		
	
		
		




