package a;
import java.util.*;
public class ap {
	
	
	    static Scanner scn =new Scanner(System.in);
	    public static void main(String args[]) {
	        int n=scn.nextInt();
	        int[] arr=takeinput(n);
	        int q=scn.nextInt();
	        oper(arr,q);
	        for(int val:arr) {
	        	System.out.println(val);
	        }
	        int x=sum(arr);
	        int ans=x%((int)Math.pow(10,9)+7);
	        System.out.println(ans);

	    }
	    public static int[] takeinput(int n){
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=scn.nextInt();
	        }
	        return arr;
	    }
	    public static void oper(int[] arr,int q){
	        int count=1;
	        while(count<=q){
	            int[] ar=new int[arr.length];
	            int x=scn.nextInt();
	            x=x%arr.length;
	            if(x<0){
	                x=x+arr.length;
	            }
	            for(int j=0;j<arr.length;j++){
	                  ar[j]=arr[j];  

	            }
	            for(int i=0;i<arr.length;i++){ 
	                int ll=i-x;
	                if(i-x<0){
	                    ll=arr.length-x;
	                }  
	                arr[i]=ar[i]+ar[ll];
	            }
	            count++;
	        }

	    }
	    public static int sum(int[] arr){
	        int sum=0;
	        for(int i=0;i<arr.length;i++){
	            sum+=arr[i];
	        }
	        return sum;
	        
	    }
	}

