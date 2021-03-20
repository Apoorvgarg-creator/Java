package HashMap;

public class trieclient {

	public static void main(String[] args) {
		Trie trie=new Trie();
		trie.addword("art");
		trie.addword("arts");
		trie.addword("amit");
		trie.addword("bug");
		trie.addword("boy");
		trie.addword("see");
		trie.addword("sea");
		trie.addword("seen");
		System.out.println(trie.noofwrds());
		trie.search("see");
		trie.display();
		System.out.println("**********");
		trie.remove("see");
		
		
	}

}
