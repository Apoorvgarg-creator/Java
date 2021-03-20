package L11dec27;

import java.util.*;

public class Printapplexicographicalcountingrec {
	static Scanner scn = new Scanner(System.in);

	/////// LEXICOGRAPHICAL SEQUENCE
	public static void main(String[] args) {
		int n = scn.nextInt();
		seq(0, n);

	}

	public static void seq(int start, int end) {
		if (start > end) {
			return;
		}
		System.out.println(start);

		if (start == 0) {
			for (int i = 1; i <= 9; i++) {
				seq(start * 10 + i, end);
			}
		}

		else {
			for (int i = 0; i <= 9; i++) {
				seq(start * 10 + i, end);
			}
		}

	}

}
