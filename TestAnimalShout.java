package polymorphism.animal.sound;

public class TestAnimalShout {

	public static void main(String[] args) {
		Animal myAnimal = null;
		
		myAnimal = new Dog();
		myAnimal.shout();
		
		myAnimal = new Horse();
		myAnimal.shout();
		
		myAnimal = new Cat();
		myAnimal.shout();

	}

}
