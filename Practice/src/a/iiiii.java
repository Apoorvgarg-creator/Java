package a;
import java.util.*;
public class iiiii {
	   static Scanner scn =new Scanner(System.in);
	    public static void main(String args[]) {
	    	System.out.println((int)'A');
	        // Your Code Here
	        StringBuilder str= new StringBuilder(scn.next());
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)>='a' &&str.charAt(i)<='z'){
	                    str.setCharAt(i,(char)(str.charAt(i)-32));
	            }
	             else if(str.charAt(i)>='A' &&str.charAt(i)<='Z'){
	                 str.setCharAt(i,(char)(str.charAt(i)+32));
	                
	            }
	        }
	        System.out.println(str);
	    }
	}
