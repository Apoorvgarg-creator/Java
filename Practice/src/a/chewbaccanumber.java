package a;
import java.util.*;
public class chewbaccanumber {
	
	
	
	    static Scanner scn=new Scanner(System.in);
	    public static void main(String args[]) {
	        // Your Code Here
	        long n=scn.nextLong();
	        long ans =0;
	        long mult=1; //10^0=1
	        int r=1;
	        long x=n;
	        int count=0;
	        while(x>0){
	            count++;
	            x/=10;
	        }

	        if(n==0){
	            System.out.println(ans);
	        }
	        //count the no. of digit
	       else if(n>0){
	            
	        while(r<=count){
	            long rem=n%10;
	            
	            if(9-rem>rem){
	                ans=ans+rem*mult;
	            }
	            else if(r==count){
	            	if(rem==9)
	            {
	                ans=ans+(rem)*mult;
	            }
	            else
	            {
	                ans=ans+(9-rem)*mult;
	            }}
	            else
	            {
	                ans=ans+(9-rem)*mult;}
	            mult=mult*10;
	            n/=10;
	            r++;
	        }}
	        else{

	            n=n*-1;
	        while(r<=count){
	            long rem=n%10;
	            if(9-rem<rem){
	                ans=ans+rem*mult;
	            }
	            else
	            {
	                ans=ans+(9-rem)*mult;
	            }
	            mult=mult*10;
	            n/=10;
	            r++;
	        }
	        ans=ans*-1;
	        }
	        System.out.println(ans);
	    }
	}
