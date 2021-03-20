package L9dec25;

import java.util.ArrayList;

public class cointossrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coint(3));

	}

	public static ArrayList<String> coint(int n) {
		if (n == 1) {
			ArrayList<String> br = new ArrayList<>();
			br.add("H");
			br.add("T");
			return br;
		}
		ArrayList<String> rr = coint(n - 1);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add("H" + val);
			mr.add("T" + val);

		}
		return mr;
	}

}
