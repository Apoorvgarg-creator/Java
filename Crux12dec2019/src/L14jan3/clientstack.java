package L14jan3;

public class clientstack {
	public static void main(String[] args) throws Exception {
		data_structure_STACK s = new data_structure_STACK();
		try {
			s.push(10);
			s.push(20);
			s.push(30);

		} catch (Exception e) {
			e.printStackTrace();
		}

		s.pop();
		s.pop();
		s.pop();
		s.pop();

		s.display();
	}

}
