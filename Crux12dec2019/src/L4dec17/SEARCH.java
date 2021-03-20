package L4dec17;

import java.util.*;

public class SEARCH {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		/// Linear Search

		int[] arr = takeinput();
		display(arr);
		int n = scn.nextInt();
		int o = search(arr, n);
		if (o == -1) {
			System.out.println("-1");
		}

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

	public static int search(int[] arr, int item) {
		int flag = -1;
		for (int i = 0; i < arr.length; i++) {
			if (item == arr[i]) {
				flag = 0;
				System.out.println("The " + item + " is at index " + i);
			}

		}
		return flag;
	}

}
