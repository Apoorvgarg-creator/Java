package huffman;
import java.awt.geom.GeneralPath;
import java.util.*;

public class HuffmanEncoder {
	HashMap<Character,String> encoder;
	HashMap<String,Character> decoder;
	private class Node implements Comparable<Node>{
		Character data;
		int cost;
		Node left;
		Node right;
		Node(char data,int cost){
			this.data=data;
			this.cost=cost;
			this.left=null;
			this.right=null;
		}
		Node(Node left,Node right){
			this.left=left;
			this.right=right;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return o.cost-this.cost;
		}
	}
	public HuffmanEncoder(String feeder) {
		//1. create a freq map of the feeder string
		HashMap<Character,Integer> freqMap=new HashMap<>();
		for(int i=0;i<feeder.length();i++) {
			char ch=feeder.charAt(i);
			if(freqMap.containsKey(ch)) {
				freqMap.put(ch, freqMap.get(ch)+1);
			}else {
				freqMap.put(ch, 1);
			}
		}
		//2. Create a Min heap of the nodes
		Genric_Heap<Node> minHeap=new Genric_Heap<>();
		Set<Map.Entry<Character, Integer>> entryset=freqMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entryset) {
			Node node=new Node(entry.getKey(),entry.getValue());
				minHeap.add(node);
			
		}
		//3.combine Nodes until one node is left in heap
		while(minHeap.size()!=1) {
			Node minone=minHeap.remove();
			Node mintwo=minHeap.remove();
			Node cnode=new Node(minone,mintwo);
			cnode.cost=minone.cost+mintwo.cost;
			cnode.data='\0';
			minHeap.add(cnode);
			
			
		}
		// ft --> full tree
		Node ft=minHeap.remove();	
		this.encoder=new HashMap<>();
		this.decoder=new HashMap<>();
		this.initEncoderDecoder(ft, "");
	}
	// fills encoder and decoder
	//osf --> output so far
	private void initEncoderDecoder(Node node,String osf) {
		if(node==null) {
			return ;
		}
		if(node.left==null && node.right==null) {
			this.encoder.put(node.data,osf) ;
			this.decoder.put(osf,node.data) ;
		}
		this.initEncoderDecoder(node.left, osf+"0");
		this.initEncoderDecoder(node.right, osf+"1");
	}
	public String encode(String source) {
		
		String rv="";
		for(int i=0;i<source.length();i++) {
			String code=this.encoder.get(source.charAt(i));
			rv+=code;
		}
		Set<Character> keyset = this.encoder.keySet();
		ArrayList<Character> keyset2 = new ArrayList<>(keyset);

		for (char key : keyset2) {

			System.out.println(key + " : " + this.encoder.get(key));

		}
		return rv;
		
	}
	public String decode(String coded) {
		String rv="";
		String key="";
		for(int i=0;i<coded.length();i++) {
			key=key+coded.charAt(i);
			if(this.decoder.containsKey(key)) {
			rv+=this.decoder.get(key);
			key="";
			}
		}
		return rv;
		
	}
}
