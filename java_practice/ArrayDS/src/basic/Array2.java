package basic;

public class Array2 {

	public static void main(String[] args) {
		int arr[] = {23,45,3,46,78,665,24,87,97};
		
		// Task : some of all elements
		// initially total = 0;
		// visit each element -> add total
		// after total = sum;
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			total = total + arr[i];
//			total += arr[i]; - shorhand operator
		}
		
		System.out.println("Total : " + total);

	}

}
