package leetcoder;

import java.util.HashMap;

public class no_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length==0 || nums2.length==0) return new int[0];
        String result = "";
       
        HashMap<Integer,Integer> num = new HashMap<Integer,Integer>();  
        for (int i = 0; i < nums1.length; i++) {
        int temp =  num.containsKey(nums1[i])? num.get(nums1[i])+1:1;
  		num.put(nums1[i],temp);
  	  }
        for (int i = 0; i < nums2.length; i++) {
    	if (num.containsKey(nums2[i])) {
    		int temp = num.get(nums2[i]);
    		if (temp ==1) num.remove(nums2[i]); else {
				num.put(nums2[i], temp-1);
			}
    		result += (nums2[i]+" ");
    		}
    	  }
        if (result.equals("")) return new int[0];
        String[] temp = result.split(" ");
        
        int[] result1 = new int[temp.length];
        for (int i = 0; i < result1.length; i++) {
  		result1[i] =  Integer.parseInt(temp[i]);
  	}
        return result1;
    }
    public static void main(String[] args) {
    	int[] test1 = {2,1};
    	int[] test2 = {1,2};
    	
		System.out.println(intersect(test1,test2));
	}
    
}
