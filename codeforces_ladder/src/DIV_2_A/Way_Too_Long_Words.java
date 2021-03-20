package DIV_2_A;

import java.util.Scanner;

public class Way_Too_Long_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T-->=0) {
			String word = scn.nextLine();
				if (word.length() > 10) {
					System.out.println((word.charAt(0)+""+(word.length()-2) +""+(word.charAt(word.length()-1))));
				}else {
					System.out.println(word);
				}
					
		}

	}

}
