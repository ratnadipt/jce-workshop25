package basic;

import java.util.Scanner;
public class AddTwoNumber {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// input
		System.out.print("Enter first Number : ");
		int n1 = read.nextInt();
		
		System.out.print("Enter Second Number : ");
		int n2 = read.nextInt();
		
		// logic
		int result = n1 + n2;
		
		// output
		System.out.println("Addition = " + result);
		read.close();
		
	}

}
