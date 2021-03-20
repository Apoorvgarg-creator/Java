package DIV_2_A;

import java.util.Scanner;

public class Lucky_divison {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// Lucky no.  --> 4 and 7
		int n = scn.nextInt();
		boolean false_digit = lucky(n);
		if (false_digit) {
		if (n%4 == 0 || n%7 ==0) {
			System.out.println("YES");
			return ;
		}
		int ch = n%47;
		if (ch == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		}
		else {
			System.out.println("YES");
		}
	}
	public static boolean lucky(int n) {
		int dum =n;
		boolean false_digit = false;
		while(dum>0) {
			int digit = dum%10;
			dum = dum/10;
			if(digit != 4 && digit != 7) {
				false_digit = true;
				break;
			}
		}
		return false_digit;
	}

}
