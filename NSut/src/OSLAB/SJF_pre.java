package OSLAB;

import java.util.*;
public class SJF_pre {
	
        
	

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter no of process:");
		int n= sc.nextInt();
		int pid[] = new int[n]; 
		int at[] = new int[n]; 
		int bt[] = new int[n]; 
		int ct[] = new int[n]; 
		int ta[] = new int[n];
		int wt[] = new int[n];  
		int f[] = new int[n];  
		int k[]= new int[n];   
	    int i, st=0, tot=0;
	    float avgwt=0, avgta=0;
 
	    for (i=0;i<n;i++)
	    {
	    	pid[i]= i+1;
	    	System.out.println ("enter process " +(i+1)+ " arrival time:");
	    	at[i]= sc.nextInt();
	    	System.out.println("enter process " +(i+1)+ " burst time:");
	    	bt[i]= sc.nextInt();
	    	k[i]= bt[i];
	    	f[i]= 0;
	    }
	    
	    while(true){
	    	int min=99,c=n;
	    	if (tot==n)
	    		break;
	    	
	    	for ( i=0;i<n;i++)
	    	{
	    		if ((at[i]<=st) && (f[i]==0) && (bt[i]<min))
	    		{	
	    			min=bt[i];
	    			c=i;
	    		}
	    	}
	    	
	    	if (c==n)
	    		st++;
	    	else
	    	{
	    		bt[c]--;
	    		st++;
	    		if (bt[c]==0)
	    		{
	    			ct[c]= st;
	    			f[c]=1;
	    			tot++;
	    		}
	    	}
	    }
	    
	    for(i=0;i<n;i++)
	    {
	    	ta[i] = ct[i] - at[i];
	    	wt[i] = ta[i] - k[i];
	    	avgwt+= wt[i];
	    	
	    }
	    
	    System.out.println("pid  arrival  burst  complete waiting");
	    for(i=0;i<n;i++)
	    {
	    	System.out.println(pid[i] +"\t"+ at[i]+"\t"+ k[i] +"\t"+ ct[i] +"\t"+ wt[i]);
	    }
	    
	    System.out.println("average wt is "+ (float)(avgwt/n));
	    sc.close();
	    
	    // Sort arrival time
        for (int kk = 0; kk < n-1; kk++) {
            for (int j = 0; j < n-kk-1; j++) {
                if (wt[j] > wt[j+1]) 
                { 
                    
                    int temp = at[j]; 
                    at[j] = at[j+1]; 
                    at[j+1] = temp; 
                    
                    int temp_1 = pid[j]; 
                    pid[j] = pid[j+1]; 
                    pid[j+1] = temp; 
                    
                    int temp_2 = k[j]; 
                    k[j] = k[j+1]; 
                    k[j+1] = temp_2;
                    
                    int temp_3 = ct[j]; 
                    ct[j] = ct[j+1]; 
                    ct[j+1] = temp_3;
                    
                    int temp_4 = wt[j]; 
                    wt[j] = wt[j+1]; 
                    wt[j+1] = temp_4; 
                }}
            
        }
        System.out.println("pid  arrival  burst  complete waiting");
	    for(i=0;i<n;i++)
	    {
	    	System.out.println(pid[i] +"\t"+ at[i]+"\t"+ k[i] +"\t"+ ct[i] +"\t"+ wt[i]);
	    }
	    sc.close();

	}
}