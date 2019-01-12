package com.themisinc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsTest {

	class Fruit{
		
		private String fruitName;
		
		Fruit(String fruitName){
			
			this.fruitName=fruitName;
		}
		
		/*@Override
		public boolean equals(Object o){
			
			Fruit other = (Fruit)o;
			return this.fruitName.equalsIgnoreCase(other.fruitName);
		}
		
		@Override
		public int hashCode(){
			
			return this.fruitName.hashCode();
		}*/
	}
	
	public void testRealFruits(){
		
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Grape"));
		fruits.add(new Fruit("Orange"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("Cherry"));
		System.out.println(fruits.remove(2));
		System.out.println(fruits.size());
		System.out.println(fruits.remove(new Fruit("apple")));
		System.out.println(fruits.size());
	
	}
	public Long testAdd(List<Integer> list){
		
		Long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		Long stop = System.currentTimeMillis();
		return (stop-start);
	}
	
	public void testFruits(){
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("grapes");
		fruits.add("Orange");
		fruits.add("apple");
		System.out.println(fruits.remove("apple"));
		System.out.println(fruits.size());
	}
	
	public void testFruitSet(){
		
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Oramge");
		fruits.add("pear");
		fruits.add("aPPle");
		fruits.add("Apple");
		
		System.out.println(fruits.size());
		
		Set<Fruit> realFruits = new HashSet<>();
		Fruit apple = new Fruit("Apple");
		Fruit newApple = apple;
		realFruits.add(apple);
		realFruits.add(new Fruit("Grapes"));
		realFruits.add(newApple);
		
		System.out.println(realFruits.size());
	}
	
	public static void main(String...args){
		
		CollectionsTest ct = new CollectionsTest();
		//System.out.println(ct.testAdd(new ArrayList<Integer>()));
		//System.out.println(ct.testAdd(new LinkedList<Integer>()));
		//ct.testFruits();
		//ct.testFruits();
		
		ct.testRealFruits();
	}
}
