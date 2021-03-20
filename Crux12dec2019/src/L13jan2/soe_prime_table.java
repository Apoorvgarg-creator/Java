package L13jan2;

import java.lang.reflect.Array;
import java.util.*;

public class soe_prime_table {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// Prime time complexity O(nlnlnn)
		int n = scn.nextInt();
		boolean[] check = new boolean[n + 1];
		prime(n, check);
		for (int i = 0; i < check.length; i++) {
			if (check[i]) {
				System.out.println(i);
			}
		}

	}

	public static void prime(int n, boolean[] check) {
		Arrays.fill(check, true);
		check[0] = false;
		check[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (check[table]) {
				for (int mult = 2; mult * table <= n; mult++) {
					check[mult * table] = false;
				}
			}
		}
	}
}
