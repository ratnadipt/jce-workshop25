package oops;

public class FirstApp {
	public static void main(String[] args) {
		// create objects
		Student s1 = new Student();
		
		// accessing member variables
//		s1.roll = 101;
//		s1.name = "Ravi";
//		s1.city = "Yavatmal";
		
		s1.setRoll(101);
		s1.setName("Ravi");
		s1.setCity("Yavatmal");
		
		// access member function
		s1.display();
	}
}
