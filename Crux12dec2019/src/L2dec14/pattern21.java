package L2dec14;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = 2 * n - 3;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			// work
			// space
			int cst1 = 1;
			while (cst1 <= nst) {
				System.out.print("* ");
				cst1++;

			}
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// stars
			int cst2 = 1;
			while (cst2 <= nst) {
				if(cst2==n) {
					break;
				}
				System.out.print("* ");
				cst2++;
			}
			// prep
			System.out.println();
			nsp = nsp - 2;
			nst = nst + 1;
			row = row + 1;

		}
	}

}
