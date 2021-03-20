package L11dec27;

public class backtracking_queen_combination_method2_boxrespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board=new boolean[4];
		queen_comb_boxrespect(board, 0, 0, 2, "");

	}
	public static void queen_comb_boxrespect(boolean[] board,int vidx,int qpsf,int tq,String ans) {
		if(qpsf==tq) {									// it should be placed above the negative base case ------> Special question 
			System.out.println(ans);
			return ;
			
		}
		if(vidx==board.length) {
			return ;
		}
		//Placed
		board[vidx]=true;
		queen_comb_boxrespect(board, vidx+1, qpsf+1, 2, ans+"b"+vidx+"(q"+qpsf+1+")");
		board[vidx]=false;   /// undo 
		//Not placed
		queen_comb_boxrespect(board, vidx+1, qpsf, tq, ans);
	}

}
