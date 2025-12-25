package studentcrm;

public class PGStudent extends Student {
	public PGStudent(int id, String name, int marks) {
		super(id , name, marks);
	}
	
	@Override
	public void calculateResult() {
		// logic
		if(super.getMarks() >= 45) {
			System.out.println("PG Student PASS");
		}
		else {
			System.out.println("PG Student Failed");
		}
	}
}
