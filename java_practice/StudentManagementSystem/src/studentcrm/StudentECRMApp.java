package studentcrm;

public class StudentECRMApp {
	public static void main(String[] args) {
		Person s1 =new UGStudent(100, "Ravi", 87);
		Person s2 = new PGStudent(202, "Ram", 34);
		
		// methods
		s1.showDetails();
		s1.calculateResult();
		
		s2.showDetails();
		s2.calculateResult();
	}
}
