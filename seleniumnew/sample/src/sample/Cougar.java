package sample;

class Feline {
	public String type = "f ";

	public Feline() {
		System.out.print("feline ");
	}
	public void go(){
		
		System.out.println(this.type);
	}
}

public class Cougar extends Feline {
	public Cougar() {
		System.out.print("cougar ");
	}

	public void go() {
		System.out.println(this.type);
		System.out.println(super.type);
		this.type = "c ";
		System.out.print(this.type + super.type);
	}

	public static void main(String[] args) {
		new Cougar().go();
		new Feline().go();
	}
}