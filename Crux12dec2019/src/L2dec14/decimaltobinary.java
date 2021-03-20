package L2dec14;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			int N=scn.nextInt();
			int ans=0;
			int mult=1;//10^0=1
			while(N>0) {
				int rem=N%2;
				ans=ans+rem*mult;
				mult=mult*10;
				N=N/2;
				
			}
			System.out.println(ans);
	}

}
