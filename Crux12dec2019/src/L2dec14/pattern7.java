package L2dec14;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern7
/*		   * * * * *
		   *       * 
		   *       *	
		   *       *
		   * * * * * 
		 
		 
		 
		 */
		
		int n=5;
		int row=1;
		while(row<=n) {
			
			//work
			int col=1;
			while(col<=n) {
				if(row==1 ||row==n||col==1|| col==n) {
					System.out.print("*");}
					else
						System.out.print(" ");
				col=col+1;
				
				}
				//prep
			System.out.println();
			row=row+1;
			}
		}
	}


