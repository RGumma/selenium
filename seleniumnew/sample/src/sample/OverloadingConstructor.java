package sample;

public class OverloadingConstructor {
	int weight=0;
	String color=null;
	int height =0;
	public OverloadingConstructor(){
		
		/*this.weight = 0;
		this.color=null;
		this.height=0;*/
		this(0,null,0);
	}
	
	public OverloadingConstructor(int weight){
		/*this.weight = weight;
		this.color=null;
		this.height = 0;*/
		this(weight, null,0);
	}
	
	public OverloadingConstructor(int weight, String color){
		/*this.weight = weight;
		this.color=color;
		this.height = 0;*/
		this(weight,color,0);
	}
	
	public OverloadingConstructor(int weight,String color, int height){
		this.weight = weight;
		this.color=color;
		this.height = height;
	}
	
	public void display(){
		
		System.out.println(this.height+":"+this.color+":"+this.weight);
	}
	
	public static void main(String...args){
		
		OverloadingConstructor oc = new OverloadingConstructor();
		oc.display();
		
		OverloadingConstructor oc1 = new OverloadingConstructor(10);
		oc1.display();
		
		OverloadingConstructor oc2 = new OverloadingConstructor(10,"Blue");
		oc2.display();
		
		OverloadingConstructor oc3 = new OverloadingConstructor(10,"Blue",20);
		oc3.display();
	}
}
