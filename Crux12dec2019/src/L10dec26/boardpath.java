package L10dec26;

import java.util.ArrayList;

public class boardpath {

	public static void main(String[] args) {
		System.out.println(board(0, 10));

	}

	public static ArrayList<String> board(int start, int end) {
		if (start == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (start > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;

		}
		ArrayList<String> mr = new ArrayList<String>();

		for (int m = 1; m <= 6; m++) {
			ArrayList<String> rr = board(start + m, end);
			for (String val : rr) {
				mr.add(m + val);
			}
		}
		return mr;
	}

}
