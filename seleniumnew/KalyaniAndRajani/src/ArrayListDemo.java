import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Set a=new HashSet();
		a.add(20);
		a.add(30);
		a.add(40);
	   Iterator it =a.iterator();
	   while(it.hasNext())
	   {
		  int i= (Integer) it.next();
		 System.out.println(i);
		  
		   
	   }
		

	}

}
