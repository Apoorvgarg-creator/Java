package a;
import java.util.*;
public class jj {
	  static Scanner scn =new Scanner(System.in); 
	    public static void main(String args[]) {
	        // Your Code Here
	        StringBuilder str=new StringBuilder(scn.next());
	        int x=1;
	        ArrayList<Integer>list=new ArrayList<Integer>();
	        for(int i=1;i<str.length();i++){
	            list.add(str.charAt(i)-str.charAt(i-1));
	            
	        }
	        System.out.println(list);
	        for(int i=0;i<list.size();i++){
	        	int t=list.get(i);
	        	if(t>9 || t<0) {
	        		if(t>9 || t>-10) {
	        		 str.insert(x,list.get(i));
	        		 x+=3;}
	        		else {
	        			str.insert(x,list.get(i));
		        		 x+=4;
	        		}
	        		
	        	}
	        	else {
	        	
	            str.insert(x,list.get(i));
	            x+=2;}
	        }
	        
	        
	        System.out.println(str);
	    }
	}



