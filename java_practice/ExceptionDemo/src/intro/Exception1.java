package intro;

public class Exception1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		try {
			int c = a/b; // exception -> throw new ArithmeticException("/ by zero")
			// JVM creates an Object of Exception Class and Send ie. throw that object to catch block.
			System.out.println("Result : " + c);
			
		}
		catch(ArithmeticException ob) {
			// handling code
			//System.out.println("Exception : " + ob.getMessage());
			ob.printStackTrace();
		}
		finally {
			System.out.println("clean up code....");
		}
		

	}// end of the code

}
