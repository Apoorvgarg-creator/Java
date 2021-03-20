package a;
import java.util.*;
public class calculator {
	
	    public static void main(String args[]) {
	        // Your Code Here
	        Scanner scn=new Scanner(System.in);
	        char ch;
	        
	        do{
	        	ch=scn.next().charAt(0);
	        int res=0;
	        if(ch=='*'||ch=='/'||ch=='+'||ch=='-'||ch=='%'){
	            int a=scn.nextInt();
	            int b=scn.nextInt();
	            if(ch=='*')
	            res=a*b;
	            else if(ch=='+')
	            res=a+b;
	            else if(ch=='-')
	            res=a-b;
	            else if(ch=='/')
	            res=a/b;
	            else
	            res=a%b;

	            System.out.println(res);
	        }
	        else if(ch=='x'|| ch=='X')
	        {}
	        	else{
	        
	        System.out.println("Invalid operation. Try again.");
	        }
	        }while(ch!='x'&& ch!='X');

	        
	    }
	}


