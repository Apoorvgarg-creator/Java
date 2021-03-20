package L11dec27;

public class backtracking_coinchangepermutation_ {

	public static void main(String[] args) {
		int[] coins = { 2, 3, 5 };
		coinchangeprmt(coins, 0, 10, "");
		// TODO Auto-generated method stub

	}

	public static void coinchangeprmt(int[] coins, int sum, int amount, String ans) {
		if (sum == amount) {
			System.out.println(ans);
			return;
		}
		if (sum > amount) {
			return;
		}

		for (int i = 0; i < coins.length; i++) {
			coinchangeprmt(coins, sum + coins[i], amount, ans + coins[i]);

		}
		

	}

}
