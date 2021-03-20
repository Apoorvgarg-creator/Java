package DIV_2_A;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int W = scn.nextInt();
		if (W%2 == 0 && W > 2 ) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
