package DIV_2_A;

import java.util.*;

public class Dragons {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int s = scn.nextInt();
		int n = scn.nextInt();
		int[][] pow_drag = new int[n][2];
		int total_pow = 0; // Dragon power 
		int kirito = s; // Kirito power
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				pow_drag[i][j] = scn.nextInt();
				
			}
		}
		sortbyColumn(pow_drag, 0);
		
		for (int i=0;i<n;i++) {
			if(kirito <= pow_drag[i][0]) {
				System.out.println("NO");
				return;
			}
			kirito += pow_drag[i][1];
					
		}
		System.out.println("YES");
		
		
	}
	
	public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    } 
	
}
