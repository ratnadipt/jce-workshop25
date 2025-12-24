package core;

public class Dog extends Animal{
	
	// Override Parent method
	@Override
	void eat() {
		// business logic
		System.out.println("Dog is eating!");
	}
	
	// can have own members
	void run() {
		System.out.println("Dog is running!");
	}
}
