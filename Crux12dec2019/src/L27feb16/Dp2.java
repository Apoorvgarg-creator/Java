package L27feb16;

import java.util.*;

public class Dp2 {

	public static void main(String[] args) {
//		String s1 = "sundaasdsddadsy", s2 = "saturdsaddfdday";
////		
//		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
//		for(int[] st : strg) {
//			Arrays.fill(st,-1);
//		}
//		System.out.println(lcsTD(s1,s2,strg));
//		System.out.println(lcsBU(s1, s2));
//		System.out.println(minop(s1,s2));
//		System.out.println(minopTD(s1, s2, strg));
//		System.out.println(minopBU(s1, s2));

//		System.out.println(minopTD(s1,s2,strg));
//		int[][] strg = new int[5][5];

//		System.out.println(winepro(new int[] { 2,3,5,1,4},0,4,1));
//		System.out.println(mcmTD(new int[] { 2, 3, 4, 1, 5 }, 0, 4, strg));
//		System.out.println(mcmBU(new int[] { 2, 3, 4, 1, 5 }));
		int[] w = { 10,20,30};
		int[] p = {60,100,120};
		
	}

	// Normal Recursion
	public static int lcs(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;

		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int res = 0;
		if (ch1 == ch2) {
			res = lcs(ros1, ros2) + 1;

		} else {
			int f1 = lcs(s1, ros2);
			int f2 = lcs(ros1, s2);

			res = Math.max(f1, f2);
		}

		return res;

	}

	// DP
	// TOP-DOWN APPROACH
	public static int lcsTD(String s1, String s2, int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int res = 0;
		if (ch1 == ch2) {
			res = lcsTD(ros1, ros2, strg) + 1;

		} else {
			int f1 = lcsTD(s1, ros2, strg);
			int f2 = lcsTD(ros1, s2, strg);

			res = Math.max(f1, f2);
		}
		strg[s1.length()][s2.length()] = res;

		return res;

	}

	// BOTTOM-UP APPROACH
	public static int lcsBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 2][s2.length() + 2];

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {

				char ch1 = s1.charAt(s1.length() - i);
				char ch2 = s2.charAt(s2.length() - j);
				if (ch1 == ch2) {
					strg[i][j] = strg[i - 1][j - 1] + 1;

				} else {
					strg[i][j] = Math.max(strg[i - 1][j], strg[i][j - 1]);
				}

			}
		}

		return strg[s1.length()][s2.length()];

	}

	// BOTTOM-UP space efficient Approach
	public static int lcsBUSE(String s1, String s2) {
		int count = 0;
		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				count++;
				i++;
				j++;
			} else {
				if (j > i) {
					i++;
				} else {
					j++;
				}
			}

		}
		return count;

	}

	// Normal recursion
	public static int minop(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int res;
		if (ch1 == ch2) {
			res = minop(ros1, ros2);
		} else {
			int in = minop(ch2 + s1, s2) + 1;
			int re = minop(ros1, s2) + 1;
			int repla = minop(ch2 + ros1, s2) + 1;

			res = Math.min(Math.min(re, in), repla);
		}
		return res;
	}

	// More efficient Method --Coding blocks
	public static int minop2(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());

		}
		if (s1.compareTo(s2) == 0) {
			return 0;

		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int res;
		if (ch1 == ch2) {
			res = minop2(ros1, ros2);
		} else {
			int insert = minop2(s1, ros2);
			int remove = minop2(ros1, s2);
			int replace = minop2(ros1, ros2);
			res = Math.min(Math.min(replace, insert), remove) + 1;
		}
		return res;
	}

	// DP
	// TOP-DOWN APPROACH
	public static int minopTD(String s1, String s2, int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());

		}
		if (strg[s1.length()][s2.length()] != 0) {
			return strg[s1.length()][s2.length()];
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int res = 0;
		if (ch1 == ch2) {
			res = minopTD(ros1, ros2, strg);
		} else {
			int in = minopTD(ch2 + s1, s2, strg) + 1;
			int re = minopTD(ros1, s2, strg) + 1;
			int repla = minopTD(ch2 + ros1, s2, strg) + 1;

			res = Math.min(Math.min(re, in), repla);
		}
		strg[s1.length()][s2.length()] = res;
		return res;
	}

	// BOTTOM-UP APPROACH
	public static int minopBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 || j == 0) {
					strg[i][j] = Math.max(i, j);
					continue;
				}
				char ch1 = s1.charAt(s1.length() - i);
				char ch2 = s2.charAt(s2.length() - j);
				if (ch1 == ch2) {
					strg[i][j] = strg[i - 1][j - 1];
				} else {
					strg[i][j] = Math.min(Math.min(strg[i - 1][j], strg[i - 1][j - 1]), strg[i][j - 1]) + 1;

				}

			}
		}
