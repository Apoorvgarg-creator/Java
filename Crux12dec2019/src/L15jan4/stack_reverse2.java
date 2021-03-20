package L15jan4;

import L14jan3.data_structure_STACK;

public class stack_reverse2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		data_structure_STACK s = new data_structure_STACK();

		s.push(10);
		s.push(20);
		s.push(30);

//		revdisplay(s);

//		System.out.println();
//		s.display();
		data_structure_STACK h = new data_structure_STACK();
		actualrev(s, h);
		System.out.println("_-_-_-_");
		s.display();

	}

	public static void revdisplay(data_structure_STACK s) throws Exception {
		if (s.size() == 0) {
			return;
		}
		int value = s.peek();
		s.pop();
		revdisplay(s);

		System.out.println(value);
		s.push(value);

	}

	public static void actualrev(data_structure_STACK s, data_structure_STACK h) throws Exception {
		if (s.isEmpty()) {
			if (h.isEmpty()) {
				return;
			}
			int val = h.pop();
			actualrev(s, h);
			s.push(val);
			return;

		}
		int value = s.pop();
		h.push(value);
		actualrev(s, h);

	}

}
