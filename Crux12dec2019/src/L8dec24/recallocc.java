package L8dec24;

public class recallocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 4, 2, 2, 1 };
		System.out.println(allocc(arr, 2, 0, 0));

	}

	public static int[] allocc(int[] arr, int item, int vidx, int cnt) {
		if (vidx == arr.length) {
			int[] brr = new int[cnt];
			return brr;
		}
		if (arr[vidx] != item) {
			return allocc(arr, item, vidx + 1, cnt);
		} else {
			int[] rr = allocc(arr, item, vidx + 1, cnt + 1);
			rr[cnt] = vidx;
			return rr;
		}
	}

}
