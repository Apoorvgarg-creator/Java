package OSLAB;

import java.util.Scanner;
public class SJF {
	
		static void findWaitingTime(int[] pid, int[] bt, int[] art, int n, int[] wt) 
		{ 
			int com_t = 0, t = 0, minm = Integer.MAX_VALUE; 
			int sht = 0, fi_t; 
			boolean check = false; 
			int rt[] = new int[n]; 
	
			for (int i = 0; i < n; i++) 
				rt[i] = bt[i]; 

			while (com_t != n) { 
	 
				for (int j = 0; j < n; j++) 
				{ 
					if ((art[j] <= t) && 
					(rt[j] < minm) && rt[j] > 0) { 
						minm = rt[j]; 
						sht = j; 
						check = true; 
					} 
				} 
		
				if (check == false) { 
					t++; 
					continue; 
				} 
	
				rt[sht]--; 
	 
				minm = rt[sht]; 
				if (minm == 0) 
					minm = Integer.MAX_VALUE; 
		
				if (rt[sht] == 0) { 
		
					com_t++; 
					check = false; 
	
					fi_t = t + 1; 
		
					
					wt[sht] = fi_t - 
								bt[sht] - 
								art[sht]; 
		
					if (wt[sht] < 0) 
						wt[sht] = 0; 
				}  
				t++; 
			} 
		} 
		
		static void findavgTime(int[] pid,int[] bt,int[] art, int n) 
		{ 
			int wt[] = new int[n]; 
			int total_wt = 0; 
	
			findWaitingTime(pid,bt,art, n, wt); 
		
			System.out.println("Processes " + " Burst time " + " Waiting time "); 
			 
			for (int i = 0; i < n; i++) { 
				total_wt = total_wt + wt[i]; 
				System.out.println(" " + pid[i] + "          "+ bt[i] + "               " + wt[i] ); 
			} 
		
			System.out.println("Average waiting time = " + (float)total_wt /(float)n);  
		} 
		
		
		public static void main(String[] args) 
		{ 
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter no. of process :");
			int n = scn.nextInt();
			int[] pid = new int[n];
			int[] bt = new int[n];
			int[] art = new int[n];
			
			for (int i=0;i<n;i++) {
				System.out.println("Enter Process id:");
				pid[i] = scn.nextInt();
				System.out.println("Enter Burst time:");
				bt[i] = scn.nextInt();
				System.out.println("Enter Arrival time:");
				art[i] = scn.nextInt();
				
			}
			
			findavgTime(pid,bt,art, n); 
		} 
	} 



