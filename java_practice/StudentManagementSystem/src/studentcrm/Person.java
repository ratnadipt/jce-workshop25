package studentcrm;

public abstract class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// abstact method
	public abstract void calculateResult();
	
	// concrete method
	public void showDetails() {
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.name);
	}
	
}
