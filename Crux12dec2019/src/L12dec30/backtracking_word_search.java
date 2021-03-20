package L12dec30;

import java.util.Scanner;

public class backtracking_word_search {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		String word=scn.next();
		boolean r=false;
		char[][] ques = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		boolean[][] visited = new boolean[ques.length][ques[0].length];
		for(int i=0;i<ques.length;i++) {
			for(int j=0;j<ques[0].length;j++) {
				if(word.charAt(0)==ques[i][j])
			
		if(wordsearch(ques, i, j, word, visited)) {
			r=r|| wordsearch(ques, i, j, word, visited);
}
			}
		}
		System.out.println(r);
		
	}

	public static boolean wordsearch(char[][] ques, int cr, int cc, String word, boolean[][] visited) {
		
		
		if (word.length()==0) {

			return true;
		}
		if (cr >= ques.length || cc >= ques[0].length || cr < 0 || cc < 0 ||visited[cr][cc]) {
			return false;
		}
		if(word.charAt(0)!=ques[cr][cc]) {
			return false;
		}

		visited[cr][cc] = true;
		String ros = word.substring(1);
		// Horizontal move - right
		boolean right =wordsearch(ques, cr, cc + 1, ros, visited);
			
		// Horizontal move - left

		boolean left=wordsearch(ques, cr, cc - 1, ros, visited);
		
		// Vertical move - up
		boolean up=wordsearch(ques, cr - 1, cc, ros, visited);
		
		// Horizontal move - down
		boolean down=wordsearch(ques, cr + 1, cc, ros, visited);
		
		visited[cr][cc] = false;

		return right||left||up||down;

	}

}
