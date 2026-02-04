package basic;

public class SmallestSubArray {
	public static void main(String[] args) {
		int data[] = {1,10,0,2,7,4,3,2,1};
		int target = 13;
		System.out.println(minSubArrayLen(data, target));
	}
	
	public static int minSubArrayLen(int nums[], int target) {
		int start = 0, end, total=0, len=0;
		
		for(end = 0; end < nums.length; end++) {
			total += nums[end];
			
			while(total >= target) {
				// shrink
				len = end - start + 1;
				total -= nums[start];
				start++;
			}
		}
		
		return len;
	}
}
