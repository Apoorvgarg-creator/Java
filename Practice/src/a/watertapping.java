package a;

import java.util.Scanner;

public class watertapping {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		int t=scn.nextInt();
		while(t>0) {
			t--;
			int n=scn.nextInt();
			int[] arr=ti(n);
			
		}

	}
	public static int[] ti(int n)
	{	int[] arr=new int[n];
		for(int i=0;i<n;i++){
		arr[i]=scn.nextInt();
		}
		return arr;
	}
}
