package L1dec12;

import java.util.Scanner;  // #include in c++ is equivalent to import

public class evenodd {

	public static void main(String[] args) {
		
		//int val;
		System.out.println("Enter n");
		Scanner scn = new Scanner(System.in);
		int k=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(n);
		System.out.println(k);
		
		if(n%2==0) {
			System.out.println("Even");
			
		}
		else
			System.out.println("odd");
	}

}


// while(count<=10); this represents infinite loop
// same goes for ""for loop""