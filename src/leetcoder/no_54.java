package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length==0) return result;
        
        int n = matrix[0].length;
        int m = matrix.length;
        
        int ptl = 0 ;
        int ptr = n ;
        int ptu = 0 ;
        int ptd = m ;
        
        int index = 0;
        int i=0;
        int j=0;
        while(index<m*n){
        	while(j<ptr){
        		result.add(matrix[i][j]);
        		j++;
        		index++;
        		if (index == m*n) return result;
        	}
        	j--;
        	i++;
        	while(i<ptd){
        		result.add(matrix[i][j]);
        		i++;
        		index++;
        		if (index == m*n) return result;
        	}
        	i--;
        	j--;
        	while(j>=ptl){
        		result.add(matrix[i][j]);
        		j--;
        		index++;
        		if (index == m*n) return result;
        	}
        	j++;
        	i--;
        	while(i>=ptu+1){
        		result.add(matrix[i][j]);
        		i--;
        		index++;
        		if (index == m*n) return result;
        	}
        	i++;
        	j++;
        	ptr--;
        	ptl++;
        	ptu++;
        	ptd--;
        	
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {
		no_54 test = new no_54();
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(test.spiralOrder(matrix));
	}
}
