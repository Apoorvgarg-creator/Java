package L7dec23;

import java.util.Scanner;

public class inertascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(scn.next());
		String sc = inv(sb);
		System.out.println(sc);
	}

	public static String inv(StringBuilder sb) {
		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
				sb.setCharAt(i, (char) (sb.charAt(i) + 1));/////(char) (sb.charAt(i) + 1) = sb.charAt(i)++
			} else
				sb.setCharAt(i, (char) (sb.charAt(i) - 1));/////(char) (sb.charAt(i) - 1) = sb.charAt(i)--

		}
		return sb.toString();
	}

}
