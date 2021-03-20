package L2dec14;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			int nst=n;  		//No. of stars
			int nsp=0;			//no. of spaces
			int row=1;
			while(row<=n) {
				
				//work
				
				//space
				int csp=1;
				while(csp<=nsp) {////// THIS LOOP RUNS NSP TIMES
					System.out.print("  ");
					csp++;
				}
				int cst=1;
				while(cst<=nst) {/////THIS LOOP RUNS NST TIMES
					
					System.out.print("* ");
					cst++;
					
				}
				
				//prep
				System.out.println();
				nst=nst-1;
				nsp=nsp+2;
				row=row+1;
					
			}
	}

}
