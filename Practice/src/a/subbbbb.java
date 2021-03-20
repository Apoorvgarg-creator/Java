package a;
import java.util.*;
public class subbbbb {
	 public static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
	        int n = scn.nextInt();
	        int[] arr =new int [n];
	        for(int i =0;i<n;i++){
	            arr[i]=scn.nextInt();
	        }
	        int t = scn.nextInt();
	        System.out.println(subset(arr,t,0,""));

	    }
	    public static int subset(int[] arr,int t,int curr,String ans){
	        if(curr==t){
	            System.out.print(ans+" ");
	            return 1;
	        }
	        int cnt=0;
	        
	        
	        int a=arr[0];
	        curr+=a;
	        int[] roa=Arrays.copyOfRange(arr,1,arr.length);
	        for(int val:roa) {
	        	System.out.println(val);
	        	
	        }
	        System.out.println("----");
	        cnt+=subset(roa,t,curr,ans+a);
	        

	        return cnt;
	    }
	}



