package selfpr;

import java.util.Scanner;
public class ruler {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int mtl=scn.nextInt();
		rec(n,mtl);

	}
	
	public static void rrrr(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("-");
		}
	}

	public static void rec(int n,int mtl) {
		if (n == 0) {
			return;
		}
		String s="";
		for (int i = 0; i < n; i++) {
			s=s+"-";
		}
		if(n==mtl) {
			System.out.println(s);
		}
		
		rec(n - 1,mtl);
		System.out.println(s);
		rec(n - 1,mtl);
		if(n==mtl) {
			System.out.println(s);
		}

		
	}

}


