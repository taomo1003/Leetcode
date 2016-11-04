package leetcoder;

import java.util.HashMap;
import java.util.Iterator;

public class no_211 {
	
	public class WordDictionary {
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
		
	    private TrieNode root;

	    public WordDictionary() {
	        root = new TrieNode();
	    }

	    // Inserts a word into the trie.
	    public void addWord(String word) {
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
	    	return searchDot(word, root);
	    }
	    
	    public boolean searchDot(String word, TrieNode root) {
			if (word == null) return true;
			char[] wd = word.toCharArray();
	        TrieNode temp = root;
	        for (int i = 0; i < wd.length; i++) {
				char c = wd[i];
				if (c=='.') {
					Iterator<Character> it = temp.getMap().keySet().iterator();
					while (it.hasNext()){
						if (searchDot(word.substring(i+1,word.length()), temp.getMap().get(it.next()))) 
							return true;
					}
					return false;
				}
				if (!temp.getMap().containsKey(c)) return false;
				temp = temp.getMap().get(c);
			}
	        return temp.getMap().containsKey('$');
		}
	}
	
	public static void main(String[] args) {
		no_211 test = new no_211();
		WordDictionary wd = test.new WordDictionary();
		wd.addWord("word");
		wd.addWord("wor");
		wd.addWord("wok");
		wd.addWord("uord");
		System.out.println(wd.search("word"));
		System.out.println(wd.search("wo.d"));
		System.out.println(wd.search("....."));
	}
}
