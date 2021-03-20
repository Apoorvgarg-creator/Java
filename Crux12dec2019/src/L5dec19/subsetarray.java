package L5dec19;

public class subsetarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		subset(arr);

	}

	public static void subset(int[] arr) {
		int limit = (int) Math.pow(2, arr.length);
		for (int i = 0; i < limit; i++) {
			int temp = i;
			for (int j = 0; j < arr.length; j++) {
				int rem = temp % 2;
				if (rem == 0) {
					System.out.print(arr[j]);
				} else {
					System.out.print("0");
				}

				temp /= 2;
			}
			System.out.println();

		}

	}
}