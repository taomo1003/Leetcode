package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class no_216 {
	private List<List<Integer>> result;
	
    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        combination(new ArrayList<>(), k, n, 0, 1, 0);
    	return result;
    }
    
    public void combination(List<Integer> curr, int k, int n, int i, int j, int sum) {
		if(sum == n && i == k) {
			result.add(copy(curr));
			return;
		}
		if (i >= k) return; 
		while (sum+j<=n && j<=9){
			curr.add(j);
			combination(curr, k, n, i+1, j+1, sum+j);
			curr.remove(i);
			j++;
		}
	}
    
    public List<Integer> copy(List<Integer> curr) {
    	Iterator<Integer> it = curr.iterator();
    	List<Integer> temp = new ArrayList<>();
    	while (it.hasNext()) {
    		temp.add(it.next());
    	}
		return temp;
	}
    
    public static void main(String[] args) {
		no_216 test = new no_216();
		System.out.println(test.combinationSum3(2, 18));
	}
}
