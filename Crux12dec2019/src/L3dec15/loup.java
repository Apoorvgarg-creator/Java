package L3dec15;

import java.util.Scanner;

public class loup {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int a = 'a';
		int b = 'A';
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("LOWERCASE");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");
		} else
			System.out.println("Invalid");

	}

}
