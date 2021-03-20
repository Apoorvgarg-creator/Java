package a;

import java.util.*;

public class chessboard_part_2 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scn.nextInt();
		int[][] board = new int[n][n];
		int wt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = wt;
				wt++;
			}
		}
		int x = path(board, 0, 0, n - 1, n - 1, "", true);
		System.out.println();
		System.out.print(x);

	}
	// chkpr --> a boolean type that checks whether it is a port or mine.
	// chkpr true shows mine
	public static int path(int[][] board, int cr, int cc, int er, int ec, String ans, boolean chkpr) {
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return 1;
		}
		if (cr < 0 || cc < 0 || cc > ec || cr > er) {
			return 0;
		}
		int cnt = 0;
		int wt = board[cr][cc];
		// prime + piece is on port
		if (chkprime(wt) && !chkpr) {
			// does move to the destination directly
			cnt += path(board, er, ec, er, ec, ans + "{" + cr + "-" + cc + "}P", !chkpr);
			// doesn't move to the destination directly
			// Knight like moves (any cell)
			// case 1
			cnt += path(board, cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K", !chkpr);
			// case 2
			cnt += path(board, cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K", !chkpr);

			// rook like moves (border)
			if (cr == 0 || cr == er || cc == 0 || cc == ec) {
				// horizontal right
				int i = 1;
				int phrm = ec - cc; // pvdm possible horizontal right move
				while (i <= phrm) {
					cnt += path(board, cr, cc + i, er, er, ans + "{" + cr + "-" + cc + "}R", !chkpr);
					i++;
				}
				// vertical down
				i = 1;
				int pvdm = er - cr; // pvdm possible vertical down move
				while (i <= pvdm) {
					cnt += path(board, cr + i, cc, er, er, ans + "{" + cr + "-" + cc + "}R", !chkpr);
					i++;
				}

			}
			// bishop like moves (when piece is present at diagonals)
			if (cr == cc || cr + cc == er) {
				int i = 1;
				int pdm = er - cr; // possible diagonal moves
				while (i <= pdm) {
					cnt += path(board, cr + i, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}B", !chkpr);
					i++;
				}
			}
		}
//		// MINE Condition
		if (chkprime(wt) && chkpr) {
			// Knight like moves (any cell)
			// case 1
			cnt+=path(board, cr + 2, cc + 1, er, ec, ans, !chkpr);
			// case 2
			cnt+=path(board, cr + 1, cc + 2, er, ec, ans, !chkpr);

			// rook like moves (border)
			if (cr == 0 || cr == er || cc == 0 || cc == ec) {
				// horizontal right
				int i = 1;
				int phrm = ec - cc; // pvdm possible horizontal right move
				while (i <= phrm) {
					cnt+=path(board, cr, cc + i, er, er, ans, !chkpr);
					i++;
				}
				// vertical down
				i = 1;
				int pvdm = er - cr; // pvdm possible vertical down move
				while (i <= pvdm) {
					cnt+=path(board, cr + i, cc, er, er, ans, !chkpr);
					i++;
				}

			}
			// bishop like moves (when piece is present at diagonals)
			if (cr == cc || cr + cc == er) {
				int i = 1;
				int pdm = er - cr; // possible diagonal moves
				while (i <= pdm) {
					cnt+=path(board, cr + i, cc + i, er, ec, ans, !chkpr);
					i++;
				}
			}
		}
		if(!chkprime(wt)) {
			// Knight like moves (any cell)
			// case 1
			cnt += path(board, cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K", chkpr);
			// case 2
			cnt += path(board, cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K", chkpr);

			// rook like moves (border)
			if (cr == 0 || cr == er || cc == 0 || cc == ec) {
				// horizontal right
				int i = 1;
				int phrm = ec - cc; // pvdm possible horizontal right move
				while (i <= phrm) {
					cnt += path(board, cr, cc + i, er, er, ans + "{" + cr + "-" + cc + "}R", chkpr);
					i++;
				}
				// vertical down
				i = 1;
				int pvdm = er - cr; // pvdm possible vertical down move
				while (i <= pvdm) {
					cnt += path(board, cr + i, cc, er, er, ans + "{" + cr + "-" + cc + "}R", chkpr);
					i++;
				}

			}
			// bishop like moves (when piece is present at diagonals)
			if (cr == cc || cr + cc == er) {
				int i = 1;
				int pdm = er - cr; // possible diagonal moves
				while (i <= pdm) {
					cnt += path(board, cr + i, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}B", chkpr);
					i++;
				}
			}
		}
		return cnt;
	}

	public static boolean chkprime(int n) {
		if (n == 1) {
			return false;
		}
		int flag = 0;
		int count = 2;
		while (count < n / 2) {
			if (n % count == 0) {
				flag++;
			}
			count++;
		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}
}
