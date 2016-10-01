package leetcoder;

public class no_55 {
	private boolean result = true;
    public boolean canJump(int[] nums) {
    	if (nums.length==1) return true;
    	for (int i = nums.length-1; i >= 0; i--) {
			if (nums[i]!=0) continue;
			else {
				int n = (i==nums.length-1)?0:1;
				result = false;
				i--;
				n++;
				while (i>=0){
					if (nums[i]>=n){
						result = true;
						break;
					}
					i--;
					n++;
				}
			}
		}
        return result;
    }
    
    public static void main(String[] args) {
		no_55 test = new no_55();
		int[] nums = {1,0,1,0};
		System.out.println(test.canJump(nums));
	}
    
}

//public boolean canJump(int[] nums) {
//    int lastPos = nums.length - 1;
//    for (int i = nums.length - 1; i >= 0; i--) {
//        if (i + nums[i] >= lastPos) {
//            lastPos = i;
//        }
//    }
//    return lastPos == 0;
//}
