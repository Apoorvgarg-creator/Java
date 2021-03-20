package L25feb11;

import java.util.*;

public class Heap { // MIN HEAP
	private ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	public void upheapify(int ci) {
		int pi = (ci - 1) / 2;

		if (data.get(ci) < data.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	public boolean IsEmpty() {
		return data.size() == 0;
	}

	public int remove() {
		int rv = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size() - 1);

		downheapify(0);
		System.out.println(data);
		return rv;
	}

	public void downheapify(int pi) {
		int lci = (2 * pi + 1);
		int rci = (2 * pi + 2);
		int minindex = pi;
		if (lci < data.size() && data.get(lci) < data.get(minindex)) {
			minindex = lci;
		}
		if (rci < data.size() && data.get(rci) < data.get(minindex)) {
			minindex = rci;
		}
		if (minindex != pi) {
			swap(minindex, pi);
			downheapify(minindex);
		}
	}

	public int getmin() {
		return data.get(0);
	}

	public void display() {
		System.out.println(data);
	}
	
}
