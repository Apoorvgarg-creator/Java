package a;
import java.util.*;

public class prim {

	public static void main(String[] args) {
		  // Your Code Here
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        int x=2;
        while(x<N){
            int flag=0;
            int count=2;
            while(count<x){
                if(x%count==0)
                    flag=flag+1;
            count=count+1;
            }
                if(flag==0)
                System.out.println(x);

            x=x+1;
        }
	}

}
