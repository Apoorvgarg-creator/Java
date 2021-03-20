package a;
import  java.util.*;
public class stringremoveduplicate {
	
	    static Scanner scn =new Scanner (System.in);
	    public static void main(String args[]) {
	        // Your Code Here
	        StringBuilder str=new StringBuilder(scn.next());
	        StringBuilder ans= new StringBuilder();
	        
	        int i=0;
	        int j=i+1;
	        while(i<str.length() && j<str.length()){
	            
	        if(str.charAt(i)==str.charAt(j)){
	        	if(j==str.length()) {
	            	i++;
	        	}

	            while(i<str.length() && j<str.length()&&str.charAt(i)==str.charAt(j)){
	            i++;
	            j=i+1;
	            }
	            
	           
	            
	        }
	       
//	        if(str.charAt(i)==str.charAt(j)){
//		        if(j==str.length()) {
//	            	i++;
//	            }}
	        if(j<str.length()) {
	        	 ans.append(str.charAt(i));
	        if(str.charAt(i)!=str.charAt(j)){
	            i++;
	            j=i+1;
	        
	        }
	        }
	       
	       
	        }
	        while(i<str.length()){
	            ans.append(str.charAt(i));
	            i++;
	        }
	        System.out.println(ans);

	    }
	}



