package DIV_2_A;

import java.util.Scanner;

public class Fox_And_Snake {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		boolean st = false;
		
		for(int i = 0;i<n;i++) {
			int count = 0;
			for(int j =0;j<m;j++) {
				if (i%2 == 0) {
					System.out.print("#");
				}else if (j==m-1 && !st && count < 1) {
					System.out.print("#");
					st = true;
					count +=1;
				}else if ((j==0 && st && count < 1)) {
					System.out.print("#");
					st = false;
					count +=1;
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
			
		}

	}

}
