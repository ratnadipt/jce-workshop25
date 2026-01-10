package basic;

public class SquareOfEachDigitInString {

	public static void main(String[] args) {
		// data
		String data = "2,4,3,6,8";
		
		// processing - business logic
		// 1. extra - iterate 
		for(int i = 0; i < data.length() ; i = i+2) {
			// 2. access each character
			char digit = data.charAt(i); // char
			// 3. convert into string
			int num = Integer.parseInt(String.valueOf(digit));
			// 4. apply square logic.
			int sqr = num * num;
			System.out.println(num + " = " + sqr);
		}
	}

}
