package L7dec23;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nitin";
		su(str);

	}
	public static void su(String str) {
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
			System.out.println();
		}
	}
}
