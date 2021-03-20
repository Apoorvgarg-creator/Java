package L8dec24;

public class recursionpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 3));

	}

	public static double power(int a, int b) {
		if (b == 1) {
			return a;
		}

		double res = power(a, b - 1);

		return res * a;
	}

}
