package L2dec14;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			int nst=1;
			int nsp=n-1;
			int row=1;
			while(row<=2*n-1) {
				//work
				//space
				int csp=1;
				while(csp<=nsp) {
					System.out.print("  ");
					csp++;
					
				}
				//stars
				int cst=1;
				while(cst<=nst) {
					System.out.print("* ");
					cst++;
				}
				//prep
				System.out.println();
				
				if(row<=n-1) {
					nst=nst+1;
					nsp=nsp-1;
				}
				else
				{
					nst=nst-1;
					nsp=nsp+1;
				}
			
				row=row+1;
			}
	}

}
