package model;

import java.util.ArrayList;

public class Profile {
	private String headLine;
	private String experience;
	private ArrayList<String> skills;
	
	public Profile(String headLine, String experience) {
		this.headLine = headLine;
		this.experience = experience;
		this.skills = new ArrayList<>();
	}
	
	// method to add skills.
	public void addSkill(String skill) {
		// validate duplicate skills
		if(skills.contains(skill)) {
			System.out.println(skill + " is Already Added!");
		}
		else {
			skills.add(skill);
			System.out.println(skill + " Skill is added.");
		}
	}
	
	// method to display details of user profile.
	public void displayProfile() {
		System.out.println("Headline : " + this.headLine);
		System.out.println("Experience : " + this.experience);
//		System.out.println("Skills : " + this.skills);
		if(skills.isEmpty()) {
			// no skills
			System.out.println("No skills added.");
		}
		else {
			// display skills
			for(String skill : skills) {
				System.out.println(skill + ", "); // c, c++, java
			}
		}
		
	}
}
