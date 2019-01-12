package sample;

public class Localvariable {

	
	public int notvalid(){
			
			
			int y=10;
			int x =5;
			
			int reply= x+y; 
			
			return reply;
			
		}
		public static void main(String[] args) {
			
			Localvariable l = new Localvariable();
			l.notvalid();
			
			
		
	}

}
