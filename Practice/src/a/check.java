package a;
import java.util.*;
public class check {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) {
        int n=scn.nextInt();
        int[] arr=takeinput(n);
        int item=scn.nextInt();
       System.out.println(binarysearch(arr,item));

    }
    public static int[] takeinput(int n){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int binarysearch(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
           int mid=(lo+hi)/2;
            if(item>arr[mid]){
                lo=mid+1;
            }
            else if(item<arr[mid]){
                hi=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}

