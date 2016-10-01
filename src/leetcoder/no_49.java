package leetcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class no_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result = new ArrayList<>();
    	HashMap<String, Integer> map = new HashMap<>();
    	for (int i = 0; i < strs.length; i++) {
			String tempstring = strs[i];
			String tempcode = getCode(tempstring);
			if (map.containsKey(tempcode)){
				List<String> tempList= result.get(map.get(tempcode));
				//if (!tempList.contains(tempstring)){
					tempList.add(tempstring);
				//}
			} else {
				List<String> tempList = new ArrayList<>();
				tempList.add(tempstring);
				result.add(tempList);
				map.put(tempcode, result.size()-1);
			}
			
		}
    	return result;
    }
    
    private String getCode(String temp){
    	int[] in = new int[26];
    	char[] temp1 = temp.toCharArray();
    	for (char i : temp1){
    		in[i-'a']++;
    	}
    	StringBuilder sb = new StringBuilder();
    	for (int i : in) {
    		sb.append(String.valueOf(i));
    	}
    	return sb.toString();
    }
    
    public static void main(String[] args) {
		no_49 test = new no_49();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(test.groupAnagrams(strs));
	}
    
}
