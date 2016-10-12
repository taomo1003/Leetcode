package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_77 {
	 private List<List<Integer>> resultList = new ArrayList<>();
	 public List<List<Integer>> combine(int n, int k) {
	        List<Integer> curr = new ArrayList<Integer>();
	        assign(curr, n, k, 1);
	        return resultList;
	    }
	    
	    public void assign(List<Integer> curr, int n, int k, int start)
	    {
	        if(curr.size() == k){
	            resultList.add(new ArrayList<Integer>(curr));
	            return;
	        }
	        for(int i=start; i<=n; i++){
	            curr.add(i);
	            assign(curr, n, k, i+1);
	            curr.remove(curr.size()-1);
	        }
	    }
}
