package leetcoder;

import java.util.HashMap;

public class no_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer>  map = new HashMap<>();  
    for (int  i = 0 ; i< nums.length ; i++) {
    if (map.containsKey(nums[i])) {
    	if (Math.abs(map.get(nums[i])-i)<=k) 
    	return true;
    	map.put(nums[i], i);} 
    else {map.put(nums[i], i);};	
    }
    return false;
    }
    
    public static void main(String[] args) {
		no_219 test = new no_219();
		int[] te = {99,99};
		System.out.println(test.containsNearbyDuplicate(te,2));
	}
}
