package DIV_2_A;
import java.util.*;
public class Chat_room {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 String word = scn.nextLine();
		 word = word.toLowerCase();
		 String hello = "hello";
		 int count = 0;
		 for( int i=0;i<word.length();i++) {
			 if(count < hello.length() && word.charAt(i) == hello.charAt(count)) {
				 count ++;
				 if (count == hello.length()) {
					 System.out.println("YES");
					 return ;
				 }
			 }
		 }
		 System.out.println("NO");
		 
	}

}
