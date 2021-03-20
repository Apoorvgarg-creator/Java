package L10dec26;

public class printappboardpathrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boardpath(0, 3, "");

	}

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

}
