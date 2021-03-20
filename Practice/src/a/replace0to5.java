package a;
import java.util.*;
public class replace0to5 {
	public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
       
        int n=scn.nextInt();
        int ans=0;
        int mult=1;
        if(n==0) {
        	ans=5;
        }
        while(n>0){
            int rem=n%10;
            if(rem==0){
                ans=ans+5*mult;
            }
            else
            {
                ans=ans+rem*mult;
            }
            mult=mult*10;
            
            n/=10;
        }
        System.out.println(ans);

    }
}


