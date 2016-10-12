package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_120 {
    //new idea from bottom add towards top
	
	public static int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size();
    	long[] sum = new long[n];
    	for (int i = 0; i < sum.length; i++) {
			sum[i] = triangle.get(n-1).get(i);
		}
    	int j = n-1;
    	for (int i = 0; i < sum.length; i++) {
		
    		for (int k = 0; k< j; k++){
    			sum[k] = Math.min(sum[k], sum[k+1]);
    			sum[k] += triangle.get(j-1).get(k);
    		}
    		j--;
		}
    	return (int) sum[0];
    }
    
    
    
//    private static int solve(List<List<Integer>> triangle, int i,int j, int sum){
//    	if (i== triangle.size()) {
//    		return sum;
//    	}
//    	sum+= triangle.get(i).get(j);
//    	return Math.min(solve(triangle, i+1, j, sum), solve(triangle, i+1, j+1, sum));
//    }
    
    public static void main(String[] args) {
    	List<List<Integer>> temp = new ArrayList<>();
    	List<Integer> temp1 = new ArrayList<>();
    	temp1.add(2);
    	temp.add(temp1);
    	List<Integer> temp2 = new ArrayList<>();
    	temp2.add(3);temp2.add(4);
    	temp.add(temp2);
    	List<Integer> temp3 = new ArrayList<>();
    	temp3.add(6);temp3.add(5);temp3.add(7);
    	temp.add(temp3);
    	List<Integer> temp4 = new ArrayList<>();
    	temp4.add(4);temp4.add(1);temp4.add(8);temp4.add(3);
    	temp.add(temp4);
    	
    	
    	System.out.println(temp);
    	System.out.println(minimumTotal(temp));
    	
	}
}
