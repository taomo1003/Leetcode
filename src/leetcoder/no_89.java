package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class no_89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> grey = new ArrayList<>();
        if (n==0) {grey.add(0);return grey;}
        grey.add(0);
        grey.add(1);
        int k = 1;
        int base = 1;
        while (k<n) {
        	base *=2;
        	int size = grey.size();
        	int j = size-1;
        	for (int i = 0; i< size ; i++){
        		grey.add(base+grey.get(j-i));
        	}
        	k++;
        }
        return grey;
        
    }
    
    public static void main(String[] args) {
		Iterator<Integer> it = grayCode(0).iterator();
		while(it.hasNext()) {System.out.println(it.next());}
	}
}
