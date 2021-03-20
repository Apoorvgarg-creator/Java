package L2dec14;
import java.util.*;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			int N=scn.nextInt();
			int ans=0;
			int mult=1;//2^0=1
			while(N>0) {
				int rem=N%10;
				ans=ans+rem*mult;
				mult=mult*2;
				N=N/10;
			}
			System.out.println(ans);
	}

}
