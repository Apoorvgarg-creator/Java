package L10dec26;

public class printappcointossrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cointoss(3, ""));

	}

	public static int cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int cnt = 0;
		cnt += cointoss(n - 1, ans + "H");
		cnt += cointoss(n - 1, ans + "T");
		return cnt;
	}

}
