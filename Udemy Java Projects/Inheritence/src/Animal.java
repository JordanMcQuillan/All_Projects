
public class Animal {
	
	private String name;
	private int brain;
	private int weight;
	
	public Animal(String name, int brain, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.weight = weight;
	}

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBrain() {
		return brain;
	}
	public void setBrain(int brain) {
		this.brain = brain;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void eat() {}
	
	public void move {}
	
}


