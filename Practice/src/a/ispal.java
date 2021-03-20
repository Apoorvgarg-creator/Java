package a;
import java.util.*;
public class ispal {

	
	    static Scanner scn = new Scanner (System.in);
	    public static void main(String args[]) {
	        // Your Code Here
	        String str=scn.next();
	        System.out.println(ispal(str));

	    }
	    public static boolean ispal(String str){
	        int l=str.length()-1;
	        for(int i=0;i<str.length()/2;i++){
	            if(str.charAt(i)!=str.charAt(l)){
	                    return false;
	            }
	            l--;
	            
	        }
	        return true;
	    }
	}

