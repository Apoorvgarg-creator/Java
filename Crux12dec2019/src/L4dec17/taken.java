package L4dec17;

import java.util.Scanner;

public class taken {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HOw to pass array in function and how to return array in function.....
		int[] arr=takeinput();
		display(arr);

	}
	public static int[] takeinput() {
			System.out.println("Size?");
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				System.out.println("arr["+i+"]?");
				arr[i]=scn.nextInt();
				
			}
			return arr;
	}
	public static void display(int[] arr) {
		//enhanced for loop
		for( int val: arr) {
			System.out.print(val+" ");
		}
		System.out.println();
	}

}
