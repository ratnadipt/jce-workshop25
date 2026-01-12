package intro;


// To handle negative numbers.

public class TestException {

	public static void main(String[] args) {
		int num = -10; // input from the user. 
		
		try {
			// condition
			if(num < 0) {
				// exception
				throw new TestExp("Negative Number");
			}
			//normal flow
			System.out.println("Number is Correct!");
		}
		catch(TestExp ob) {
			ob.printStackTrace();
		}
	}
}
// my exception
class TestExp extends RuntimeException{
	public TestExp(String msg) {
		super(msg);
	}
}