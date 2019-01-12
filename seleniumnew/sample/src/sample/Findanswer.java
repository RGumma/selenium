package sample;

public class Findanswer {
	
	int answer;
	
	int onlyonebranch;
	
	public boolean findAnswer(boolean check){
		
		if(check){
			
			onlyonebranch =1;
			 answer =1;
			 
		}else{
			
			answer =2;
		}
		return check;
		
	}
	public static void main(String[] args){
			
			Findanswer f = new Findanswer();
			
			System.out.println(f.answer);
			System.out.println(f.onlyonebranch);
			
    }

}
