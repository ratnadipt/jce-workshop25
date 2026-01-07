package model;

public class Person {
	// member variable
	private String name;
	private String email;
	private String phone;
	
	// constructor
	public Person(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	// Getter & Setter Methods
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
