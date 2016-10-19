package leetcoder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class no_127 {

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> beginSet = new HashSet<String>();
        Set<String> endSet = new HashSet<String>();
        Set<String> visited = new HashSet<String>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        int count = 1;
        while(!beginSet.isEmpty()){
        	if (beginSet.size()>endSet.size()){
        		Set<String> tempSet = beginSet;
        		beginSet = endSet;
        		endSet = tempSet;
        	}
        	Set<String> tempSet = new HashSet<>();
        	Iterator<String> it = beginSet.iterator();
        	while(it.hasNext()){
        		String curr = it.next();
        		for (int i =  0; i< curr.length() ;i++){
        			char[] tempCurr = curr.toCharArray();
        			char tempChar = tempCurr[i];
        			for (char j ='a'; j<='z'; j++) {
        				if (j==tempChar) continue;
        				tempCurr[i] = j; 
        				String tempString = String.valueOf(tempCurr);
						if (endSet.contains(tempString)) return count+1;
						if (wordList.contains(tempString)&&!visited.contains(tempString))
							{tempSet.add(tempString);
							visited.add(tempString);}
					}
        			tempCurr[i] = tempChar;
        		}
        	}
        	beginSet = tempSet;
        	count++;
        }
        return 0;
    }
    
    public static void main(String[] args) {
		no_127 test = new no_127();
		String beginWord = "hit";
		String endWord = "cog";
		Set<String> wordList = new HashSet<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		
		System.out.println(test.ladderLength(beginWord, endWord, wordList));
		
	}
}
