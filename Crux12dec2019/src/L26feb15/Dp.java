package L26feb15;

public class Dp {

	public static void main(String[] args) {
//				Long n=100L;
//		int n =100;			
//		long[] strg=new long[n+1];
//		System.out.println(fiboTD(n,strg));
//		int end = 10;
//		int[] strg = new int[end + 1];
//		System.out.println(boardpathCOUNT(0, end, strg));
//		System.out.println(boardpathCOuntbuSE(0, 10));
//		System.out.println(mazepath(0, 0, 2, 2));
//		int[][] strg=new int[3][3];
// 		System.out.println(mazepathTD(0, 0, 2, 2,strg));
 		System.out.println(mazepathBUSE(0, 0, 2, 2));

	}

	// Normal recursion
	public static int fibo(int n) {
		int a = 0;
		int b = 1;
		if (n == 0) {
			return 0;
		}
		if (n <= 2) {
			return a + b;
		}
		int res = fibo(n - 1);
		int res1 = fibo(n - 2);

		return res + res1;
	}

	// DP
	// TOP-DOWN APPROACH
	public static long fiboTD(int n, long[] strg) {
		if (n == 1 || n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		long f1 = fiboTD(n - 1, strg);
		long f2 = fiboTD(n - 2, strg);
		strg[n] = f1 + f2;
		return strg[n];

	}

	// BOTTOM-UP APPROACH
	public static int fiboBU(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

	// BOTTOM-UP Space efficient APPROACH
	public static int fiboBUSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 1; i < n; i++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;

		}
		return strg[1];
	}

	// Normal Recursion
	public static void boardpath(int start, int end, String ans) {
		if (start == end) {
			System.out.println(ans);
			return;
		}
		if (start > end) {
			return;
		}
		for (int m = 1; m <= 6; m++) {
			boardpath(start + m, end, ans + m);
		}
	}

	// DP
	// TOP-DOWN APPROACH
	public static int boardpathCOUNT(int start, int end, int[] strg) {
		if (start == end) {

			return 1;
		}
		if (start > end) {
			return 0;
		}
		if (strg[start] != 0) {
			return strg[start];
		}
		int cnt = 0;
		for (int m = 1; m <= 6; m++) {
			cnt += boardpathCOUNT(start + m, end, strg);
		}

		strg[start] = cnt;
		return strg[start];
	}

	// BOTTOM-UP APPROACH
	public static int boardpathCOuntbu(int start, int end) {
		int[] strg = new int[end + 1];
		strg[10] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int k = i;
			while (k <= end && k <= i + 6) {
				strg[i] += strg[k];
				k++;
			}
		}
		return strg[0];
	}

	// BOTTOM-UP Space efficient APPROACH
	public static int boardpathCOuntbuSE(int start, int end) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int i = 1; i <= end; i++) {
			int sum = 0;
			for (int j = 0; j <= 5; j++) {
				sum += strg[j];
			}
			for (int l = strg.length - 1; l >= 1; l--) {
				strg[l] = strg[l - 1];
			}
			strg[0] = sum;
		}

		return strg[0];
	}

	// Normal recursion
	public static int mazepath(int vidr, int vidc, int er, int ec) {
		if (vidr == er && vidc == ec) {
			
			return 1;
		}
		if (vidr > er || vidc > ec) {
			return 0;

		}
		int cnt=0;
		cnt+=mazepath(vidr + 1, vidc, er, er);
		cnt+=mazepath(vidr, vidc + 1, er, er);
		cnt+=mazepath(vidr + 1, vidc + 1, er, er);
		return cnt;
	}
	
	// DP
	//TOP-DOWN APPROACH
	public static int mazepathTD(int vidr, int vidc, int er, int ec,int[][] strg) {
		if (vidr == er && vidc == ec) {
		
			return 1;
		}
		if (vidr > er || vidc > ec) {
			return 0;

		}
		if(strg[vidr][vidc]!=0) {
			return strg[vidr][vidc];
		}
		int cnt=0;
		
		cnt+=mazepathTD(vidr + 1, vidc, er, er, strg);
		cnt+=mazepathTD(vidr, vidc + 1, er, er, strg);
		cnt+=mazepathTD(vidr + 1, vidc + 1, er, er, strg);
		strg[vidr][vidc]=cnt;
		for(int[] a :strg) {
			for(int b: a) {
				System.out.print(b+" ");
			}
		}
		return cnt;
	}
	
	//BOTTOM-UP APPROACH
	public static int mazepathBU(int vidr, int vidc, int er, int ec) {
		int[][] strg=new int[er+2][ec+2];
		
		//Horizontal
		for(int i=er;i>=0;i--) {
			for(int j=ec;j>=0;j--) {
				if(i==er && j==ec) {
					strg[i][j]=1;
					continue ;
				}
				strg[i][j]=strg[i+1][j]+strg[i][j+1]+strg[i+1][j+1];
			}
		}

		return strg[0][0];
		
	}
	
	//BOTTOM-UP SPACE EFFICIENT APPROACH  
	// special care is taken for diagonal paths
	public static int mazepathBUSE(int vidr, int vidc, int er, int ec) {
		int[] strg=new int[ec+2];
		strg[ec]=1;
		//Horizontal
		for(int i=er;i>=0;i--) {
			int dia =0;
			for(int j=ec;j>=0;j--) {
				int temp=strg[j];
				if(i==er && j==ec) {
					strg[j]=1;
					continue ;
				}
				strg[j]+=strg[j+1]+dia;
				dia=temp;
				
				
			}
		}

		return strg[0];
	}
	
}
