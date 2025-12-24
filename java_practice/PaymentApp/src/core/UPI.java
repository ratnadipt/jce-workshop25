package core;

public class UPI implements Payment {
	@Override
	public void pay() {
		System.out.println("Scan and Pay UPI");
	}
}
