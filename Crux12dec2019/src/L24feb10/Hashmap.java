package L24feb10;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();

		// Put
		map.put("Mac", 3);
		map.put("Windows", 2);
		map.put("Linux", 16);
		map.put("Linux", 1);

		// Get
		System.out.println(map.get("Linux"));

		// Remove
		System.out.println(map.remove("Linux"));

		// ContainsKey
		System.out.println(map.containsKey("Linux"));

		// set
		map.put("Windows", 5);

		System.out.println(map);

		// Set
		Set<Integer> s = new HashSet<>();

		// KeySet
		Set<String> keyset = map.keySet();

		// Set -> ArrayList
		ArrayList<String> keyset2 = new ArrayList<>(keyset);

		for (String key : keyset2) {

			System.out.println(key + " : " + map.get(key));

		}

		s.add(1);
		s.add(2);
		s.add(3);
		s.add(1);

		System.out.println(s);
//		System.out.println(maxfreqchar("aaaaabdbfshjafhfjaaaaa"));
//		int[] arr = { 1, 2, 3, 7, 8, 9, 15, 16, 17, 18, 19 };
//		mcis(arr);
		int[] one = { 12, 10, 2, 6, 10, 15, 10, 10 ,10};
		int[] two = { 10, 1, 2, 5, 15, 10 , 10 };
		intersection(one, two);

	}

	public static char maxfreqchar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
//				if(map.containsKey(ch) {
//					map.put(ch,map.get(ch)+1);
//				}else {
//					map.put(ch,1);
//				}
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int max = 0;
		char res = '@';
		for (char key : map.keySet()) {
			if (map.get(key) >= max) {
				max = map.get(key);
				res = key;
			}
		}

		return res;
	}

	// maximum continuous increasing sequence
	public static void mcis(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int val : arr) {
			if (map.containsKey(val - 1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}
			if (map.containsKey(val + 1)) {
				map.put(val + 1, false);
			}
		}
		int max = 0;
		int start = 0;
		for (int key : map.keySet()) {
			if (map.get(key)) {
				int count = 1;
				while (map.containsKey(key + count)) {
					count++;
				}
				if (max < count) {
					max = count;
					start = key;
				}

			}
		}

		for (int i = start; i < start + max; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void Intersection(int[] one, int[] two) {		
		//intersection when numbers are not repeated 
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int val : one) {
			map.put(val, false);
		}

		for (int val : two) {
			if (map.containsKey(val)) {
				map.put(val, true);
			}
			
		}
		for (int key : map.keySet()) {
			if (map.get(key)) {
				System.out.print(key + " ");
			}
		}
		
	}
	public static void intersection(int[] one,int[] two) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int val : one) {
			map.put(val,map.getOrDefault(val,0)+1);
		}
		ArrayList<Integer> res=new ArrayList<>();
		for(int val : two) {
			if(map.containsKey(val) && map.get(val)>0) {
				map.put(val,map.get(val)-1);
				res.add(val);
			}
		}
		System.out.println(res);
	}

}
