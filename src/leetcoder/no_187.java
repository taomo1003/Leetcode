package leetcoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class no_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i<= s.length()-10; i++){
            String temp = s.substring(i,i+10);
            if(set.contains(temp) && !result.contains(temp)) result.add(temp);
            else set.add(temp);
        }
        return result;
    }
}
