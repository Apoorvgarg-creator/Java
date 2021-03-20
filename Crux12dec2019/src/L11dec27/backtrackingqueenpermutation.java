package L11dec27;

public class backtrackingqueenpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		queen_prmt(board, 0, 2, "");

	}

	public static void queen_prmt(boolean[] board, int qpsf, int tq, String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queen_prmt(board, qpsf + 1, tq, ans + "b" + i + "(q" + qpsf + 1 + ")");
				board[i] = false;
			}
		}
	}
}
