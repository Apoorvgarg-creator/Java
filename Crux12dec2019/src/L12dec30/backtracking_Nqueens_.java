package L12dec30;

public class backtracking_Nqueens_ {
	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		Nqueens_method1(board, 0, 0, 0, 4, "");
		System.out.println("_______________");
		Nqueens_method2(board, 0, 0, 4,"");
	}

	public static void Nqueens_method1(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (col == board[0].length) {
			col = 0;
			row++;
		}
		if (row == board.length) {
			return;
		}

		// Placed
		if (isitsafe(board, row, col)) {
			board[row][col] = true;
			Nqueens_method1(board, row, col + 1, qpsf + 1, tq, ans + "b[" + row + "-" + col + "]q(" + (qpsf + 1) + ")");
			board[row][col] = false;

		}
		// Not Placed
		Nqueens_method1(board, row, col + 1, qpsf, tq, ans);

	}
	public static void Nqueens_method2(boolean[][] board,int row,int qpsf,int tq,String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (row == board.length) {
			return;
		}
		for(int c=0;c<board[0].length;c++) {
			if(isitsafe(board, row,c)) {
				board[row][c]=true;
				Nqueens_method2(board, row+1, qpsf+1, tq, ans + "b[" + row + "-" + c + "]q(" + (qpsf + 1) + ")");
				board[row][c]=false;
			}
		}
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// Horizontally left
		int cr = row;
		int cc = col - 1;
		while (cc >= 0) {
			if (board[cr][cc]) {
				return false;
			}
			cc--;
		}
		// Vertically up
		cr = row - 1;
		cc = col;
		while (cr >= 0) {
			if (board[cr][cc]) {
				return false;
			}
			cr--;
		}
		// Diagonally left
		cr = row - 1;
		cc = col - 1;
		while (cc >= 0 && cr >= 0) {
			if (board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		// Diagonally right
		cr = row - 1;
		cc = col + 1;
		while (cc < board.length && cr >= 0) {
			if (board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		return true;
	}
}
