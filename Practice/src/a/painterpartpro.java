package a;

import java.util.Scanner;

public class painterpartpro {
	
	
		
		 static Scanner scn =new Scanner (System.in);
		    public static void main(String args[]) {
		        int k=scn.nextInt();//no.of painter
		        int p=k;
		        int n=scn.nextInt();//no.of board
		        int[] arr=ti(n);//array to store the units of board
		        if(k>=n){
		        sort(arr);
		        System.out.println(arr[arr.length-1]);
		        }
		        else{
		            int a;
		            a=n/k;
		            int rem=n%k;
		             int noofpartition=0;
		            if(n%k==0){
		                 noofpartition=a;
		            }
		            else{
		             noofpartition=a+1;
		            }
		            int[] arr11=new int[noofpartition];
		            int t=noofpartition;
		            int b=0;
		            int e=k;
		            int aaa=0;
		            while(t>0){
		            	
		                if(e>arr.length ){
		                	
		                    e=arr.length;
		                }
		                arr11[aaa]=max(arr,b,e);
		                b=b+k;
		                e=e+k;
		                aaa++;
		                t--;
		            }
		            
		            System.out.println(sum(arr11));

		        }


		    }
		    public static int[] ti(int n){
		        int[] arr=new int[n];
		        for(int i=0;i<n;i++){
		            arr[i]=scn.nextInt();
		        }
		        return arr;
		    }
		    //Insertion Sort
		    public static void sort(int[] arr){
		        for(int count=1;count<arr.length;count++){
		            int temp=arr[count];
					int j=count-1;
					while(j>=0&&arr[j]>temp) {
						arr[j+1]=arr[j];
						j--;
					}
					arr[j+1]=temp;
				}
			}
		    public static int sum(int[] arr){
		        int sum=0;
		        for(int i=0;i<arr.length;i++){
		            
		            sum+=arr[i];
		        }
		        return sum;
		    }
		    public static int max(int[] arr,int b,int e){
		        int max=arr[b];
		        for(int i=b+1;i<e;i++){
		            if(arr[i]>max){
		                max=arr[i];
		                            }
		        }
		        return max;
		    }
		}
