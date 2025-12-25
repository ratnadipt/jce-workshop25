package studentcrm;

public class UGStudent extends Student {
	// member
	
	public UGStudent(int id, String name, int marks) {
		super(id, name, marks);
	}
	
	@Override
	public void calculateResult() {
		// logic
		if(super.getMarks() >= 40) {
			System.out.println("UG Student PASS");
		}
		else {
			System.out.println("UG Student Failed");
		}
	}
}
