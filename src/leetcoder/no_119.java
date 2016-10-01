package leetcoder;

import java.util.*;

public class no_119 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>() ;
        if (numRows == 0) return result;
        List<Integer> temp = new ArrayList<Integer> ();
        temp.add(1); 
        result.add(temp); 
        
        for (int i =0; i<numRows-1; i++){
            temp = new ArrayList<Integer> ();
             temp.add(1); 
            for (int j =0; j< result.get(i).size()-1; j++){
                temp.add(result.get(i).get(j)+result.get(i).get(j+1));
            }
            temp.add(1); 
            result.add(temp); 
        }
        
        return result;
        
    }
    
    public static void main(String[] args) {
    	
		System.out.println(generate(3));
	}
}
