package leetcoder;

public class no_88 {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		   int index = 0; 
		   if (m == 0) {
			   
			   int i=0;
		    	while (i<n) {
					nums1[index] = nums2[i];
					i++;
					index++;
				}
		    	return;
		    }
	        for (int i = 0; i < n ; i++) {
				while (nums2[i] >= nums1[index] && index < m) { 
					index ++;
				}
			if (m >= index +1) {
				for (int j = m; j > index; j--) {
					nums1[j] = nums1[j-1];
				}
				m++; 
				nums1[index] = nums2[i];
			} else {
				while (i<n) {
					nums1[index] = nums2[i];
					i++;
					index++;
				}
			}
				
			}
	        
	    }
	 public static void main(String[] args) {
		 int[] test1 = {2,0};
		 int[] test2 = {1};
		 merge(test1, 1, test2, 1);
		
	}
	 
}
