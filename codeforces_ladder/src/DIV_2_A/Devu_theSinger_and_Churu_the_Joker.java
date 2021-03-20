package DIV_2_A;

import java.util.Scanner;

public class Devu_theSinger_and_Churu_the_Joker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int[] time = new int[n];
		int total_sing = 0;
		for (int i=0;i<n;i++) {
			time[i] =scn.nextInt();
			total_sing += time[i];
		}
//		System.out.println("Sum of array:");
//		System.out.println(total_sing);
		total_sing += (n-1)*10;
//		System.out.println("Total time event");
//		System.out.println(total_sing);
		if(d == total_sing) {
			System.out.println(((n-1)*10)/5);
		}else if( d > total_sing) {
			int x = d - total_sing;
//			System.out.println(x);
			int add = 0;
			if(x >= 5) {
			add = x/5 ;
			}else {
				add = 0;
			}
//			System.out.println(add);
			int ans = (((n-1)*10)/5) + add;
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
		
	}

}
