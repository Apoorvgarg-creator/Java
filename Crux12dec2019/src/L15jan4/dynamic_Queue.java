package L15jan4;

public class dynamic_Queue extends data_structure_queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] na = new int[data.length * 2];
			int i = 0;
			while (i < size) {
				int idx = (front + i) % data.length;
				na[i] = data[idx];
				i++;
			}
			data = na;
			front = 0;
		}
		super.Enqueue(item);
	}

}
