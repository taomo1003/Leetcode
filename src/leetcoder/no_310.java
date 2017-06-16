package leetcoder;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class no_310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    	if (n == 1) return Collections.singletonList(0);
    	
    	LinkedList<HashSet<Integer>> adj = new LinkedList<>();
    	
    	for(int i = 0; i<n ; i++ ){
    		adj.add(new HashSet<>());
    	}
    	
    	for(int i = 0; i< edges.length ; i++){
    		adj.get(edges[i][0]).add(edges[i][1]);
    		adj.get(edges[i][1]).add(edges[i][0]);
    	}
    	
    	LinkedList<Integer> leaves = new LinkedList<>();
    	LinkedList<Integer> currentLeaves = new LinkedList<>();
    	
    	for(int i = 0; i<n ; i++ ){
    		if (adj.get(i).size() == 1) leaves.add(i);
    	}
    	
    	
    	while(n>2){
    		currentLeaves = new LinkedList<>();
    		n -= leaves.size();
    		for(int i : leaves){
    			int j = adj.get(i).iterator().next();
    			adj.get(j).remove(i);
    			if (adj.get(j).size()==1) {
    				currentLeaves.add(j);
    			}
    		}
    		
    		leaves = currentLeaves;
    	}
    	
    	return leaves;
    	
    }
    
    
    public static void main(String[] args) {
		no_310 test = new no_310();
		int[][] set =  {{0, 1}};
		System.out.println(test.findMinHeightTrees(2, set));
	}
}


/*
 * 
 * public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    if (n == 1) return Collections.singletonList(0);

    List<Set<Integer>> adj = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) adj.add(new HashSet<>());
    for (int[] edge : edges) {
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
    }

    List<Integer> leaves = new ArrayList<>();
    for (int i = 0; i < n; ++i)
        if (adj.get(i).size() == 1) leaves.add(i);

    while (n > 2) {
        n -= leaves.size();
        List<Integer> newLeaves = new ArrayList<>();
        for (int i : leaves) {
            int j = adj.get(i).iterator().next();
            adj.get(j).remove(i);
            if (adj.get(j).size() == 1) newLeaves.add(j);
        }
        leaves = newLeaves;
    }
    return leaves;
}

*/
/*
4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
*/