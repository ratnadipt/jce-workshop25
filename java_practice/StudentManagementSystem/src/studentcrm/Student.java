package studentcrm;

public abstract class Student extends Person {
	private int marks; // encasulated
	
	public Student(int id, String name, int marks) {
		super(id, name); // pass and call parent constructor
		this.marks = marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int getMarks() {
		return this.marks;
	}
}
