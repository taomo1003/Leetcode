package leetcoder;

import java.util.HashSet;

public class no_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
      if (nums1.length==0 || nums2.length==0) return new int[0];
      String result = "";
     
      HashSet<Integer> num = new HashSet<>();  
      for (int i = 0; i < nums1.length; i++) {
		num.add(nums1[i]);
	  }
      for (int i = 0; i < nums2.length; i++) {
  		if (num.contains(nums2[i])) {
  			result += (nums2[i]+" ");
  		    num.remove(nums2[i]);
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
    	int[] test1 = {};
    	int[] test2 = {};
    	
		System.out.println(intersection(test1,test2));
	}
}
