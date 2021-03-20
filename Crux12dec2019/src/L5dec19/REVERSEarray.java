package L5dec19;

import java.util.Scanner;

public class REVERSEarray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr=takeinput(n);
		reverse(arr);
		//enhanced for loop
		for(int val:arr) {
			System.out.println(val);
		}
		

	}
	public static int[] takeinput(int n) {
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void reverse(int[] arr) {
		int last=arr.length-1;
		for(int i=0;i<(arr.length)/2;i++) {
			int temp=arr[last];
			arr[last]=arr[i];
			arr[i]=temp;
			last--;
		}
	}

}
