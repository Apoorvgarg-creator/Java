package L2dec14;

public class pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			int row=1;
			int nst=1;
			int val=1;
			while(row<=(2*n-1)) {
				//prep
				val=row;
				//work
				int cst=1;
				while(cst<=nst) {
					if(cst%2==0) {
					System.out.print("*");
					}
					else
						System.out.print(val);
					cst++;
				}
				
				//prep
				System.out.println();
				if(row<=n-1) {
				nst=nst+2;}
				else {
					nst=nst-2;}
				
				
				row=row+1;
				
			}
					
	}

}
