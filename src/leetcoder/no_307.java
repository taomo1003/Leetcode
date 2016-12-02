package leetcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class no_307 {
	public class NumArray {
		private int[] numSum;
		private HashMap<Integer,Integer> updateData;
		private int[] nums;
	    public NumArray(int[] nums) {
	        this.nums = nums;
	        if(nums.length ==0) return;
	        numSum = new int[nums.length];
	        numSum[0] = nums[0];
	        updateData = new HashMap<>();
	        UpdateAllSum();
	    }

	    void update(int i, int val) {
	        updateData.put(i, val);
	        if (updateData.size() > nums.length/5) {
	        	Iterator iterator = updateData.entrySet().iterator();
	        	while (iterator.hasNext()) {
					Map.Entry pair = (Map.Entry)iterator.next();
					nums[(int)pair.getKey()] = (int)pair.getValue();
					iterator.remove();
				}
	        	UpdateAllSum();
	        }
	    }

	    public int sumRange(int i, int j) {
	        int result; 
	        if (i==0) result = numSum[j]; else result = numSum[j] - numSum[i-1];
	        Iterator iterator = updateData.entrySet().iterator();
        	while (iterator.hasNext()) {
				Map.Entry pair = (Map.Entry)iterator.next();
				if((int)pair.getKey()>= i && (int)pair.getKey() <=j) 
					result = result - nums[(int)pair.getKey()] + (int)pair.getValue();
				iterator.remove();
			}
        	return result;
	    }
	    
	    private void UpdateAllSum(){
	    	for (int i = 1; i < nums.length; i++) {
					numSum[i] = numSum[i-1] + nums[i];
					}	
	    }
	}
}
