package stringpattern;

import java.util.HashMap;

public class PalindromeDemo {
	public static void main(String[] args) {
		//System.out.println(checkPalinIgnoringCase("madaM"));
		//System.out.println(reverseStringTwoPointer("Hello"));
		//countFrequency("banana");
		// countFrequencyUsingMap("banana");
		System.out.println(compareTwoString("education", "solution"));
	}
	
	// function
	public static boolean checkPalinIgnoringCase(String str) {
		// Two Pointer Logic
		int left = 0;
		int right = str.length()-1;
		
		// normalization : convert input -> U or L
		str = str.toLowerCase();
		
		while(left < right) {
			// compare
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			// increment
			left++;
			//decrement
			right--;
		}
		
		
		return true;
	}

	public static String reverseStringTwoPointer(String str) {
		
		// Two Pointer Logic
				int left = 0;
				int right = str.length()-1;
				
				// Normalization : String -> Array of Chars
				char strs[] = str.toCharArray();
				
				while(left < right) {
					// reverse
					char temp = strs[left];
					strs[left] = strs[right];
					strs[right] = temp;
					
					// increment
					left++;
					//decrement
					right--;
				}
				
				// Array of Char -> String
				
				return new String(strs);
	}


//	Frequency Counting Pattern
	public static void countFrequency(String str) {
		// 1. create frequency
		int frequency[] = new int[26]; 
		// [0->a,1->b,2->c,3,....25->z]
		
		// 2. traverse string
		for(int i = 0; i < str.length() ; i++) {
			// char
			char ch = str.charAt(i);
			
			//3. increment count	
			frequency[ch - 'a']++;
		}
		
		// printing
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " - " + frequency[str.charAt(i)-'a']);
		}
	}


	public static void countFrequencyUsingMap(String str) {
				// 1. create frequency - use HashMap -> java.util.Hashmap;
				HashMap<Character, Integer> frequency = new HashMap<>();
				// {'a' : 3, 'b' :4}
				
				// 2. traverse string
				for(int i = 0; i < str.length() ; i++) {
					// char
					char ch = str.charAt(i);
					
					//3. increment count	
					frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
				}
				
				// printing
				for(Character ch : frequency.keySet()) {
					System.out.println(ch + " - " + frequency.get(ch));
				}
	}


	// compare and expand
	public static boolean compareTwoString(String str1, String str2) {
		// Process 1
		String result1 = "";
		for(int i = 0 ; i < str1.length() ; i++) {
			char ch = str1.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				
				result1 += ch;
			}
		}
		
		// Process 2
		String result2 = "";
		for(int i = 0 ; i < str2.length() ; i++) {
			char ch = str2.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				result2 += ch;
			}
		}
		// compare
		if(result1.equals(result2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
