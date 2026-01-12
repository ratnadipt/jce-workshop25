package basic;

public class Array3 {
	public static void main(String[] args) {
		int data[] = {2,3,4,5,3,4,5,2,3,4,67,5,6,7,6,4,5,2};
		
		int counter = 0;
		
		int num = 36; // read
		
		for(int index = 0; index < data.length ; index++) {
			if(num == data[index]) {
				counter++;
			}
		}
		
		System.out.println("Total Counts : " + counter);
	}
}
