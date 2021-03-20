package L19jan18;

import java.util.Scanner;

import L20jan19.Genric_tree;

public class genrictreeclient {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// String str="100 3 20 1 50 0 30 1 600 0 40 3 70 3 1 0 2 0 3 0 80 0 90 0";
//		String str = "1000 2 20 2 50 0 60 0 110 2 700 0 600 3 12 0 1300 0 14 0";
		String str="1 2 2 2	3 0	4 0 5 2 6 0 7 0";
		Genric_Tree gt = new Genric_Tree(str);
		gt.display();
//		System.out.println("------------");
//		gt.levelorderlinewise2();
//		System.out.println("------------");
//		gt.levelorderzigzag();
//		gt.mirror();
//		int item = scn.nextInt();
//		gt.finditem(item);
		gt.sumatlevel(2);
	}

}
