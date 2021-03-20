package DIV_2_A;

import java.util.Scanner;

public class Cheap_travel {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();
		float dm = m/b;
		float d1 = 1/a;
		int cost1 = 0;
		int cost2 = 0;
		if(dm > d1) {
			cost1 = d1 * n;
			
		}
	}

}
