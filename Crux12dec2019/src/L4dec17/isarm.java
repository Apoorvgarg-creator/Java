package L4dec17;

import java.util.Scanner;

public class isarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		ch(lo, hi);

	}

	// range
	public static void ch(int lo, int hi) {
		int i = lo;
		while (i <= hi) {
			boolean res = arm(i);
			if (res) {
				System.out.println(i);
			} 
			i++;
		}

	}

	// function to count the number of digits
	public static int cod(int num) {
		int nod = 0;
		while (num > 0) {
			nod++;
			num /= 10;

		}
		return nod;
	}

	// function to check Armstrong number
	public static boolean arm(int num) {
		int x = num;
		int ans = 0;
		while (num > 0) {
			int rem = num % 10;
			num /= 10;
			ans = ans + (int) Math.pow(rem, cod(x));
		}
		if (ans == x) {
			return true;
		} else
			return false;
	}
}
