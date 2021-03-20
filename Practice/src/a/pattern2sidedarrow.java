package a;

import java.util.*;

public class pattern2sidedarrow {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int val1=1;
		int val2=1;
		int r=1;
		// int range = -1;
		int nst1 = 0;
		int nsp = n - 1;
		while (row <= n) {
			// work
			val1=r;
			val2=1;
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// star
			int cst = 1;
			while (cst <= nst) {
				if (cst > (nst + 1) / 2) {
					System.out.print(" ");
				} else
					System.out.print(val1);
				val1--;
				cst++;
			}
			// star2
			int cst1 = 1;
			while (cst1 <= nst1) {
				if (cst1 > (nst1 - 1) / 2) {
					System.out.print(val2);
					val2++;
				} else
					System.out.print(" ");
				cst1++;
				
			}

			/// prep
			System.out.println();
			if (row <= n / 2) {
				nst = nst + 2;
				nst1 = nst1 + 2;
				nsp = nsp - 2;r++;
				// range++;
			} else {
				nst1 = nst1 - 2;
				nst = nst - 2;
				nsp = nsp + 2;r--;
				//// range--;

			}
			row++;

		}
	}
}
