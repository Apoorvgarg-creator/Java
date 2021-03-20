package practice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText {
	public static void main(String[] args) {
		Pattern myPattern = Pattern.compile("[a-z&&[^c-e]]at");
		Matcher myMatcher = myPattern.matcher("cat");
		boolean myBoolean = myMatcher.matches();
		System.out.println(myBoolean);
	}
}
