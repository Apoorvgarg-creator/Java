package L6dec22;

import java.util.Scanner;

public class wavedisplay {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		c(arr);

	}

	public static void c(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			int t;
			int r;
			if (c % 2 != 0) {
				t = 0;
				r = arr.length - 1;
				while (r >= t) {
					System.out.print(arr[r][c] + " ");
					r--;

				}
			} else {
				t = arr.length;
				r = 0;
				while (r < t) {
					System.out.print(arr[r][c] + " ");
					r++;

				}
			}

		}
	}

}
