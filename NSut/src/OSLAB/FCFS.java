package OSLAB;
import java.util.Scanner; 
public class FCFS {
	
	static void fwt(int processes[], int n, int bt[], int wt[]) { 
		wt[0] = 0; 

		for (int i = 1; i < n; i++) { 
			wt[i] = bt[i - 1] + wt[i - 1]; 
		} 
	} 

	static void findavgTime(int processes[], int n, int bt[]) { 
		int wt[] = new int[n]; 
		int total_wt = 0; 

		fwt(processes, n, bt, wt);  
		System.out.printf("Process  BT      WT \n"); 
 
		for (int i = 0; i < n; i++) { 
			total_wt = total_wt + wt[i];  
			System.out.printf(" %d ", (processes[i])); 
			System.out.printf("	 %d ", bt[i]); 
			System.out.printf("	 %d", wt[i]); 
			System.out.println();
			 
		} 
		float s = (float)total_wt /(float) n; 
		System.out.printf("Average waiting time = %f", s); 
		System.out.printf("\n"); 
	} 

	 
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		System.out.println("No. of processes");
		int n = scn.nextInt();
		
		int pro[] = new int[n];
		int bt[] = new int[n]; 
		for(int i=0;i<n;i++) {
			pro[i] = scn.nextInt();
		}
		System.out.println("Respective burst time");
		
		for(int i=0;i<n;i++) {
			
			bt[i] = scn.nextInt();
		}
		
		

		findavgTime(pro, n, bt); 

	} 
} 
 

