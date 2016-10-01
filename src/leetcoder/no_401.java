package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_401 {
	private List<String> result = new ArrayList<String>();
	private int[] current = new int[10];
    public List<String> readBinaryWatch(int num) {
       getBi(num,0,0);
       return result;
    }
    
    public void getBi (int n,int end, int curr){
    	if (curr==n) {
    	  result.add(gettime(curr));
    	} else {
		for (int i = end; i<10 ; i++ ){
			if (putable(i)) {
			current[i]=1;
			getBi(n,i+1,curr+1);
			current[i]=0;
			} 	
		}
    	}	
    }
    
    public boolean putable(int i) {
    	current[i]=1;
		int h = 8*current[0] +4*current[1] +2*current[2] +1*current[3];
		int m = 32*current[4] +16*current[5] +8*current[6] +4*current[7] +2*current[8] +1*current[9];
		current[i]=0;
		return (h<12&&m<60);
	}
    
    public String gettime(int bi) {
    	int h = 8*current[0] +4*current[1] +2*current[2] +1*current[3];
		int m = 32*current[4] +16*current[5] +8*current[6] +4*current[7] +2*current[8] +1*current[9];

		String result = Integer.toString(h)+":";
		if (m<10) {
			result += "0"+Integer.toString(m);
		} else {result += Integer.toString(m);}
		
		return result;
	}
    
    
    public static void main(String[] args) {
    	no_401 test = new no_401();
    	
		System.out.println(test.readBinaryWatch(5));
	}
}
