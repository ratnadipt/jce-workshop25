package basic;

public class ArraySort {
	public static void main(String[] args) {
		// read data
		int arr[] = {4,6,2,3,8,5,67,43,54,12,3,7,5,6,8,45};
		
		int result[] = selectionSort(arr);
		
		// print
		System.out.println("Sorted Elements are : ");
		for(int i = 0; i < result.length ; i++) {
			System.out.print(result[i] + ", ");
		}
	}
	
	public static int[] selectionSort(int data[]) {
		// 1. calculate length
		int len = data.length;
		
		// outer loop - to select element for sorting.
		for(int i = 0; i < len-1; i++) {
			// inner loop - to get the smallest element
			for(int j = i+1 ; j < len; j++) {
				// compare
				if(data[i] > data[j]) {
					// exchange - swap - interchange
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		return data;
	}
}

 
