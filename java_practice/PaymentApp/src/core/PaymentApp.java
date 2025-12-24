package core;

public class PaymentApp {
	public static void main(String[] args) {
			
		Payment u = new UPI();
		u.pay();
		
		Payment c = new Card();
		c.pay();
		
	}
}
