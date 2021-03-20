package HashMap;
import java.util.*;
import java.lang.*;
import java.io.*;
public class divya {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn =new Scanner(System.in);
		int n;
		n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
		    a[i]=scn.nextInt();}
		
		for(int i=0;i<n;i++) {
		    System.out.println(a[i]);
		    }
		
		int q;
		q=scn.nextInt();
		System.out.println(q);
		HashMap<Integer,Integer> query=new HashMap<Integer,Integer>();
		for(int j=0;j<q;j++)
		{
		    int x=scn.nextInt();
		    int y=scn.nextInt();
		    query.put(x,y);
		}
		System.out.println(query);
//		for(Integer key : query.keySet())
//		{
//		    int val=query.get(key);
//		    System.out.println(key+" "+val);
//		}
//		int e=0;
//		for(int i=0;i<n;i++)
//		{
//		    if(query.containsKey(a[i]))
//		    {
//		        int l=(2*i)+1;
//		        int r=(2*i)+2;
//		        int k=0;
//		        if(l<n)
//		            k++;
//		        if(r<n)
//		            k++;
//		            Integer val=query.get(a[i]);
//		        if(k>0)
//		        {
//		            if(val%k==0)
//		            {
//		                int d=val/k;
//		                if(query.containsKey(a[l]))
//		                {
//		                    Integer val1=query.get(a[l]);
//		                    val1=val1+d;
//		                    query.put(a[l],val1);
//		                }      
//		                else
//		                    query.put(a[l],d);
//		      
//		                 if(query.containsKey(a[r]))
//		                {
//		                    Integer val2=query.get(a[r]);
//		                    val2=val2+d;
//		                    query.put(a[r],val2);
//		                }      
//		                else
//		                    query.put(a[r],d);
//		            }
//		            else
//		            {
//		                e+=val;
//		            }
//		        }
//		    }
//		}
//	
//	    System.out.print(e);
	}
}