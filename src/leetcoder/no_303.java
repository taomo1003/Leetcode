package leetcoder;

public class no_303 {
	public class NumArray {
	    int[] array;
	    int[][] sumarray;
	    int[] keep;
	    public NumArray(int[] nums) {
	        array = nums;
	        sumarray = new int[nums.length][nums.length];
	        keep = new int[nums.length];
	        for (int i =0; i< nums.length ; i++){
	        keep[i]=  Integer.MAX_VALUE; }
	    }

	    public int sumRange(int i, int j) {
	    	if (j<i) return 0;
	    	if (j-i<100)
	    	{
		        int sum = 0;
		        for (int k = i; k<=j ; k++) {
		            sum+= array[k];
		        }
		        sumarray[i][j] = sum;
		        return sum;	
	    	}
	        if (sumarray[i][j]!=0) return sumarray[i][j]; 
	        int pt = i;
	        while (pt < j) {
	        	if (keep[pt]<j) {
	             int temp1 = sumRange(i,pt-1);
	             sumarray[i][pt-1] = temp1;
	             keep[i] = pt-1;
	             int temp2 = sumRange(keep[pt]+1, j);
	             sumarray[keep[pt]+1][j] = temp2;
	             keep[keep[pt]+1] = j;
	        	 return temp1+sumarray[pt][keep[pt]]+temp2;
	        	}
	        	pt++;
	        }
	        int sum = 0;
	        for (int k = i; k<=j ; k++) {
	            sum+= array[k];
	        }
	        return sum;
	    }
	}
}



//private Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
//
//public NumArray(int[] nums) {
//    for (int i = 0; i < nums.length; i++) {
//        int sum = 0;
//        for (int j = i; j < nums.length; j++) {
//            sum += nums[j];
//            map.put(Pair.create(i, j), sum);
//        }
//    }
//}
//
//public int sumRange(int i, int j) {
//    return map.get(Pair.create(i, j));
//}


//private int[] sum;
//
//public NumArray(int[] nums) {
//    sum = new int[nums.length + 1];
//    for (int i = 0; i < nums.length; i++) {
//        sum[i + 1] = sum[i] + nums[i];
//    }
//}
//
//public int sumRange(int i, int j) {
//    return sum[j + 1] - sum[i];
//}