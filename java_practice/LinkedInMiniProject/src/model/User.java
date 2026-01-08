package model;
import java.util.ArrayList;
public class User extends Person{
	private String userName;
	private String userPassword;
	// profile - HAS-A
	private Profile profile; // Association
	
	private ArrayList<User> connections;
	
	// constructor initialization
	public User(String userName, String userPassword, String name, String email, String phone) {
		super(name, email, phone);
		this.userName = userName;
		this.userPassword = userPassword;
		connections = new ArrayList<>();
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
	
	// method to add connections
	public void addConnection(User user) {
		// check user is already exits or not.
		if(connections.contains(user)) {
			System.out.println("Already connected!");
		}
		else {
			connections.add(user);
			System.out.println("Connection added with " + user.getUserName());
		}
	}
	
	// method to display all user connections
	public void viewConnection() {
		if(connections.isEmpty()) {
			System.out.println("Not yet connected to any user.");
		}
		else {
			System.out.println("Your Connections ");
			for(User u: connections) {
				System.out.println(u.getUserName() + ", ");
			}
		}
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
