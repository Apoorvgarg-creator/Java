package a;

import java.util.*;

public class ratchasesitscheese {

	// BLOCKED MAZEPATH
	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scn.nextInt();
		int m = scn.nextInt();

		char[][] board = new char[n][m];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = scn.next().charAt(j);
			}
		}
		boolean[][] visited = new boolean[n][m];
		int[][] ans = new int[n][m];
		path(board, visited, 0, 0, n - 1, m - 1, ans);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean path(char[][] board, boolean[][] visited, int cr, int cc, int er, int ec, int[][] ans) {
		if (cr == er && cc == ec) {
			ans[cr][cc]=1;
			return true;
		}
		if (cc < 0 || cr < 0 || cc > ec || cr > er || board[cr][cc] == 'X' || visited[cr][cc]) {
			if (cc > 0 && cr > 0 && cc < ec && cr < er && board[cr][cc] == 'X') {
				ans[cr][cc] = 0;
			}
			return false;
		}
		visited[cr][cc] = true;
		// down
		ans[cr][cc] = 1;
		boolean down = path(board, visited, cr + 1, cc, er, ec, ans);
		
		if(down) {
			return true;
		}
		ans[cr][cc]=0;
		ans[cr][cc] = 1;
		// up
		boolean up=path(board, visited, cr - 1, cc, er, ec, ans);
		if(up) {
			return true;
		}
		ans[cr][cc]=0;
		// left
		ans[cr][cc] = 1;
		boolean left=path(board, visited, cr, cc - 1, er, ec, ans);
		if(left) {
			return true;
		}
		ans[cr][cc] = 1;
		// right
		boolean right=path(board, visited, cr, cc + 1, er, ec, ans);
		if(right) {
			return true;
		}
		ans[cr][cc]=0;

		visited[cr][cc] = false;
		
		return false;

	}
}
