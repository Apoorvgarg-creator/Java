package L1dec12;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// fibonacci series
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int count=0;
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a);
		System.out.print(b);
		
		while(count<n) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum);
			count++;
		}

	}

}
