package DIV_2_A;

import java.util.Scanner;

public class Petya_and_Strings {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word1 = scn.nextLine();
		String word2 = scn.nextLine();
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		int ans = 0;
		for (int i = 0; i < word1.length();i++) {
			if (word1.charAt(i) > word2.charAt(i)) {
				ans = 1;
				break;
			}else if (word1.charAt(i) < word2.charAt(i)){
				ans = -1;
				break;
			}else {
				ans = 0;
			}
				
		}
		System.out.println(ans);
	}
}
