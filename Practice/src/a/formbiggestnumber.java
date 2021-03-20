package a;
import java.util.*;
public class formbiggestnumber {
	  static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
	        int t=scn.nextInt();
	        while(t-->0){
	        int n =scn.nextInt();
	        int[] arr=new int[n];
	       for(int k=0;k<arr.length;k++) {
	    	   arr[k]=scn.nextInt();
	       }
	        //bubble sort
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=0;j<arr.length-i-1;j++){
	                if(check(arr[j],arr[j+1])){
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                }
	            }

	        }
	        
	        for(int val: arr){
	        System.out.print(val);
	        
	    }
	    
	    }

	}
	    public static boolean check(int a,int b){
	        String s1=a+""+b;
	        String s2=b+""+a;
	        return s1.compareTo(s2)<0;
	    }
	}

