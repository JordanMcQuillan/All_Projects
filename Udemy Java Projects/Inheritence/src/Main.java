
public class Main {
	
	 public static void main(String[] args)
	 {
		 Animal animal = new Animal ("Animal", 1, 1);
		 
		 Dog dog = new Dog("Yorke", 2, 2, 1, 2, 3);
		 dog.eat();//calls eat method in animal base class
	 }

}
