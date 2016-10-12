package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_78 {
	 private List<List<Integer>> resultList = new ArrayList<>();
	 public List<List<Integer>> subsets(int[] nums) {
		 	for (int  i = 0; i<= nums.length ; i++){
	        List<Integer> curr = new ArrayList<Integer>();
	        assign(curr, i, 0,nums);
		 	}
	        return resultList;
	    }
	    
	 public void assign(List<Integer> curr, int k, int start , int[] nums) {
	        if(curr.size() == k){
	            resultList.add(new ArrayList<Integer>(curr));
	            return;
	        }
	        for(int i=start; i< nums.length; i++){
	            curr.add(nums[i]);
	            assign(curr, k, i+1,nums);
	            curr.remove(curr.size()-1);
	        }
	  }
	    
	  public static void main(String[] args) {
		no_78 test = new no_78();
		int[] nums = {1,7,3};
		System.out.println(test.subsets(nums));
	}  
	  
}
