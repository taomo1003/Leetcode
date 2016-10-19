package leetcoder;

import java.util.Arrays;
import java.util.Comparator;

public class no_179 {
	public class StringComparator implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			String st1 = s1+s2;
			String st2 = s2+s1;
			return Long.valueOf(st1)>Long.valueOf(st2)?-1:1;
		}
	}
	
    public String largestNumber(int[] nums) {
        int index = 0;
        String[] num = new String[nums.length];
        for (int i : nums){
        	num[index] = String.valueOf(i);
        	index++;
        }
        
        Arrays.sort(num, new StringComparator());
        
        //in case of "000000" return "0"
        if (num[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String i: num){
        	sb.append(i);
        }

        return sb.toString();
    }
    
	public static void main(String[] args) {
		no_179 temp = new no_179();
		//String[] test = {"91","92","89","999","912"};
		int[] nums  ={0,0,0,0,0};
		System.out.println(temp.largestNumber(nums));
	}
		
}
