package Tries;

import java.util.HashMap;
import java.util.Map;

public class Trie 
{
	
	private TrieNode root;
	public Trie()
	{
		
		root=new TrieNode();
	}
	
	public void insert(String word)
	{
		HashMap<Character,TrieNode> children=root.children;
		for(int i=0;i<word.length();i++)
		{
			char c =word.charAt(i);
			TrieNode t;
			if(children.containsKey(c))
			{
				t=children.get(c);
				
			}
			else
			{
				t=new TrieNode(c);
				children.put(c, t);
			}
			
			children=t.children;
			if(i==word.length()-1)
			{
				t.isLeaf=true;
			}		
		}
			
	}
	public boolean search(String word)
	{
		TrieNode t = SearchNode(word);
		if(t !=null && t.isLeaf)
		{
			return true;
		}
		else
			return false;
		
	}
	
	public TrieNode SearchNode(String word)
	{
		Map<Character,TrieNode> children=root.children;
		TrieNode t=null;
		for(int i=0;i<word.length();i++)
		{
			char c=word.charAt(i);
			if(children.containsKey(c))
			{
				t=children.get(c);
				children=t.children;
			}
			else
			{
				return null;
			
			}
			
		}
		
		return t;
		
	}
	
	
	public boolean startsWith(String prefix)
	{
		if(SearchNode(prefix)==null)
			return false;
		
		else
			return true;
		
	}
	
	
	
	public static void main(String args[])
	{
		Trie t=new Trie();
		t.insert("Amit");
		t.insert("Amsd");
		t.insert("hello");
		t.insert("goodbye");
		t.insert("house");
		t.insert("housekeeper");
		System.out.println(t.search("Amit"));
		System.out.println(t.search("Amit"));
		System.out.println(t.startsWith("hou"));	
		System.out.println(t.startsWith("whou"));
		
	}
	

}
