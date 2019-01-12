package sample;

public class Instance_Blocks {

	
	int eid;
	{
	
		eid=111;
		
	}
	
	void disp(){
		
	System.out.println("value of eid"+ eid);	
		
	}
	
	public static void main(String[] args){
		
		new Instance_Blocks ().disp();
		
		
	
		
	}

}
