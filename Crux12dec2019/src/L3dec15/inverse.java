package L3dec15;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int ans=0;
			int pos=1;
			while(n>0) {
				int rem=n%10;
				
				ans=ans+pos*(int)Math.pow(10,rem-1);
				n/=10;
				pos++;
			}
	System.out.println(ans);
	}
	

}
