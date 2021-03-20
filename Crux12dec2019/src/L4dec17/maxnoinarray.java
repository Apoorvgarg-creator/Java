package L4dec17;

import java.util.*;

public class maxnoinarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HOw to pass array in function and how to return array in function.....
		int[] arr = takeinput();
		System.out.println(maxo(arr));

	}

	public static int[] takeinput() {
		System.out.println("Size?");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]?");
			arr[i] = scn.nextInt();

		}
		return arr;
	}

	public static void display(int[] arr) {
		// enhanced for loop
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int maxo(int[] arr) {
		int max = arr[0];
		// OR max=Integer.MIN_VALUE;
		// IF MIN THEN = INFINITY
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/*
	 * public static int maxo(int[] arr) { // int max=0; for (int i = 0; i <
	 * arr.length; i++) { // max=arr[0]; for (int j = 1; j < arr.length; j++) { if
	 * (arr[i] > arr[j]) { return arr[i]; } else { int temp = arr[i]; arr[i] =
	 * arr[j]; arr[j] = temp; } }
	 * 
	 * } return arr[arr.length - 1]; }
	 */

}