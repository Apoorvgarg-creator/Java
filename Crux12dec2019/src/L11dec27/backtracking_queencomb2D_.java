package L11dec27;

public class backtracking_queencomb2D_ {
	public static void main(String[] args) {
		
		
	}
	public static void Queencomb2D(boolean[][] board,int cr,int cc,int qpsf,int tq,String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return ;
		}
		if(cc==board[0].length) {
			cc=0;
			cr++;
		}
		if(cr==board.length) {
			return ;
		}
		
		//Placed
		board[cr][cc]=true;
		Queencomb2D(board,cr,cc+1,qpsf+1,tq,ans+"b["+cr+"-"+cc+"]q("+(qpsf+1)+")");
		board[cr][cc]=false;
		//Not placed
		Queencomb2D(board,cr,cc+1,qpsf,tq,ans);
	}

}
