package leetcoder;

import java.util.*;

public class no_118 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<List<Integer>>() ;
        List<Integer> temp = new ArrayList<Integer> ();
        temp.add(1); 
        result.add(temp); 
        
        for (int i =0; i<rowIndex; i++){
            temp = new ArrayList<Integer> ();
             temp.add(1); 
            for (int j =0; j< result.get(i).size()-1; j++){
                temp.add(result.get(i).get(j)+result.get(i).get(j+1));
            }
            temp.add(1); 
            result.add(temp); 
        }
        
        return result.get(rowIndex);
        
    }
    
    public static void main(String[] args) {
    	
		System.out.println(getRow(0));
	}
}

//public List<Integer> getRow(int rowIndex) {
//int k = rowIndex+1;
//int[] con = new int[k];
//con[0]=1;
//for(int i=1;i<k;i++){
//con[i]=1;
//for(int j=i-1;j>0;j--){
//con[j]=con[j-1]+con[j];
//}
//}
//List<Integer> list = new ArrayList<>();
//for(int kk:con) list.add(kk);
//return list;
//
//}