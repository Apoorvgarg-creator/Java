package L15jan4;

public class client_dynamicstack {
		public static void main(String[] args) throws Exception {
			Dynamic_stack_inheritance s =new Dynamic_stack_inheritance();
			try {
				s.push(10);
				s.push(20);
				s.push(30);
				s.push(40);
				s.push(50);
				s.push(60);
				s.push(70);
				s.push(80);
				s.push(90);
				s.push(100);
				s.push(110);
				s.push(120);

			} catch (Exception e) {
				e.printStackTrace();
			}

			s.pop();
			s.pop();
			
			s.display();
		}

	}