//
//		for (int[] st : strg) {
//			for (int s : st) {
//				System.out.print(s + " ");
//			}
//			System.out.println();
//		}

		return strg[s1.length()][s2.length()];

	}

	// Normal Recursion
	// year not needed to pass as a parameter
	public static int winepro(int[] arr, int idx, int lastidx, int year) {
		if (idx == lastidx) {
			return arr[idx] * year;
		}
		int fp = winepro(arr, idx + 1, lastidx, year + 1) + arr[idx] * year;
		int lp = winepro(arr, idx, lastidx - 1, year + 1) + arr[lastidx] * year;

		return Math.max(fp, lp);

	}

	// method -2
	public static int winepro(int[] arr, int idx, int lastidx) {
		int year = arr.length - lastidx + idx;
		if (idx == lastidx) {
			return arr[idx] * year;
		}
		int fp = winepro(arr, idx + 1, lastidx, year + 1) + arr[idx] * year;
		int lp = winepro(arr, idx, lastidx - 1, year + 1) + arr[lastidx] * year;

		return Math.max(fp, lp);

	}

	// DP
	// Top-DOWN Approach
	public static int wineproTD(int[] arr, int idx, int lastidx, int[][] strg) {
		int year = arr.length - lastidx + idx;
		if (idx == lastidx) {
			return arr[idx] * year;
		}
		if (strg[idx][lastidx] != 0) {
			return strg[idx][lastidx];
		}
		int fp = wineproTD(arr, idx + 1, lastidx, strg) + arr[idx] * year;
		int lp = wineproTD(arr, idx, lastidx - 1, strg) + arr[lastidx] * year;

		return strg[idx][lastidx] = Math.max(fp, lp);

	}

	// BOTTOM-UP APPROACH
	public static int wineproBU(int[] arr) {
		int[][] strg = new int[arr.length][arr.length];
		for (int slide = 0; slide <= arr.length - 1; slide++) {
			for (int idx = 0; idx <= arr.length - slide - 1; idx++) {
				int lastidx = idx + slide;
				int yr = arr.length - lastidx + idx;
				if (idx == lastidx) {
					strg[idx][lastidx] = arr[idx] * yr;
					continue;
				}
				int fh = strg[idx + 1][lastidx] + arr[idx] * yr;
				int sh = strg[idx][lastidx - 1] + arr[lastidx] * yr;
				strg[idx][lastidx] = Math.max(fh, sh);
			}
		}

		return strg[0][arr.length - 1];
	}

//	//BOTTOM UP SPACE EFFICIENT APPROACH-HW
//	public static int wineproBUSE(int[] arr) {
//		int[] strg=new int[arr.length];
//		for(int slide=0;slide<=arr.length-1;slide++) {
//			for(int idx=0;idx<=arr.length-slide-1;idx++) {
//				int lastidx=idx+slide;
//				int yr=arr.length-lastidx+idx;
//				if(slide==0) {
//					strg[idx]=arr[idx]*yr;
//					continue ;
//				}
//				int fh=strg[idx+1]+arr[idx]*yr;
//				int sh=strg[idx]+arr[lastidx]*yr;
//				strg[idx]=Math.max(fh, sh);
//			}
//		}
//		
//		return strg[0];
//	}
//	
	
}
