package leetcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no_40 {
	private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    int i = 0;
    while (candidates[i]<target && i<candidates.length-1){i++;};
    Solve(candidates,target,0,0,i,new ArrayList<>());
    return result;
    }
    
    private void Solve(int[] candidates, int target, int sum,int begin, int end, List<Integer> current) {
    	if (sum > target) {
    		return;
    	}
    	if (sum == target) {
    		//Make a copy of the list
    		List<Integer> temp = new ArrayList<>();
    		temp.addAll(current);
    		if (!result.contains(temp)) result.add(temp);
    		return;
    	}
    	for (int i = begin; i<= end;i++){
    		current.add(candidates[i]);
    		Solve(candidates, target, sum+candidates[i], i+1 , end, current);
    		current.remove(current.size()-1);
    	}
    	
    }
    
    public static void main(String[] args) {
    	no_40 test = new no_40();
    	int[] candi = {10, 1, 2, 7, 6, 1, 5};
    	System.out.println(test.combinationSum2(candi, 8));
		
	}
}
