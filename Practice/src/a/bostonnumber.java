package a;
import java.util.*;
public class bostonnumber {
	
	    static Scanner scn =new Scanner(System.in);
	    public static void main(String args[]) {

	            int n=scn.nextInt();
	          int sum=sumofprimefactor(n);
	          int su=0;
	          while(n>0){int rem=n%10;
	          su+=rem;
	          n/=10;

	          }
	          if(su==sum){
	              System.out.println("1");

	          }
	          else
	          System.out.println("0");
	    }
	    public static int sumofprimefactor(int n){
	        int lo=2;
	        int sum=0;
	        while(n>1){
	            if(n%lo==0){
	            	int t=lo;
	            	while(t>0){int rem=t%10;
	  	          sum+=rem;
	  	          t/=10;

	  	         }
	            	
	                n/=lo;
	            }
	            else{
	                lo++;
	            }
	            
	        }
	        return sum;
	        
	    }
	}


