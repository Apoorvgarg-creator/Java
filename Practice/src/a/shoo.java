package a;
import java.util.*;
public class shoo {
	
	
	    public static void main(String args[]) {
	        Scanner scn=new Scanner(System.in);
	        int t=scn.nextInt();
	        int count=1;
	        
	        while(count<=t){
	            int totala=0;
	        int totalh=0;
	        int m=scn.nextInt();
	        int n=scn.nextInt();
	        int a=1;
	        int b=2;
	        while(a<=m){
	            totala++;
	            a+=2;
	        }
	        while(b<=n){
	        totalh++;
	        b+=2;
	        }
	        if(totala>totalh){
	            System.out.println("Aayush");

	        }
	        else{
	            System.out.println("Harshit");
	        }
	        count++;
	        }
	    }
	}

