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
		skills.add(skill);
	}
	
	// method to display details of user profile.
	public void displayProfile() {
		System.out.println("Headline : " + this.headLine);
		System.out.println("Experience : " + this.experience);
		System.out.println("Skills : " + this.skills);
	}
}
