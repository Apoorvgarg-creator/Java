package L2dec14;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=10;
			int x=n;
			int row=1;
			int nst=1;
			int val=1;
			while(row<=(2*n-1)) {
				//prep
				
				
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
				
					if(val<x)
						val=val+1;
					else {
						val=val-1;
				x--;}
				
				row=row+1;
				
			}
					
	}

}
/* 2nd method
 * int val;
 * if(row<=n)
 * val=row;
 * else
 * val=total-row (jugad) then =2*n-row
 */
 /*
  * if(row<=n-1)
  * nst=nst+2;
  * val=val+1;
  * else
  * nst=nst-2
  * val=val-1;
*/