package L12dec30;

public class backtracking_blockedmazepath_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 } };
		boolean[][] visited=new boolean[board.length][board[0].length];
		mazeblo(board, 0, 0, board.length-1, board[0].length-1, "",visited);

	}

	public static void mazeblo(int[][] board, int cr, int cc, int er, int ec, String ans,boolean[][] visited) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec || cr < 0 || cc < 0 || board[cr][cc]==1 || visited[cr][cc]) {
			return;
		}
		
				visited[cr][cc]=true;
			// Horizontal move - right
			mazeblo(board, cr, cc + 1, er, ec, ans + "r", visited);
		
			// Horizontal move - left
			
			mazeblo(board, cr, cc - 1, er, ec, ans + "l", visited);
		
			// Vertical move - up
			mazeblo(board, cr - 1, cc, er, ec, ans + "u", visited);
		
			// Horizontal move - down
			mazeblo(board, cr + 1, cc, er, ec, ans + "d", visited);
			visited[cr][cc]=false; //backtracking
		}

	}

