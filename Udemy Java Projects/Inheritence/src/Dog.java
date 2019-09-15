
public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	
	public Dog(String name, int brain, int weight, int eyes, int legs, int tail) {
		super(name, 1, 1); // these are from animal
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
	}

	public void chew() {}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat(); //calls this method instead of the 
		//eat method in base class animal
		chew();// calls chew method above 
	}
	
	
	

}
