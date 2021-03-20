package grph;
import java.util.ArrayList;
import java.util.HashMap;

public class Genric_Heap<T extends Comparable<T>> { // MIN HEAP
	private ArrayList<T> data = new ArrayList<T>();
	HashMap<T,Integer> map=new HashMap<>();
	public void add(T item) {
		data.add(item);
		map.put(item, data.size()-1);
		upheapify(data.size() - 1);
	}

	public void upheapify(int ci) {
		int pi = (ci - 1) / 2;

		if (data.get(ci).compareTo(data.get(pi)) > 0) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
		map.put(ith,j);
		map.put(jth, i);
	}

	public boolean IsEmpty() {
		return data.size() == 0;
	}

	public T remove() {
		T rv = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size() - 1);

		downheapify(0);
		map.remove(rv);
//		System.out.println(data);
		return rv;
	}

	public void downheapify(int pi) {
		int lci = (2 * pi + 1);
		int rci = (2 * pi + 2);
		int minindex = pi;
		if (lci < data.size() && data.get(lci).compareTo(data.get(minindex)) > 0) {
			minindex = lci;
		}
		if (rci < data.size() && data.get(rci).compareTo(data.get(minindex)) > 0) {
			minindex = rci;
		}
		if (minindex != pi) {
			swap(minindex, pi);
			downheapify(minindex);
		}
	}

	public T getmin() {
		return data.get(0);
	}

	public void display() {
		System.out.println(data);
	}
	public void updatepriorty(T pair) {
		int index=map.get(pair);
		upheapify(index);
		
	}
	
}