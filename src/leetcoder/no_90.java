package leetcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no_90 {
	 private List<List<Integer>> resultList = new ArrayList<>();
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
		    Arrays.sort(nums);
		 	for (int  i = 0; i<= nums.length ; i++){
	        List<Integer> curr = new ArrayList<Integer>();
	        assign(curr, i, 0,nums);
		 	}
	        return resultList;
	    }
	    
	 public void assign(List<Integer> curr, int k, int start , int[] nums) {
	        if(curr.size() == k){
	        	if (resultList.size()==0) resultList.add(new ArrayList<Integer>(curr));
	        	for(int j = 0; j< resultList.size(); j++){
	        	if (samelist(curr,resultList.get(j))) return;}
	        	resultList.add(new ArrayList<Integer>(curr));
	            return;
	        }
	        for(int i=start; i< nums.length; i++){
	        	curr.add(nums[i]);
	            assign(curr, k, i+1,nums);
	            curr.remove(curr.size()-1);
	        }
	  }
	 
	 public boolean samelist(List<Integer> a,List<Integer> b) {
		if (a.size()!= b.size()) return false;
		for (int i = 0; i< a.size() ; i++){
			if (a.get(i)!=b.get(i)) return false;
		}
		return true;
	 }
	    
	  public static void main(String[] args) {
		no_90 test = new no_90();
		int[] nums = {2,1,2,1,3};
		System.out.println(test.subsetsWithDup(nums));
	}  
}
