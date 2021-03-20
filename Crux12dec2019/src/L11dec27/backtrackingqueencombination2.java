package L11dec27;

public class backtrackingqueencombination2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		queen_comb(board, 0, 2,0, "");

	}

	public static void queen_comb(boolean[] board, int qpsf, int tq,int lastindex, String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = lastindex; i < board.length; i++) {
			
				board[i] = true;
				queen_comb(board, qpsf + 1, tq,i+1, ans + "b" + i + "(q" + qpsf + 1 + ")");
				board[i] = false;
			
		}
	}
}
