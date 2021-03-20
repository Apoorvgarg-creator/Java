package L8dec24;
import java.util.*;
public class recq {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		rec(n);

	}
	
	public static void rrrr(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("-");
		}
	}

	public static void rec(int n) {
		if (n == 0) {
			return;
		}
		String s="";
		for (int i = 0; i < n; i++) {
			s=s+"-";
		}
		
		rec(n - 1);
		System.out.println(s);
		rec(n - 1);
	}

}
