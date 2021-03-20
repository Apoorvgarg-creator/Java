package L5dec19;

import java.util.*;

public class bubblesort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 30, 10, 60, 5 };
		bubblesort(arr);
		

	}

	public static void bubblesort(int[] arr) {
		for (int count = 0; count <= arr.length - 2; count++) {
			System.out.println("count:" + count);
			for (int j = 0; j <= arr.length - count - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				display(arr);
			}
		}
	}

	public static void display(int[] arr) {
		// enhanced for loop
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
