package L5dec19;

import java.util.Scanner;

public class cointoss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int limit = (int) Math.pow(2, n);
		for (int i = 0; i < limit; i++) {
			int temp = i;
			for (int j = 0; j < n; j++) {
				int rem = temp % 2;
				if (rem == 0) {
					System.out.print("H");
				} else {
					System.out.print("T");
				}

				temp /= 2;
			}
			System.out.println();

		}

	}

}
