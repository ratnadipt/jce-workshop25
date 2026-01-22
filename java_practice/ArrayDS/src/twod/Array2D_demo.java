package twod;

import java.util.Scanner;

public class Array2D_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declare 2D array -> Initialize it -> display
		int [][]arr = new int[3][3];
		int d[] = new int[3];
		
		// initialize
		for(int r = 0 ; r < 3 ; r++) {
			for(int c=0; c<3 ;c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
		
		// display
		for(int c = 0 ; c < 3 ; c++) { // rows
			for(int r=0; r<3 ;r++) { // column
				System.out.print(" | "+ arr[r][c] + " | ");
			}
			System.out.println("");
		}
		
		sc.close();
	}	
}
