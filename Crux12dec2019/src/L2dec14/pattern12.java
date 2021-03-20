package L2dec14;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n) {
			//work
			//space
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp=csp+1;
				
			}
			
			//stars
			
			int cst=1;
			while(cst<=nst) {
				
				if(cst%2==0) {
					System.out.print("! ");
					}
				else
					System.out.print("* ");
				cst++;
			}
			//prep
			
			System.out.println();
			nst=nst+2;
			nsp=nsp-1;
			row=row+1;
			
		}
	}

}
