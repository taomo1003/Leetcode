package leetcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class no_166 {
	
    public String fractionToDecimal(int numerator, int denominator) {
    	if (numerator%denominator==0) return String.valueOf(numerator/denominator);
        boolean minus = false;
        if (numerator<0) {minus = !minus; numerator = -numerator;}
        if (denominator<0) {minus = !minus; denominator = -denominator;} 
        
    	HashMap<Integer, Integer> hashMap = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        if (minus) sb.append("-");
        sb.append(String.valueOf(numerator/denominator));
        sb.append(".");
        
        numerator = numerator % denominator;
        int index = 0;
        
        while(true){
        	
        	if (numerator==0) {
        		Iterator<String> it = queue.iterator();
        		while(it.hasNext()){
        		sb.append(it.next());}
        		break;
        	}
        	if (hashMap.containsKey(numerator)){
        		Iterator<String> it = queue.iterator();
        		int temp = 0;
        		while(it.hasNext()){
        			if (temp==hashMap.get(numerator)) sb.append("(");
        			else sb.append(it.next());
        			temp++;
        			}
        		sb.append(")");
        		break;
        		
        	} else {
				hashMap.put(numerator, index);
			}
        	numerator*=10;
        	queue.add(String.valueOf(numerator/denominator));
        	index++;
        	numerator = numerator%denominator;
        }
        
        return sb.toString();
        
    }
    
    public static void main(String[] args) {
		no_166 test = new no_166();
		System.out.println(test.fractionToDecimal(1,214783648));
		System.out.println(1/214783648);
	}
    
    
}


//StringBuilder result = new StringBuilder();
//String sign = (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
//long num = Math.abs((long) numerator);
//long den = Math.abs((long) denominator);
//result.append(sign);
//result.append(num / den);
//long remainder = num % den;
//if (remainder == 0)
//    return result.toString();
//result.append(".");
//HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();
//while (!hashMap.containsKey(remainder)) {
//    hashMap.put(remainder, result.length());
//    result.append(10 * remainder / den);
//    remainder = 10 * remainder % den;
//}
//int index = hashMap.get(remainder);
//result.insert(index, "(");
//result.append(")");
//return result.toString().replace("(0)", "");
