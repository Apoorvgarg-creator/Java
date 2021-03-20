package L5dec19;

import java.util.Scanner;

public class sumofsubarray3loop {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int n=scn.nextInt();
		// [] arr =takeinput(n);
		int[] arr = { 10, 20, 30, 40 };
		subarray(arr);
	}
	// }public static int[] takeinput(int n) {
	// int[] arr = new int[n];
	// for (int i = 0; i < arr.length; i++) {
	// arr[i] = scn.nextInt();
	// }
	// return arr;
	// }

	public static void subarray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				// System.out.print(arr[j]);
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
					// System.out.print(sum);
				}
				System.out.print(sum);
				System.out.println();

			}
		}

		System.out.println();
	}
}

/*
 * -----method---- for (int i = 0; i < arr.length; i++) { int r=arr.length-1;
 * for (int j = i; j < arr.length; j++) { // System.out.print(arr[j]); for (int
 * k = i; k <= r; k++) { System.out.print(arr[k]); } System.out.println(); r--;
 * } }
 * 
 * System.out.println();
 * 
 * 
 * 
 * 
 * 
 * 
 */