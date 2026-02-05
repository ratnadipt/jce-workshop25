package basic;

import java.util.HashSet;

public class LongestSubString {
	public static void main(String[] args) {
		System.out.println(lengthOfSubString("xaababcdcazh"));
	}
	
	public static int lengthOfSubString(String str) {
		int start=0, end, maxLen=0;
		HashSet<Character> set = new HashSet<Character>();
		
		for(end=0; end<str.length();end++) {
			// 1. expand
			char ch = str.charAt(end);
			while(set.contains(ch)) {
				// 2. shrink
				set.remove(str.charAt(start));
				start++;
			}
			set.add(ch);
			
			// 3. update the answer
			//maxLen = Math.max(maxLen, end - start + 1);
			if(maxLen<end-start+1) {
				maxLen = end-start+1;
				System.out.println(str.substring(start, start+maxLen));
			}
		}
//		System.out.println(start + " - " + end + " - " + maxLen);
		return maxLen;
	}
}
