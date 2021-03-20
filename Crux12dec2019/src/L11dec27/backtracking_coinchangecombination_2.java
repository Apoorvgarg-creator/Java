package L11dec27;

public class backtracking_coinchangecombination_2 {

	public static void main(String[] args) {
		int[] coins = { 2, 3, 5 };
		coinchangecomb(coins, 0, 0, 10, "");
		// TODO Auto-generated method stub

	}

	public static void coinchangecomb(int[] coins, int sum, int lastindex, int amount, String ans) {
		if (sum == amount) {
			System.out.println(ans);
			return;
		}
		if (sum > amount) {
			return;
		}

		for (int i = lastindex; i < coins.length; i++) {

			coinchangecomb(coins, sum + coins[i], i, amount, ans + coins[i]);

		}
		
	}

}
