package L6dec22;

public class searchin1loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int x=search(arr, 100);
		if(x==0) {
			System.out.println("Not found");
		}

	}

	public static int search(int[][] arr, int item) {
		int row = 0;
		int col = arr[0].length - 1;
		int flag=0;

		while (col >= 0 && row < arr.length) {
			if (arr[row][col] > item) {
				col--;
			} else if (arr[row][col] < item) {
				row++;

			} else {
				System.out.println(row + "-" + (col));
				flag++;
				break;
			}

		}

		return flag;
	}
}
