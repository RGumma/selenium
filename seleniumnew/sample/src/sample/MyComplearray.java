package sample;

public class MyComplearray {

	public static void main(String[] args) {
		
		int [] [] list ={{1,13,5},{1,2,5},{2,7,12}};
		
		System.out.println(list.length);
		
		int searchvalue =2;
		
		int positionx =-1;
		
		int positiony =-1;
		
		Parent_loop:for(int i =0; i<list.length; i++){
			
			System.out.println(list[i].length);
			for(int j=0; j<list[i].length; j++){
			
			if(list[i][j] == searchvalue){
				
				positionx =i;
				positiony =j;
				break Parent_loop;
				
			}	
			
			}
		}
		
		if(positionx== -1 || positiony ==-1){
			
		   	System.out.println("Value  "+searchvalue + " not found");
		   	
		}else{
		   		
		   		System.out.println("Value "+ searchvalue+" found at : " +"("+positionx +" ," +positiony +")");
		   	}
		   			
		 
		}

	}


