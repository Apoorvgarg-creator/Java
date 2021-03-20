package a;

import java.util.Scanner;

public class pascaltri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int row=1;
		int r=0;
		int nsp=N-1;
		int nst=1;
		int val=1;
		while(row<=N){
			//work
			//space
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			//pascal
		
			int cst=0;
			while(cst<nst){
				int k=fact(r);
				int p=fact(r-cst);
				int x=fact(cst);
				val=k/(p*x);
				System.out.print(val+" ");
				cst++;
			}
			//prep
			System.out.println();
			nst=nst+1;
			row++;
			nsp--;
			r++;
			

		}

    }
	public static int fact(int x){
		int r;
		if(x==1 || x==0)
		return 1;
		else
		r=x*fact(x-1);

		return r;
	}

	}


