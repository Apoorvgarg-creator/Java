package L6dec22;

public class spiraldisplay {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		c(arr);

	}

	public static void c(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length-1;
		int noe = arr.length * arr[0].length;
		int count = 0;
		while (count < noe) {
			// first row
			for (int r = minrow; r <= maxrow && count < noe; r++) {
				System.out.print(arr[r][mincol] + " ");
				count++;
			}
			mincol++;
			// last column
			for (int c = mincol; c <= maxcol && count < noe; c++) {
				System.out.print(arr[maxrow][c] + " ");
				count++;
			}
			maxrow--;
			// last row
			for (int r = maxrow; r >= minrow && count < noe; r--) {
				System.out.print(arr[r][maxcol] + " ");
				count++;
			}
			maxcol--;
			// first col
			for (int c = maxcol; c >= mincol && count < noe; c--) {
				System.out.print(arr[minrow][c] + " ");
				count++;
			}
			minrow++;
		}
	}
}
