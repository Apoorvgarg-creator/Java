package a;
import java.util.*;
public class anytoany {
	public static void main(String args[]) {
        Scanner scn = new Scanner (System.in);
        int src=scn.nextInt();
        int dst=scn.nextInt();
        int n=scn.nextInt();
        int ans1=0;
        if(src==10||dst==10){
            if(src==10){
                int ans=0;
                int mult=1; //10^0=1
                while(n>0){
                    int rem=n%dst;
                    n=n/dst;
                    ans=ans+mult*rem;
                    mult*=10;

                }
                ans1=ans;}
                else
                {
                int ans=0;
                int mult=1; //src^0=1
                while(n>0){
                    int rem=n%10;
                    n=n/10;
                    ans=ans+mult*rem;
                    mult*=src;

                }ans1=ans;
                }
            }
                else{
                    int dst10=0;
                int mult=1; //src^0=1
                while(n>0){
                    int rem=n%10;
                    n=n/10;
                    dst10=dst10+mult*rem;
                    mult*=src;


                }
                int ans=0;
                mult=1; //10^0=1
                while(dst10>0){
                    int rem=dst10%dst;
                    dst10=dst10/dst;
                    ans=ans+mult*rem;
                    mult*=10;
                }
                ans1=ans;}
        System.out.println(ans1);
	}
}
            
        

    
                
