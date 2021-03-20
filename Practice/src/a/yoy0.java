package a;
import java.util.*;

public class yoy0 {
	
	
	    public static void main(String args[]) {
	        Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        int row=1;
	        int nst=1;
	        int nsp=2*n-3;
	        int val=1;
	        while(row<=n){
	            //work
	            //1num
	            val=1;
	            int cst1=1;
	            while(cst1<=nst){
	                System.out.print(val);
	                val++;
	                cst1++;
	            }
	            //space
	            int csp=1;
	            while(csp<=nsp){
	                System.out.print(" ");
	                csp++;

	            }
	            //2num
	            if(val>n) {
	            	val--;
	            }
	            int cst2=1;
	            while(cst2<=nst) {
	            	if(row==n) {
	            		
	            if(cst2==nst) {
	                  break;}
	            else {
	            	val=val-1;
	               System.out.print(val);}}
	            	else {
	            val--;
	            System.out.print(val);}
	            
	            cst2++;}
	        
	        //prep
	        System.out.println();
	        row++;
	        nsp=nsp-2;
	        nst++;}

	    }
	    
	}
	

