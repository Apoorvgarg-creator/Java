package L3dec15;

import java.util.Scanner;

public class celtofahr {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int minF=scn.nextInt();
		int maxF=scn.nextInt();
		int step=scn.nextInt();
		//char a=scn.next().charAt(0);
		int f=minF;
		while(f<=maxF) {
			int c=(int)((5.0/9)*(f-32));   ///very important ... Expression , type casting-implicit as well as explicit
			System.out.println(f+"\t"+c);
			f=f+step;
		}

	}
}
