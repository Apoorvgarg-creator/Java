package L14jan3;

// stack - last in first out arrangement
public class data_structure_STACK {
	public int[] data;
	public int top;

	public data_structure_STACK() { // Default constructor
		this(5); // this points to the referencer of class
	}

	public data_structure_STACK(int cap) {
		this.data = new int[cap];
		this.top = -1; // top=-1 always
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("stack is full");
		} else {
			data[++this.top] = item;
		}
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is EMPTY");

		} else {
			int rv = data[top];
			data[top] = 0;
			top--;
			return rv;
		}

	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty");
		}
		return data[top];
	}

	public int size() {

		return top + 1;
	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public boolean isEmpty() {
		return size()==0;
	}
}
