package L3dec15;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int l;
		int i;
		int count = 0;
		int copy = n;
		int copy2 = n;
		int copy3 = n;
		// loop to count the no. of digits
		while (copy != 0) {
			copy = copy / 10;
			count++;
		}
		r=r%count;
		if(r<0) {
			r=r+count;
		}
		
		// reverse a number
		int ans = 0;
		while (copy2 != 0) {
			int a = copy2 % 10;
			copy2 = copy2 / 10;
			ans = 10 * ans + a;

		}

		int copy4 = ans;

		if (r > 0) {
			while (r > 0) {
				l = copy3 % 10;
				copy3 = copy3 / 10;
				int k = (int) Math.pow(10, count - 1);
				copy3 = copy3 + l * k;
				r--;
			}
			System.out.println(copy3);
		} else {
			while (r < 0) {
				i = copy4 % 10;
				copy4 = copy4 / 10;
				int j = (int) Math.pow(10, count - 1);
				copy4 = copy4 + i * j;
				r++;

			}

			int ans1 = 0;
			while (copy4 != 0) {
				int a1 = copy4 % 10;
				copy4 = copy4 / 10;
				ans1 = 10 * ans1 + a1;

			}
			System.out.println(ans1);

		}

	}
}
/*
 * method2 for r<0
 * 
 * -1 rotation is equivalent to +5th rotation; hence -r+(+r)=no. of digits
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
