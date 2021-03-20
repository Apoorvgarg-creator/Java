package L9dec25;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(per("abc"));

	}

	public static ArrayList<String> per(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = per(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			for (int i = 0; i <= val.length(); i++) {
				mr.add(val.substring(0, i) + ch + val.substring(i));
			}
		}
		return mr;

	}
}
