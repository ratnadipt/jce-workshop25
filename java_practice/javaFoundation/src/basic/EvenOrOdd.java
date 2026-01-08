package basic;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter any Numnber : ");
		int n = read.nextInt();
		// = assignment and == equality 
		if(n%2 == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		read.close();
	}
}
