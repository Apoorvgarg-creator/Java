package L10dec26;

public class printappmazepathmmrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazepathmm(0, 0, 2, 2, "");;

	}
	public static void mazepathmm(int vidr, int vidc, int er, int ec, String ans) {
		if (vidr == er && vidc == ec) {
			System.out.println(ans);
			return;
		}
		if (vidr > er || vidc > ec) {
			return;

		}
		for(int m=1;m<=er ;m++) {
		mazepathmm(vidr + m, vidc, er, er, ans + "V"+m);}
		for(int m=1;m<=ec ;m++) {
			mazepathmm(vidr, vidc + m, er, er, ans + "H"+m);}
		for(int m=1;m <= er && m <= ec ;m++) {
			mazepathmm(vidr + m, vidc + m, er, er, ans + "D"+m);}
	}


}
