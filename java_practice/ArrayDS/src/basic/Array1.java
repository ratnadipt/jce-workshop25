package basic;

public class Array1 {
	public static void main(String[] args) {
		// 1. creating an array
		//int arr[] = new int[10]; // Default Value = 0
//		int []arr = new int[10]; // int a[], b[], c[], d[];
//		int[] arr = new int[10]; int[] a,b,c,d,e;
		
		// 2. initialization
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[arr.length-1] = 100;
		
		// 1 - 2 : Array Declaration & Initialization 
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
//		int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
		
		// 3. Accessing the Array elements - Direct Access - Fast
		System.out.println("First Element : " + arr[0]);
		System.out.println("Last Element : " + arr[arr.length-1]);
		
		// 4. Array Iteration - Loop -> Traversal : Visiting each element
		for(int i=0; i < arr.length ; i++) {
			System.out.println((i+1) + " Element : " + arr[i]);
		}
	}
}
