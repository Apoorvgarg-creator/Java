package L1dec12;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// reverse
		 Scanner scn=new Scanner(System.in);
		 int k=scn.nextInt();
		 int r;
		 int res=0;
		 while(k!=0) {
			 r=k%10;
			 k=k/10;
			 res=res*10+r;
		 }
		 System.out.println(res);
	 }

}
