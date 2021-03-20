package huffman;

import java.util.BitSet;

public class hpclient {
	public static void main(String[] args) {
		String str="aaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbcccccdddddddd";
		HuffmanEncoder hf=new HuffmanEncoder(str);
		String st="abcd";
		System.out.println(hf.encode(st));
		BitSet bitset=new BitSet(hf.encode(st).length());
		int bitcounter=0;
		for(Character ch :hf.encode(st).toCharArray()) {
			if(ch.equals('1')) {
				bitset.set(bitcounter);
			}
			bitcounter++;
		}
		byte[] array=bitset.toByteArray();
		System.out.println("Byte -->"+array.length);
	}

}
