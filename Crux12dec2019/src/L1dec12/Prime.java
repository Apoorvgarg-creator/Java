package L1dec12;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// prime number
		System.out.println("Enter number:");
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();

		int count = 2;
		int temp = 0;

		while (count <= k / 2) {
			if (k % count == 0) {
				temp++;

			}
			count = count + 1;
		}
		if (temp > 0)
			System.out.println("not prime");
		else
			System.out.println("prime");

	}

}
