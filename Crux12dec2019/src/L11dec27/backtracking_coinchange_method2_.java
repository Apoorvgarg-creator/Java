package L11dec27;

public class backtracking_coinchange_method2_ {

	public static void main(String[] args) {
		int[] coins = { 2, 3, 5 };
		coinch(coins, 0, 0, 10, "");

	}

	public static void coinch(int[] coins, int vidx, int amount, int target, String ans) {
		if (amount == target) {
			System.out.println(ans);
			return;
		}
		if(amount>target) {
			return ;
		}
		if (vidx == coins.length) {
			return;
		}
		
		
		// placed
		coinch(coins, vidx, amount + coins[vidx], target, ans + coins[vidx]);
		// Not placed
		coinch(coins, vidx + 1, amount, target, ans);
	}
}
