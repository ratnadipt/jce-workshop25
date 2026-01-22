package basic;

public class DuplicateCharacter {

	public static void main(String[] args) {
			
		String s = "abaeacynbeadhsdffgjfvbsdfgsgsdf.,dsjlsk;dfugsfslkdgjsfoi;djcdab";
		
		duplicate(s);

	}
	
	public static void duplicate(String str) {
		// business logic
		int len = str.length();
		char []res = new char[len/2];
		int k=0;
		boolean sts;
		for(int i = 0; i < len; i++) {
			
			for(int j = i+1; j < len ; j++) {
				sts = false;
				if(str.charAt(i) == str.charAt(j)) {
					// already exits
					for(int x = 0; x < k ; x++) {
						if(res[x] != str.charAt(j)) {
							sts = true;
							break;
						}
					}
					
					if(!sts)
					{
						res[k++] = str.charAt(i);						
					}
				}
				
			}
			
		}
		
		// display
		for(int i = 0; i < k; i++) {
			System.out.println(res[i]);
		}
	}

}
