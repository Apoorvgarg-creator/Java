package a;
import java.util.*;
public class asss {

	
		public static void main(String args[]) {
			Scanner scn=new Scanner(System.in);
			int N=scn.nextInt();
			int[] n=new int[20];
			int count=0;
			while(count<N){
				n[count]=scn.nextInt();
				count++;
			}
			int i=0;
			while(i<N){
			int ans=0;
			int mul=1;//2^0=1

			while(n[i]>0){
				int rem=n[i]%10;
				ans=ans+mul*rem;
				mul=mul*2;
				n[i]=n[i]/10;
			}
			System.out.println(ans);
			i++;
	    }}
	}


