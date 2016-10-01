package leetcoder;

public class no_189 {
    public void rotate(int[] nums, int k) {
     int n = nums.length;	
     k = k%n; //[1,2] 3 means 1;
     if (n<=k) {return;}
     int[] result = new int[n] ; 
     int index = 0;
     for (int i = n-k; i < n; i++) {
		result[index] = nums[i];
		index++;
	}
     int i = 0;
     while (index < n) {
    	 result[index] = nums[i];
    	 i++; 
    	 index++;
     }
     
     for (int j = 0; j < result.length; j++) {
    	 nums[j] = result[j];
	}
    }
    
    public static void main(String[] args) {
	 int[] temp = {1,2};
	 no_189 test = new no_189();
	 test.rotate(temp, 1);
	 System.out.println(temp[0]);
	}
    
}
