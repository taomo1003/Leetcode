package leetcoder;

import java.util.HashSet;
import java.util.Iterator;

public class no_260 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i : nums) {
			if (hash.contains(i)) hash.remove(i);
			else hash.add(i);
		}
        int[] result = new int[2];
        Iterator<Integer> it = hash.iterator();
        result[0] = it.next();
        result[1] = it.next();
        return result;
    }
    
    public static void main(String[] args) {
		
	}
}
