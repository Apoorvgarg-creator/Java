package HashMap;

import java.util.LinkedList;

public class HashTable<K,V> {
	class HTpair{			//Generic
		K key;
		V value;
		HTpair(K key, V value){
			this.key=key;
			this.value=value;
		}
		@Override
		public boolean equals(Object other) {			// Two HTpair will now be compared on the basis of their key
														//because Hash map have unique keys
			HTpair op=(HTpair) other;
			return this.key.equals(op.key);
		}
	}
	
	private LinkedList<HTpair>[] bucketarray;
	
}
