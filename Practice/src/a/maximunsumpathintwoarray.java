package a;

import java.util.Scanner;


public class maximunsumpathintwoarray {
	
	    static Scanner scn=new Scanner(System.in);
	    public static void main(String args[]) {
	        //using two pointer approach
	        int t=scn.nextInt();
	        while(t-->0){
	        int size1=scn.nextInt();
	        int size2=scn.nextInt();
	        int[] arr=ti(size1);
	        int[] arr1=ti(size2);
	        System.out.println(maxx(arr,arr1));}

	    }
	    public static int[] ti(int n){
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=scn.nextInt();
	        }
	        return arr;
	    }
	    public static int maxx(int[] arr,int[] arr1){
	        int i=0;
	        int j=0;
	        int sum1=0;
	        int sum2=0;
	        int sum=0;
	        while(i<arr.length && j<arr1.length){
	            if(arr[i]<arr1[j]){
	                sum1+=arr[i];
	                i++;
	            }
	             else if(arr[i]>arr1[j]){
	                sum2+=arr1[j];
	                j++;
	            }
	            else{
	                sum+=Math.max(sum1,sum2);
	                sum1=0;
	            sum2=0;
	            while(i<arr.length && j<arr1.length && arr[i]==arr1[j]){
	                sum+=arr[i];
	            i++;
	            j++;
	            }
	            }
	            
	            }
	            while(i<arr.length){
	                sum1+=arr[i];
	                i++;
	            }
	             while(j<arr1.length){
	                sum2+=arr[j];
	                j++;
	            }
	            sum=sum+Math.max(sum1,sum2);

	            return sum;

	        }
	}