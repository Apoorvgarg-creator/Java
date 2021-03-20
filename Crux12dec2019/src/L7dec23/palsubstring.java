package L7dec23;

public class palsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nitin";
		su(str);

	}

	public static void su(String str) {
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				if (ispal(str.substring(i, j)))
					System.out.println(str.substring(i, j));

			}
			System.out.println();
		}
	}

	public static boolean ispal(String str) {
		int l = str.length() - 1;
//		int count=0;
		for (int i = 0; i < str.length() / 2; i++, l--) {
			if (str.charAt(i) == str.charAt(l)) {
				// count++;
			} else
				return false;
		}
//		if(count==str.length()/2)
		return true;
//		else
//			return false;
	}

}
