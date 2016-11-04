package leetcoder;

import java.util.Arrays;
import java.util.Comparator;

public class no_220 {
	public int[] globalNums;
	 
    public class IndexComparator implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			return globalNums[Integer.valueOf(s1)]>globalNums[Integer.valueOf(s2)]?1:-1;
		}	
    }
	
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	if (nums.length ==0) return false;
        globalNums = nums;
        String[] index = new String[nums.length];
        for (int i = 0; i < index.length; i++) {
			index[i]=String.valueOf(i);
		}
        
        Arrays.sort(index,new IndexComparator());
        Arrays.sort(nums);
        
        for (int i = 0; i < index.length-1; i++) {
        	int temp = i+1;
        	while (temp<index.length &&  ((long)nums[temp]-(long)nums[i])<=t){
			if (Math.abs(Integer.valueOf(index[i])-Integer.valueOf(index[temp]))<=k) return true;
			temp++;
        	}
		}
        
        return false;
    }
    
    public static void main(String[] args) {
		int[] nums = {-1,2147483647};
		no_220 test = new no_220();
		System.out.println(test.containsNearbyAlmostDuplicate(nums, 1, 2147483647));
		
	}
   
}



//private long getID(long i, long w) {
//    return i < 0 ? (i + 1) / w - 1 : i / w;
//}
//
//public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//    if (t < 0) return false;
//    Map<Long, Long> d = new HashMap<>();
//    long w = (long)t + 1;
//    for (int i = 0; i < nums.length; ++i) {
//        long m = getID(nums[i], w);
//        if (d.containsKey(m))
//            return true;
//        if (d.containsKey(m - 1) && Math.abs(nums[i] - d.get(m - 1)) < w)
//            return true;
//        if (d.containsKey(m + 1) && Math.abs(nums[i] - d.get(m + 1)) < w)
//            return true;
//        d.put(m, (long)nums[i]);
//        if (i >= k) d.remove(getID(nums[i - k], w));
//    }
//    return false;
//}
