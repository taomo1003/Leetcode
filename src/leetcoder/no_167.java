package leetcoder;

public class no_167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (l<r){
        	int sum = numbers[l]+numbers[r];
        	if (sum == target) break;
        	if (sum<target) l++;
        	else r--;
        }
        int[] result = new int[2];
        result[0] = l+1;
        result[1] = r+1;
        return result;
    }
    
    public static void main(String[] args) {
		no_167 test = new no_167();
		int[] numbers = {2,7,11,15};
		int target = 22;
		int[] result = test.twoSum(numbers, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}
}
