package a;
import java.util.*;
public class spiraldishackerlbo {
	
	    static Scanner scn =new Scanner(System.in);
	    public static void main(String args[]) {
	        int m=scn.nextInt();
	        int n =scn.nextInt();
	        int[][] arr=ti(m,n);
	        spiral(arr);
	    }
	    public static int[][] ti(int m,int n){
	        int[][] arr=new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                arr[i][j]=scn.nextInt();
	            }
	        }
	        return arr;
	    }
	    public static void spiral(int[][] arr){
	        int maxrow=arr.length-1;
	        int minrow=0;
	        int maxcol=arr[0].length-1;
	        int mincol=0;
	        int noe=arr.length*arr[0].length;
	        int count=0;
	        while(count<noe){
	            //first col
	            for(int i=minrow;i<=maxrow && count<noe;i++){
	                System.out.print(arr[i][mincol]+", ");
	                count++;
	            }
	            mincol++;
	            //last row
	            for(int i=mincol;i<=maxcol && count<noe;i++){
	                System.out.print(arr[maxrow][i]+", ");
	                count++;
	            }
	            maxrow--;
	            //last col
	            for(int i=maxrow;i>=minrow && count<noe;i--){
	                System.out.print(arr[i][maxcol]+", ");
	                count++;
	            }
	            maxcol--;
	            //first row
	            for(int i=maxcol;i>=mincol && count<noe;i--){
	                System.out.print(arr[minrow][i]+", ");
	                count++;
	            }
	            minrow++;
	        }
	        System.out.println("END");
	    }
	}


