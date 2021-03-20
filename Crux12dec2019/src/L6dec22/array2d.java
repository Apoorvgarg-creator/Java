package L6dec22;

import java.util.Scanner;

public class array2d {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=takeinput();
		display(arr);

	}

	public static int[][] takeinput() {
		System.out.println("rows?");
		int row = scn.nextInt();
		int[][] arr = new int[row][];
		for (int r = 0; r < arr.length; r++) {
			System.out.println("cols?");
			int col = scn.nextInt();
			arr[r] = new int[col];
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = scn.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr) {
		for(int[] val:arr) {
			for(int val1: val) {
				System.out.print(val1+" ");
			}
			System.out.println();
		}
	}
}
