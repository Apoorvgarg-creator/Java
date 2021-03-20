package L7dec23;

import java.util.ArrayList;

public class intersectionarray {

	public static void main(String[] args) {
		//Given arrays must be sorted 
		//When arrays are given as sorted think of ways to use the given properties
		
		int[] one = { 5, 5, 10, 15, 25 };
		int[] two = { 5, 12, 15, 16, 19, 25 };
		// TODO Auto-generated method stub
		System.out.println(intersection(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> inte = new ArrayList<>();
		int i = 0;// pointer to point array one
		int j = 0;// pointer to point array two
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;

			} else {
				inte.add(one[i]);
				i++;
				j++;
			}
		}

		return inte;
	}
}
