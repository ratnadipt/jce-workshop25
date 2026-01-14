package basic;

public class SmallestPair {
	public static void main(String[] args) {
		int data[] = {2,5,3,7,4,5,6,3,2,6,5,3,8,6};
		int key = 8;
		
		int res[] = findSmallestPair(data, key);
		System.out.print(res[0] + " - ");
		System.out.print(res[1]);
	}
	
	public static int[] findSmallestPair(int data[], int key) {
		// 1. calculate length
		int len = data.length;
		int result[] = new int[len];
		int j = 0;
		// 2. iterate array
		for(int i = 0; i < len-1; i++) {
			// 3. calculate sum
			int sum = data[i] + data[i+1];
			// 4. compare
			if(key == sum) {
				// 5. add this pair to the new array.
				result[j++] = data[i];
				result[j++] = data[i+1];
			}
		}
		
		// result[4,3,3,4,5,2] - pairs => 4<3 = F  || 3<4 = T => T
		// find smallest
		for(int i=0; i<result.length; i++) {
			if(result[i] < result[i+2] || result[i+1] < result[i+3]) {
				return new int[] {result[i], result[i+1]};
			}
		}
		
		return null;
	}
}

