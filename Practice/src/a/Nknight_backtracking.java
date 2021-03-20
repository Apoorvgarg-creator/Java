package a;
import java.util.*;
public class Nknight_backtracking {
	
	  static Scanner scn = new Scanner(System.in);
	   public static void main(String args[]) {
	        int n = scn.nextInt();
	        boolean[][] board=new boolean[n][n];
	        int x=Nknight(board,0,0,0,n,"");
	        System.out.println();
	        System.out.println(x);
	        // Your Code Here
	    }
	    public static int Nknight(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
			if (qpsf == tq) {
				System.out.print(ans+" ");
				return 1;
			}
			if (col == board[0].length) {
				col = 0;
				row++;
			}
			if (row == board.length) {
				return 0;
			}
	        int cnt=0;

			// Placed
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
			    cnt+=	Nknight(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "} " );
				board[row][col] = false;

			}
			// Not Placed
			cnt+=Nknight(board, row, col + 1, qpsf, tq, ans);
			
			
	        return cnt;
		}
	   

	public static boolean isitsafe(boolean[][] board, int row, int col) {
			// Horizontally left 2.5
			int cr = row-1;
			int cc = col - 2;
	        if(cc>=0 && cr>=0){
			if(board[cr][cc]){
	            return false;
	        }
	        }
			// Vertically up left 2.5
			cr = row - 2;
			cc = col-1;
			        if(cc>=0 && cr>=0){
			if (board[cr][cc]) {
				return false;
	        }}
			// vertically up right 2.5 
			cr = row - 2;
			cc = col + 1;
			if(cc<board[0].length && cr>=0){
				if (board[cr][cc]) {
					return false;
				}	
	        }    
			// horizontally right 2.5
			cr = row - 1;
			cc = col + 2;
			if(cc<board[0].length && cr>=0){
				if (board[cr][cc]) {
					return false;
				}
				
			}
			return true;
		}
	}



