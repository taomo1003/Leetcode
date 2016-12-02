package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class no_241 {
    public List<Integer> diffWaysToCompute(String input) {
    	String[] numstemp = input.split("\\+|\\-|\\*");
    	int[] nums = new int[numstemp.length];
    	for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.valueOf(numstemp[i]);		
		}
    	
    	List<Character> symbolstemp = new ArrayList<>();
    	char[] temp = input.toCharArray();
    	for (int i = 0; i < temp.length; i++) {
			if (temp[i]=='+'||temp[i]=='-'||temp[i]=='*') symbolstemp.add(temp[i]);
		}
    	char[] symbols = new char[symbolstemp.size()];
    	for (int i = 0; i < symbols.length; i++) {
			symbols[i] = symbolstemp.get(i);
		}
    	
        return solve(nums, symbols,0,nums.length-1,0,symbols.length-1);
    }
    
    public List<Integer> solve(int[] nums, char[] symbol, int numsl, int numsr, int charl, int charr){
    	List<Integer> result = new LinkedList<>();
    	if (charl>charr) 
    	{result.add(nums[numsl]); return result;}
    	
    	for (int i = charl; i <= charr; i++) {
    		List<Integer> left = solve(nums, symbol, numsl, i, charl, i-1);
    		List<Integer> right = solve(nums, symbol, i+1, numsr, i+1, charr);
    		
    		for (Iterator iterator = left.iterator(); iterator.hasNext();) {
    			int lefttemp = (int) iterator.next();
				for (Iterator iterator2 = right.iterator(); iterator2.hasNext();) {
					switch (symbol[i]) {
					case '+':
						result.add(lefttemp+(int)iterator2.next());
						break;
					case '-':
						result.add(lefttemp-(int)iterator2.next());
						break;
					case '*':
						result.add(lefttemp*(int)iterator2.next());
						break;
					default:
						break;
					}
					
				}
			}
    				
		}
    	return result;
    }
    
    public static void main(String[] args) {
		no_241 test = new no_241();
		System.out.println(test.diffWaysToCompute("2*3-4*5"));
	}
}


//List<Integer> ret = new LinkedList<Integer>();
//for (int i=0; i<input.length(); i++) {
//    if (input.charAt(i) == '-' ||
//        input.charAt(i) == '*' ||
//        input.charAt(i) == '+' ) {
//        String part1 = input.substring(0, i);
//        String part2 = input.substring(i+1);
//        List<Integer> part1Ret = diffWaysToCompute(part1);
//        List<Integer> part2Ret = diffWaysToCompute(part2);
//        for (Integer p1 :   part1Ret) {
//            for (Integer p2 :   part2Ret) {
//                int c = 0;
//                switch (input.charAt(i)) {
//                    case '+': c = p1+p2;
//                        break;
//                    case '-': c = p1-p2;
//                        break;
//                    case '*': c = p1*p2;
//                        break;
//                }
//                ret.add(c);
//            }
//        }
//    }
//}
//if (ret.size() == 0) {
//    ret.add(Integer.valueOf(input));
//}
//return ret;
