package a;
import java.util.*;
public class wavycol {
	
	    static Scanner scn=new Scanner(System.in); 
	    public static void main(String args[]) {
	        int m=scn.nextInt();
	        int n=scn.nextInt();
	        int[][] arr=ti(m,n);
	        wave(arr);

	    }
	    public static int[][] ti(int m,int n){
	        int[][] arr= new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                arr[i][j]=scn.nextInt();
	            }
	        }
	        return arr;
	    }
	    public static void wave(int[][] arr){
	        for(int col=0;col<arr[0].length;col++)
	        {
	            if(col%2!=0){
	                int i=arr.length-1;
	                while(i>=0){
	                    System.out.print(arr[i][col]+", ");
	                    i--;
	                }}
	                else
	                {
	                    int i=0;
	                    while(i<arr.length){
	                        System.out.print(arr[i][col]+", ");
	                        i++;
	                    }
	                }
	            }
	            System.out.print("END");
	        }
	        
	    
	}


