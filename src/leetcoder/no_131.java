package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class no_131 {
	List<List<String>> result;
	boolean[][] palindrome;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        palindrome = new boolean[s.length()][s.length()];
        List<String> temp = new ArrayList<>();
        solve(temp, 0, s);
        return result;
    }
    
    private void solve(List<String> curr,int i, String s){
    	if (i==s.length()) {result.add(clone(curr));return;}
    	for (int j = i; j< s.length(); j++){
    		if (palindrome[i][j]) {
    			curr.add(s.substring(i,j+1)); 
    			solve(curr, j+1, s);
    			curr.remove(curr.size()-1);
    			continue;
    			};
    		if (isPalindrome(i,j,s)){
    			curr.add(s.substring(i,j+1)); 
    			solve(curr, j+1, s);
    			curr.remove(curr.size()-1);
    		}
    		
    	}
    }
    
    private List<String> clone(List<String> curr) {
		Iterator<String> iterator = curr.iterator();
		List<String> temp = new ArrayList<>();
    	while (iterator.hasNext()) {
			temp.add(iterator.next());
		}
    	return temp;
	}
    
    private boolean isPalindrome(int i, int j, String s){
    	StringBuilder temp = new StringBuilder();
    	temp.append(s.substring(i,j+1));
    	if (temp.toString().equals(temp.reverse().toString())){
    		while(i<=j){
    			palindrome[i][j]=true;
    			i++;
    			j--;
    		}
    		return true;
    	}
    	return false;   	
    }
    
    public static void main(String[] args) {
		no_131 test = new no_131();
		String s = "cbbbcc";
		System.out.println(test.partition(s));
	}
}
