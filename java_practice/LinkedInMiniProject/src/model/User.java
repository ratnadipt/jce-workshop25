package model;

public class User extends Person{
	private String userName;
	private String userPassword;
	// profile - HAS-A
	private Profile profile; // Association
	
	// constructor initialization
	public User(String userName, String userPassword, String name, String email, String phone) {
		super(name, email, phone);
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	// methods
	public String getUserName() {
		return this.userName;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	// method to create a profile.
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public Profile  getProfile() {
		return this.profile;
	}
	
	// method to display all details
	public void displayBasicInfo() {
		System.out.println("Name : " + this.getName());
		System.out.println("Email : " + this.getEmail());
		System.out.println("Phone : " + this.getPhone());
		System.out.println("User Name : " + this.getUserName());
		System.out.println("=== PROFILE ===");
		if(this.profile != null) {
			this.profile.displayProfile();
		}
		else {
			System.out.println("Profile Not Found!");
		}
	}
}
