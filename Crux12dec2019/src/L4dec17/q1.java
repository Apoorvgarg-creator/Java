package L4dec17;

import java.util.*;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print prime number from low to high
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		printPrime(lo, hi);

	}

	// print prime
	public static void printPrime(int lo, int hi) {
		int i = lo;
		while (i <= hi) {
			boolean res = isPrime(i);

			if (res) {
				System.out.println(i);
			}

			i++;
		}

	}

	// function to check prime or not
	public static boolean isPrime(int x) {
		int flag = 0;
		int count = 2;
		while (count <= x / 2) {
			if (x % count == 0) {
				flag++;
			}
			count++;
		}
		//if (flag > 0) {
	//		return false;
	//	} else
	//		return true;
		
		
		/* the above statement can be written as 
		 * return flag==0;
		 */
		return flag==0;

	}

}
