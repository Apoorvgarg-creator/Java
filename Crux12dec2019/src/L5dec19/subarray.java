package L5dec19;

import java.util.Scanner;

public class subarray {
	static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr =takeinput(n);
		subarray(arr);
	}public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void subarray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				// System.out.print(arr[j]);
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				
			}
		}

		System.out.println();
	}
}


/*     -----method----
 * 	for (int i = 0; i < arr.length; i++) {
 * int r=arr.length-1;
			for (int j = i; j < arr.length; j++) {
				// System.out.print(arr[j]);
				for (int k = i; k <= r; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
				r--;
			}
		}

		System.out.println();

 * 
 * 
 * 
 * 
 * 
 */