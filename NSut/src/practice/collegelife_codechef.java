package practice;


	/* package codechef; // don't place package name! */

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	/* Name of the class has to be "Main" only if the class is public. */

public class collegelife_codechef {
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner scn = new Scanner(System.in);
			
			int T = scn.nextInt();
			while(T-- >0){
			int S = scn.nextInt();
			int[] Q = new int[S];
			for(int i=0;i<S;i++){
			    Q[i] = scn.nextInt();
			}
			int dur = 0;
			for(int i =0;i<S;i++){
			    int ep_n = scn.nextInt();
			    
			    int[] ep_dur = new int[ep_n];
			    for(int j =0;j<ep_n;j++){
			        ep_dur[j] = scn.nextInt();
			        if(j == 0){
			            dur += ep_dur[j];
			        }else{
			            dur += ep_dur[j] - Q[i];
			        }
			    }
			    
			    
			}
			System.out.println(dur);
			
			}
			
		}
	}

