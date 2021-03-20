package a;

import java.util.Scanner;

public class lowertoupper {
	 static Scanner scn=new Scanner(System.in);
	    public static void main(String args[]) {
	        // Your Code Here
	        String str=scn.next();
	        String str1=change(str);
	        
	        System.out.println(str1);
	    }
	    public static String change(String str){
	        String str1="";
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)%2==0)
	            {
	                str1+=(char)(str.charAt(i)-1);
	            }
	            else{
	                str1+=(char)(str.charAt(i)+1);
	            }
	        }
	        return str1;
	    }
	}



