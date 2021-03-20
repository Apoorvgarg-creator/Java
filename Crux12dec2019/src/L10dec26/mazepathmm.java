package L10dec26;

import java.util.ArrayList;

public class mazepathmm {
	public static void main(String[] args) {
		System.out.println(mazepath_mm_(0, 0, 2, 3));

	}

	public static ArrayList<String> mazepath_mm_(int vidr, int vidc, int er, int ec) {
		if (vidc == ec && vidr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (vidc > ec || vidr > er) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int m = 1; m <= er; m++) {
			ArrayList<String> r1 = mazepath_mm_(vidr + m, vidc, er, ec);

			for (String val : r1) {
				mr.add("V" + m + val);
			}
		}
		for (int m = 1; m <= ec; m++) {
			ArrayList<String> r2 = mazepath_mm_(vidr, vidc + m, er, ec);

			for (String val : r2) {
				mr.add("H" + m + val);
			}
		}
		for (int m = 1; m <= er && m <= ec; m++) {
			ArrayList<String> r3 = mazepath_mm_(vidr + m, vidc + m, er, ec);

			for (String val : r3) {
				mr.add("D" + m + val);
			}
		}
		return mr;

	}

}
