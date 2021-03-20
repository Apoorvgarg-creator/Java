package L2dec14;

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=10;
			int row=1;
			int  nst=1;
			int nsp=n-1;
			int val=n;
			
			while(row<=n) {
				int x=val;
				//work
				//space
				int csp=1;
				while(csp<=nsp) {
					System.out.print("\t");
					csp++;
				}
				//Numbers
				int cst=1;
				while(cst<=nst) {
					if(cst==row)
					System.out.print("0\t");
					else
						{System.out.print(x+"\t");
					x--;
						}
					cst++;
				}
			//prep
				System.out.println();
				nst=nst+2;
				nsp=nsp-1;
				row=row+1;
				val=val-1;
			}
	}

}
