package basic;

public class RotateBy1Demo {
	public static void main(String[] args) {
		/*int a[] = {3,2,-5,38,69,-33,67}; // 5,2,1,4,3
		a = new RotateBy1Demo().rotateBy1(a);
		
		for(int d : a) {
			
			System.out.print( d + ", ");
		}*/
		
		int a[][] = {{1,1,7,3}, {1,0,2,1}, {4,1,5,1}, {2,4,2,0}};
		a = new RotateBy1Demo().setZero(a);
		
		for(int r = 0; r < a.length; r++) {
			for(int c = 0 ; c < a.length; c++) {
				System.out.print("| " + a[r][c] + " | ");
			}
			System.out.println("");
		}
		
	}
	
	
	public int[] rotateBy1(int data[]) {
		
		// logic
		// 1. backup
		int temp = data[0];
		
		// 2. iterate
		for(int i = 1; i < data.length; i++) {
			// 3. move
			data[i-1] = data[i];
		}
		
		// 4. last element <- backup
		data[data.length-1] = temp;
		
		return data;
	}
	
	// WAP to set Row & cols to 0, if the element is 0.
	public int[][] setZero(int data[][]){
		// 2D = {{1,2,3},{3,2,4},{1,2,3}}; => [0].length -> row (contains cols) , [0][0] -> first cell
		// logic
		int result[] = new int[data.length*data.length]; // {1,1 , -1}
		int k=0;
		// 1. iterate
		for(int r = 0; r < data.length; r++) {
			for(int c = 0; c < data.length ; c++) {
				// fetch element -> check = 0
				
				if(data[r][c] == 0) {
					// indices store array
					result[k++] = r;
					result[k++] = c;
					result[k] = -1; // sts
				}
				
			}
		}
		
		// set = 0
		
		for(int s = 0; s < result.length; s = s+2) {
			if(result[s] == -1 ) {
				break;
			}
			// set R => 0
			for(int c1 = 0; c1 < data.length ; c1++) {
				data[result[s]][c1] = 0;
			}

			// set C => 0
			for(int r1 = 0; r1 < data.length; r1++) {
				data[r1][result[s+1]] = 0;
			}
		}
		
		
		
		return data;
	}
}
