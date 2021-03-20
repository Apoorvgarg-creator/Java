package a;
import java.util.*;
public class apr {
	public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nst=1;
        int nsp=n-1;
        int val=1;
        int r=0;
        while(row<=(2*n-1)){
            //work
            val=r;
            //space
            int csp=1;
            while(csp<=nsp){
                System.out.print("\t");
                csp++;
            }
            //star 
            int cst=1;
            while(cst<=nst){
                if(cst<=(nst+1)/2){val++;
                System.out.print(val+"\t");
                ;}
                else{ val--;
                    System.out.print(val+"\t");
                }
                cst++;
            }
            //prep
            System.out.println();
            if(row<n){
                nst=nst+2;
                nsp--;
                r++;
            }
            else
            {
                nsp++;
                r--;
                nst=nst-2;
            }
            row++;
        }

    }
}


