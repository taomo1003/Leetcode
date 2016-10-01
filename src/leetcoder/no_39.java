package leetcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no_39 {
	private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
    		result.add(temp);
    		return;
    	}
    	for (int i = begin; i<= end;i++){
    		current.add(candidates[i]);
    		Solve(candidates, target, sum+candidates[i], i , end, current);
    		current.remove(current.size()-1);
    	}
    	
    }
    
    public static void main(String[] args) {
    	no_39 test = new no_39();
    	int[] candi = {1};
    	System.out.println(test.combinationSum(candi, 7));
		
	}
    
}
