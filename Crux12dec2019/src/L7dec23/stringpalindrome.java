package L7dec23;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123431";
		System.out.println(ispal(str));

	}
	public static boolean ispal(String str) {
		int l=str.length()-1;
//		int count=0;
		for(int i=0;i<str.length()/2;i++,l--) {
			if(str.charAt(i)==str.charAt(l)) {
				//count++;
			}
			else
				return false;
		}
//		if(count==str.length()/2)
		return true;
//		else
//			return false;
	}

}
