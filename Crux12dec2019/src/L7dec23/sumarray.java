package L7dec23;

import java.util.ArrayList;

public class sumarray {

	public static void main(String[] args) {
		int[] one = { 9, 9, 9, 9 };
		int[] two = { 9, 9 };
		System.out.println(sum(one, two));

	}

	public static ArrayList<Integer> sum(int[] one, int[] two) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int i = one.length - 1;
		int j = two.length - 1;
		int carry = 0;
		while (i >= -1 || j >= -1) {
			int sum = carry;
			if (i >= 0) {
				sum += one[i];
			}
			if (j >= 0) {
				sum += two[j];
			}
			i--;
			j--;
			int rem = sum % 10;
			carry = sum / 10;
			res.add(0, rem);
		}
		return res;
	}

}
