package core;

public class EmpApp {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setSalary(25000);
		
		System.out.println("Emp Salary : " + e1.getSalary());
	}
}
