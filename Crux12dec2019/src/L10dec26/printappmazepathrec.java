package L10dec26;

public class printappmazepathrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazepath(0, 0, 2, 2, "");

	}

	public static void mazepath(int vidr, int vidc, int er, int ec, String ans) {
		if (vidr == er && vidc == ec) {
			System.out.println(ans);
			return;
		}
		if (vidr > er || vidc > ec) {
			return;

		}
		mazepath(vidr + 1, vidc, er, ec, ans + "V");
		mazepath(vidr, vidc + 1, er, ec, ans + "H");
		mazepath(vidr + 1, vidc + 1, er, ec, ans + "D");
	}

}
