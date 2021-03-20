package a;
import java.util.*;
public class subplll {

	    static Scanner scn =new Scanner(System.in);
	    public static void main(String args[]) {
	        // Your Code Here
	        String str=scn.next();
	        System.out.println(sub(str));
	    }
	    public static int sub(String str){
	        int count=0;
	        for(int i=0;i<str.length();i++){
	            for(int j=i+1;j<str.length();j++){
	                if(ispal(str.substring(i,j))){
	                    count++;
	                }
	            }
	        }
	        return count;
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
