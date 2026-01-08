package basic;
import java.util.Scanner;
public class InputOutputDemo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = read.next();
		
		System.out.println("ENter any Number : ");
		int num =  read.nextInt();
		
		System.out.println("Enter any letter : ");
		char letter = read.next().charAt(0);
		// output
		System.out.println("You Entered : " + name);
		System.out.println("Entered Number : " + num);
		System.out.println("Entered Charater : " + letter);
		
		read.close();
	}
}
