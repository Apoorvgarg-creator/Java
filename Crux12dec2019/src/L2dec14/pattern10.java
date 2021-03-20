package L2dec14;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern9
		
		int n=5;
		int nsp=0;
		int nst=n+(n-1);
		int row=1;
		while(row<=n) {
			
			//work
			//space
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp=csp+1;
			}
			
			//stars
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst=cst+1;
			}
			//prep
			System.out.println();
			nst=nst-2;
			nsp=nsp+1;
			row=row+1;
			
		}
	}

}
