package L8dec24;

public class recfirstocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 3, 4, 4, 1, 1, 1 };
		System.out.println(ll(arr, 2, 0));

	}

	public static int ll(int[] arr, int item, int vidx) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == item) {
			return vidx;
		}

		int r = ll(arr, item, vidx + 1);

		return r;

	}
}
