package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Profile;
import model.User;
public class LinkeInApp {
	
	static ArrayList<User> users = new ArrayList<>(); // store
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
		// menu driven app
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.print("Choose Any Option : ");
		int choice = read.nextInt();
		// bypass
		read.nextLine();
		
		switch(choice) {
		case 1: // register
			registerUser();
			break;
		case 2: //login
			User u = loginUser();
			if(u != null) {
				System.out.println("Login Successful!");
				// Dashboard
				userDashboard(u);
			}
			else {
				System.out.println("Invalid Credentials!");
			}
			break;
		case 3: // exit
			System.out.println("App Closed!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Options... Try Again!");
		}
		
		}
		
//		read.close();

	}
	
	// methods - register, login
	
	public static void registerUser() {
		System.out.println("==== WELCOME TO LINKEIN APP ====");
		// read user account details
		System.out.println("Enter Full Name : ");
		String fullName = read.nextLine();
		
		System.out.println("Enter Email ID : ");
		String userEmail = read.nextLine();
		
		
		System.out.println("Enter Phone Number : ");
		String userPhone = read.nextLine();
		
		System.out.println("Enter User Name : ");
		String userName = read.nextLine();
		
		System.out.println("Enter User Password : ");
		String userPass = read.nextLine();
		
		
		// add user
		User user = new User(userName, userPass, fullName, userEmail, userPhone);
		users.add(user);
		
		System.out.println("User Registered Successfully!");
		
		user.displayBasicInfo();
	}
	
	
	public static User loginUser() {
		System.out.print("Enter User Name : ");
		String userName = read.nextLine();
		
		System.out.print("Enter Passsword : ");
		String userPass = read.nextLine();
		
		// logic to check user credentials
		for(User user : users) {
			if(user.getUserName().equals(userName) 
			&& user.getUserPassword().equals(userPass)) {
				return user; // found
			}
		}
		
		return null; // not found
	}
	
	// method to create an dashboard.
	public static void userDashboard(User user) {
		while(true) {
		System.out.println("1. Create Profile");
		System.out.println("2. View Profile");
		System.out.println("3. Add Skills");
		System.out.println("4. Add Connections");
		System.out.println("5. View Connections");
		System.out.println("6. Logout");
		
		System.out.println("Enter Your Choice : ");
		int choice = read.nextInt();
		read.nextLine();
		
		switch(choice) {
		case 1: // create
			System.out.print("Enter Headline : ");
			String headLine = read.nextLine();
			
			System.out.print("Enter Experience : ");
			String exp = read.nextLine();
			
			Profile profile = new Profile(headLine, exp);
			
			// add profile to user account
			user.setProfile(profile);
			
			System.out.println("Profile Created Successfully!");
			break;
		case 2: // view
			user.getProfile().displayProfile();
			break;
		case 3: // add skills
			if(user.getProfile() == null) {
				System.out.println("Create Profile First.");
			}
			else {
				System.out.print("Enter Skill : ");
				String skill = read.nextLine();
				user.getProfile().addSkill(skill);
			}
			
			break;
		case 4: // add connections
			System.out.print("Enter User Name to connect : ");
			String username = read.nextLine();
			if(user.getUserName().equals(username)) {
				System.out.println("Same user.");
			}
			else {
				// entered user name has an account or not.
				for(User u: users) {
					if(u.getUserName().equals(username)) {
						// user has account
						user.addConnection(u);
						
					}
				}
				System.out.println("User Not Found!");
			}
			break;
		case 5: // view connections
			user.viewConnection();
			break;
		case 6: //logout
			user = null;
			System.out.println("Logged Out!");
			return;
		default:
			System.out.println("Invalid Choice!");
		} // switch ends here
	} // while loop end
	} // function end
} // class end
