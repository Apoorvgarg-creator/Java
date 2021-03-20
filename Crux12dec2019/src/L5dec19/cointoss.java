package L5dec19;

import java.util.Scanner;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0;
		int p = (int) Math.pow(2, n);
		while (r < p) {
			// conversion
			int[] ans = new int[n];
			int mult = 1; // src=10 10^0=1
			int k = r;

			int a = 0;
			while (a < 3) {
				int rem = k % 2;
				ans[a] = ans[a] + mult * rem;
				mult = mult * 10;
				k /= 2;
				a++;
			}

			// check
			for (int l = 0; l < ans.length; l++) {
				if (ans[l] == 0) {

					System.out.print("H");
				} else
					System.out.print("T");
			}
			System.out.println();
			r++;
		}

	}

}
