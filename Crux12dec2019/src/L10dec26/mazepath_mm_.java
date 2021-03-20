package L10dec26;

import java.util.ArrayList;

public class mazepath_mm_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath_II_(0, 0, 2, 2));

	}

	public static ArrayList<String> mazepath_II_(int vidr, int vidc, int er, int ec) {
		if (vidc == ec && vidr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (vidc > ec || vidr > er) {
			ArrayList<String> br = new ArrayList<>();

			return br;
		}

		ArrayList<String> r1 = mazepath_II_(vidr + 1, vidc, er, ec);
		ArrayList<String> mr = new ArrayList<>();

		for (String val : r1) {
			mr.add("V" + val);
		}
		ArrayList<String> r2 = mazepath_II_(vidr, vidc + 1, er, ec);

		for (String val : r2) {
			mr.add("H" + val);
		}
		ArrayList<String> r3 = mazepath_II_(vidr + 1, vidc + 1, er, ec);

		for (String val : r3) {
			mr.add("D" + val);
		}
		return mr;
	}

}
