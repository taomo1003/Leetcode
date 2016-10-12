package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_22 {
	List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
    	solve("", n, 0, 0);
    	return result;
    }
    
    public void solve(String curr, int n, int open, int close) {
    	if (open==n && close==n)  
    		{
    		result.add(new String(curr));
    		return;
    		}
    	if (open<n) solve(curr+"(", n, open+1, close);
    	if (open>close) solve(curr+")", n, open, close+1);
    	
	}
    
    
    public static void main(String[] args) {
		no_22 test = new no_22();
		System.out.println(test.generateParenthesis(4));
	}
}


//public List<String> generateParenthesis(int n) {
//    List<String> list = new ArrayList<String>();
//    backtrack(list, "", 0, 0, n);
//    return list;
//}
//
//public void backtrack(List<String> list, String str, int open, int close, int max){
//    
//    if(str.length() == max*2){
//        list.add(str);
//        return;
//    }
//    
//    if(open < max)
//        backtrack(list, str+"(", open+1, close, max);
//    if(close < open)
//        backtrack(list, str+")", open, close+1, max);
//}