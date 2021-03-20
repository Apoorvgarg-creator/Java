package L6dec22;

public class matrixmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{1,2,3},
				{1,2,3}
				
		};
		int[][] b= {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
				
		};
		mul(a,b);

	}
	public static void mul(int[][] a ,int[][] b) {
		if(a[0].length==b.length) {
			int[][] res=new int[a.length][b[0].length];
			
			for(int i=0;i<a.length;i++) {
				
				for(int j=0;j<b[0].length;j++) {
					for(int k=0;k<a[0].length;k++) {
					res[i][j]+=a[i][k]*b[k][j];}
				}
			}
			for(int[] val:res) {
				for(int val1: val) {
					System.out.print(val1+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("not pos");
	}

}
