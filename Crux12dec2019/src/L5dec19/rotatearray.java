package L5dec19;

import java.util.Scanner;

public class rotatearray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		// enhanced for loop
		int rot = scn.nextInt();
		rotate(arr, rot);
		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % (arr.length);
		if (rot < 0) {
			rot = rot + arr.length;
		}

		int r = 1;

		while (r <= rot) {
			int last = arr.length;
			int temp = arr[last - 1];

			for (int i = 0; i < arr.length - 1; last--, i++) {

				arr[last - 1] = arr[last - 2];
			}
			arr[0] = temp;
			r++;
		}
	}

}
