package sample;


import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> al = new LinkedList<String>();
		
		//List<String>ali = new LinkedList<>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		al.addFirst("Rajani");
		al.addLast("Vasisht");
		
		al.remove(1);
		System.out.println(al.getFirst());
		System.out.println(al.size());
		
		System.out.println(al);

	}

}
