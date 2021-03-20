package L28feb22;

public class Dp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Matrix chain Multiplication
		// NORMAL RECURSION
		public static int mcm(int[] mat, int si, int ei) {

			if (ei - si == 1) {
				return 0;
			}
			int min = Integer.MAX_VALUE;

			for (int k = si + 1; k <= ei - 1; k++) {
				int fh = mcm(mat, si, k);
				int sh = mcm(mat, k, ei);

				int sw = mat[si] * mat[k] * mat[ei];
				int total = fh + sh + sw;
				min = Math.min(total, min);
			}
			return min;
		}

		// DP
		// Top-Down Approach
		public static int mcmTD(int[] mat, int si, int ei, int[][] strg) {
			if (ei - si == 1) {
				return 0;
			}
			if (strg[si][ei] != 0) {
				return strg[si][ei];
			}
			int min = Integer.MAX_VALUE;

			for (int k = si + 1; k <= ei - 1; k++) {
				int fh = mcmTD(mat, si, k, strg);
				int sh = mcmTD(mat, k, ei, strg);

				int sw = mat[si] * mat[k] * mat[ei];
				int total = fh + sh + sw;
				min = Math.min(total, min);
			}
			return strg[si][ei] = min;
		}

		// Bottom -Up approach
		public static int mcmBU(int[] mat) {
			int[][] strg = new int[mat.length][mat.length];

			for (int slide = 1; slide <= mat.length - 1; slide++) {
				for (int si = 0; si <= mat.length - slide - 1; si++) {
					int ei = slide + si;
					if (ei - si == 1) {
						strg[si][ei] = 0;
						continue;
					}
					int min = Integer.MAX_VALUE;
					for (int k = si + 1; k <= ei - 1; k++) {
						int fh = strg[si][k];
						int sh = strg[k][ei];
						int sw = mat[si] * mat[k] * mat[ei];
						int total = fh + sh + sw;
						min = Math.min(total, min);
					}
					strg[si][ei] = min;

				}
			}
			for (int[] st : strg) {
				for (int x : st) {
					System.out.print(x + "\t");
				}
				System.out.println();
			}
			return strg[0][mat.length - 1];
		}

		// Bottom-up space efficient is not possible because every value is required to
		// calculate the main result
		
		//Knapsack
		// Normal recursion
		public static int Knapsack(int[] weight, int[] price, int cwt, int idx, int cap) {
			if (idx == weight.length) {
				return 0;
			}
			
			int profit = 0;
			int wi=0;
			if(cwt+weight[idx]<=cap) {
			wi = Knapsack(weight, price, cwt + weight[idx], idx + 1, cap) + price[idx];
			}
			int woi = Knapsack(weight, price, cwt, idx +1, cap);

			profit = Math.max(wi, woi);

			return profit;
		}
		//Top-down Approach 
		public static int KnapsackTD(int[] weight, int[] price, int cwt, int idx, int cap,int[][] strg) {
			if (idx == weight.length) {
				return 0;
			}
			if(strg[idx][cwt]!=0) {
				return strg[idx][cwt];
			}
			int profit = 0;
			int wi=0;
			if(cwt+weight[idx]<=cap) {
			wi = KnapsackTD(weight, price, cwt + weight[idx], idx + 1, cap,strg) + price[idx];
			}
			int woi = KnapsackTD(weight, price, cwt, idx +1, cap,strg);

			profit = Math.max(wi, woi);

			return strg[idx][cwt]=profit;
		}


}
