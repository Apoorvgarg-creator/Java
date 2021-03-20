package a;
import java.util.*;
public class Main {
	
	
	    public static void main(String args[]) {
	        Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        int row=1;
	        int nst=(2*n+1)/2;
	        int nsp=0;
	      //int val;  
	        while(row<=(2*n+1)){
	            //work
	        	//space
	            int csp=1;
	            while(csp<=nsp){
	                System.out.print(" ");
	                csp++;

	            }
	            //star1
	            int cst1=1;
	            while(cst1<=nst){
	                System.out.print("*");
	                cst1++;

	            }
	            
	            //2 star
	            int cst2=1;
	            while(cst2<nst){
	                System.out.print("*");
	                cst2++;
	            }
	            //prep
	            System.out.println();
	            
	            if(row<=n){
	                nsp++;
	                nst--;
	            }
	            else
	            {
	                nsp--;
	                nst++;

	            }
	            row++;


	        }

	    }
	}

