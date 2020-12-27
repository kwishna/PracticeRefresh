package test.java.rough;

class Smiley{

	String name;
	long roll;
	boolean isOk;

	protected Smiley(){
		System.out.println("protected smiley");
	}

	protected Smiley(String name, long roll){
		this.name = name;
		this.roll = roll;
		System.out.println(this.name +" Has Age: "+this.roll);
	}

	public void value() {
		System.out.println("name is "+this.name);
		System.out.println("roll is "+this.roll);
		System.out.println("roll is "+this.isOk);
	}
}

public class Inherit extends Smiley{

	protected Inherit(String name, long roll, boolean isOk){
		this.name = name;
		this.roll = roll;
		this.isOk = isOk;
		System.out.println(this.name +" Has Age: "+this.roll+" Is Ok? "+this.isOk);
	}

	public static void main(String[] args) {
		Smiley s = new Smiley();
		s.value();
	}

}
