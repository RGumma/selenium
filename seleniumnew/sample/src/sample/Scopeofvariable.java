package sample;

public class Scopeofvariable {
	
	
	
	public void findAnswer(boolean check){
		
		int answer;
		int onlyonebranch;
		
		if(check){
			
			onlyonebranch=1;
			answer =1;
			
			System.out.println(answer);
		
		}else{
			answer =2;
			onlyonebranch=2;
			
			System.out.println(onlyonebranch);
		}
		
	}
	
	public static void main(String[] args){
	Scopeofvariable s = new Scopeofvariable();
	s.findAnswer(true);
	
	
	
	
		
			
		 
	 }
		
		
}
