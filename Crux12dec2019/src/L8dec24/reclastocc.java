package L8dec24;

public class reclastocc {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4, 2, 2, 1 };
		System.out.println(ll(arr, 2, 0));

	}

	public static int ll(int[] arr, int item, int vidx) {
		if (vidx == arr.length) {
			return -1;
		}

		int r = ll(arr, item, vidx + 1);
		if (arr[vidx] == item) {
			return Math.max(r, vidx);
		}

		return r;

	}
}
