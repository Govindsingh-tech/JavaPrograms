package Abstraction;
//Abstract class
abstract class Animal {  		// Abstract method (does not have a body)
	public abstract void animalSound();
	public void sleep() {		// Regular method
		System.out.println("Zzzz");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	@Override
	public void animalSound() {		 // The body of animalSound() is provided here
		System.out.println("The pig says: wee wee!");
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		Pig myPig = new Pig();	// Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}

}
