package L10dec26;

public class printapppermutationrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		per("abc", "");

	}

	public static void per(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		for (int i = 0; i <=ans.length(); i++) {
			per(ros, ans.substring(0, i) + ch + ans.substring(i));
		}
	}

}
