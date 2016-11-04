package leetcoder;

import java.util.HashMap;

public class no_208 {
	class TrieNode {
		private HashMap<Character, TrieNode> map;
	    // Initialize your data structure here.
	    public TrieNode() {
	        map = new HashMap<>();
	    }
	    
	    public HashMap<Character, TrieNode> getMap() {
			return map;
		}
	}
	
	public class Trie {
	    private TrieNode root;

	    public Trie() {
	        root = new TrieNode();
	    }

	    // Inserts a word into the trie.
	    public void insert(String word) {
	        char[] wd = word.toCharArray();
	        TrieNode temp = root;
	        for (int i = 0; i < wd.length; i++) {
				char c = wd[i];
				if (!temp.getMap().containsKey(c)) temp.getMap().put(c, new TrieNode());
				temp = temp.getMap().get(c);
			}
	        temp.getMap().put('$', new TrieNode());
	    }

	    // Returns if the word is in the trie.
	    public boolean search(String word) {
	    	char[] wd = word.toCharArray();
	        TrieNode temp = root;
	        for (int i = 0; i < wd.length; i++) {
				char c = wd[i];
				if (!temp.getMap().containsKey(c)) return false;
				temp = temp.getMap().get(c);
			}
	        return temp.getMap().containsKey('$');
	    }

	    // Returns if there is any word in the trie
	    // that starts with the given prefix.
	    public boolean startsWith(String prefix) {
	    	char[] wd = prefix.toCharArray();
	        TrieNode temp = root;
	        for (int i = 0; i < wd.length; i++) {
				char c = wd[i];
				if (!temp.getMap().containsKey(c)) return false;
				temp = temp.getMap().get(c);
			}
	        return true;
	    }
	}
	
	public static void main(String[] args) {
		no_208 test = new no_208();
		Trie trie = test.new Trie();
		trie.insert("key");
		trie.insert("kay");
		System.out.println(trie.search("key"));
		System.out.println(trie.startsWith("k"));
	}
}
