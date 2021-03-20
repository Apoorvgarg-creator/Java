package DIV_2_A;

import java.util.*;

public class Beautiful_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][] input = new int[5][5];
		// Input matrix
		int posx = 0;
		int posy = 0;
		for(int i=0;i <input[0].length;i++) {
			for(int j=0;j<input.length;j++) {
				int x = scn.nextInt();
				input[i][j] = x;
				if(x == 1) {
					posx = i;
					posy = j;
					break;
				}
				
			}
		}
		int x = 2 - posx;
		int y = 2 - posy;
		
		int ans = Math.abs(x) + Math.abs(y) ;
		
		System.out.println(ans);
		

	}
	

}
