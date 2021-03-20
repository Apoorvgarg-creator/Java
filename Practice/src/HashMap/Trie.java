package HashMap;

//import java.util.HashMap;
import java.util.*;

public class Trie {
	private class Node{
		char data;
		HashMap<Character,Node> children;
		boolean isTerminal;
		Node(char data,boolean isTerminal){
			this.data=data;
			this.children=new HashMap<>();
			this.isTerminal=isTerminal;
		}
	}
	private int numwords;
	private Node root;
	Trie(){
		this.root=new Node('\0',false);
		this.numwords=0;
	}
	public int noofwrds() {
		return this.numwords;
	}
	//Addword Method
	public void addword(String word) {
	this.addword(this.root,word);	
	}
	private void addword(Node parent, String  word ) {
		if(word.length()==0) {
			if(parent.isTerminal) {
				//word already exist
			}else {
			parent.isTerminal=true;
			this.numwords++;
			}
			return ;
		}
		char ch=word.charAt(0);
		String ros=word.substring(1);
		if(!parent.children.containsKey(ch)) {
			Node nn=new Node(ch,false);
			parent.children.put(ch,nn);
			addword(nn,ros);
		}
		else {
			Node pn=parent.children.get(ch);
			addword(pn,ros);
		}
		
	}
	//Display Method
	public void display() {
	this.display(this.root,"");	
	}
	private void display(Node node,String osf) {
		if(node.isTerminal) {
			
			System.out.println(osf);
		}
		Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
		for(Map.Entry<Character,Node> entry:entries) {
			this.display(entry.getValue(),osf+entry.getKey());
		}
	}
	//Search Method
	public void search(String word) {
		System.out.println(this.search(root,word));
	}
	private boolean search(Node node,String word) {
		if(word.length()==0) {
			if(node.isTerminal) {
				return true;
			}
			return false;
		}
		char ch=word.charAt(0);
		String ros=word.substring(1);
		if(!node.children.containsKey(ch)) {
			return false;
		}else {
			Node pn=node.children.get(ch);
			boolean rr=search(pn,ros);
			return rr;
		}
	
	}
	//Remove Method
	public void remove(String word) {
		this.remove(this.root,word);
		System.out.println("Removed");
	}
	 private void remove(Node parent,String word) {
		 if(word.length()==0) {
			 if(parent.isTerminal) {
				 parent.isTerminal=false;
				 this.numwords--;
			 }else {
				 
			 }
			 return ;
		 }
		 char ch= word.charAt(0);
		 String ros=word.substring(1);
		 Node child=parent.children.get(ch);
		 if(child==null) {
			 return ;
		 }
		 this.remove(child, ros);
		 if(!child.isTerminal&&child.children.size()==0) {
			 parent.children.remove(ch);
		 }
		 return ;
	 }
	
}
