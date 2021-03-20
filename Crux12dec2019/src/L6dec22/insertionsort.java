package L6dec22;

import java.util.Scanner;

public class insertionsort {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,8,11,9,7};
		insertionsor(arr);
		display(arr);

	}
	public static void display(int[] arr) {
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
	}

	public static void insertionsor(int[] arr) {
		for(int count=1;count<=arr.length-1;count++) {
			int temp=arr[count];
			int j=count-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
