package L13jan2;

import java.util.Scanner;

public class timecomplexity_series {
	// 0(n)
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int x = scn.nextInt();
		int p = n;
		int res = 0;
		int res1 = (int) Math.pow(x, n);

		for (int i = 1; i <= n; i++) {
			res += i * res1;
			res1 /= x;
		}
		

		System.out.println(res);
	}

}
