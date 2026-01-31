package basic;

import java.util.Arrays;

public class SlidingWindow {
	public static void main(String[] args) {
		//totalOfEachWindow(new int[] {1,2,3,2,4,6,4,3}, 3);
		//findMaxInWindow(new int[] {1,2,3,2,4,6,4,3}, 4);
		sortEachWindow(new int[] {2,3,1,2,4,6,4,3}, 3);
	}
	
	// P : count total of size k window.
	// [2,4,3,5,6,4,6] k = 3
	// [0,1,2,3,4,5,6]
	
	public static void totalOfEachWindow(int []data, int k) {
		int len = data.length;
		int total = 0;
		// 1. k size window process		
		for(int i = 0 ; i < k; i++) {
			total += data[i];
		}
		
		System.out.println(total);
		
		// 2. slide upto last element one by one
		for(int i = k; i < len; i++) {
			// 3. remove : total - left element
			total = total-data[i-k];
			
			// 4. add : total + right element
			total = total + data[i];
			
			// 5. processing
			System.out.println(total);
		}
	}

	public static void findMaxInWindow(int []data, int k) {
		int len = data.length;
		int max = data[0];
		// 1. k size window process		
		for(int i = 0 ; i < k; i++) {
			if(max < data[i])
				max = data[i];
		}
		
		System.out.println(max);
		
		// 2. slide upto last element one by one
		for(int i = k; i < len; i++) {
			// 3. remove : total - left element data[i-k]
			//total = total-data[i-k];
			
			// 4. add : total + right element data[i]
			if(max < data[i])
				max = data[i];
			
			// 5. processing
			System.out.println(max);
		}
	}

	public static void sortEachWindow(int []data, int k) {
		int len = data.length;
		int window[] = new int[k];
		// 1. k size window process		
		for(int i = 0 ; i <= len-k; i++) {			
			// add each element to window.
			for(int j = 0; j < k; j++) {
				window[j] = data[i+j];
			}
			
			// sort
			Arrays.sort(window);
			// print
			System.out.println(Arrays.toString(window));
			
		}
	}
}
