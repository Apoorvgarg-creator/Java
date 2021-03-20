package L9dec25;

import java.util.ArrayList;;

public class keypadcomb {

	public static void main(String[] args) {
		System.out.println(key("123"));

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> key(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = key(ros);
		ArrayList<String> mr = new ArrayList<>();
		String s = getCode(ch);
		ArrayList<Character> strr = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			strr.add(s.charAt(i));
		}

		for (char val : strr) {
			for (String val1 : rr) {
				mr.add(val + val1);
			}

		}
		return mr;

	}

}
