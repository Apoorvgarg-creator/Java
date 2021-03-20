package L8dec24;

public class recursionfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(0));

	}

	public static int fibo(int n) {
		int a = 0;
		int b = 1;
		if(n==0) {
			return 0;
		}
		if (n <= 2) {
			return a + b;
		}
		int res = fibo(n - 1);
		int res1 = fibo(n - 2);

		return res + res1;
	}
}
