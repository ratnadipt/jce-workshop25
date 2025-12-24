package oops;

public class Student {
	
	// member variables - encapsulated
	private int roll;
	private String name;
	private String city;
	
	
	// member functions
	void display() {
		System.out.println("Roll No : " + this.roll);
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.city);
	}

	// setter method : use to set the value
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	// getter method : use to get the value
	public int getRoll() {
		return this.roll;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCity() {
		return this.city;
	}
}
