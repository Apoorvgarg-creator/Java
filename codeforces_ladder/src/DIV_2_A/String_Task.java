package DIV_2_A;

import java.util.Scanner;

public class String_Task {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word = scn.nextLine();
		word = word.toLowerCase();
		String ans="";
		int len = word.length();
		for(int i=0;i < len ;i++) {
			char chk = word.charAt(i);
			if(chk == 'a' || chk == 'e' || chk == 'i' || chk == 'o' || chk == 'u' || chk =='y') {
			
			}
			else {
				ans += ".";
				ans += chk+"";
			}
		}
		System.out.println(ans);
	}

}
