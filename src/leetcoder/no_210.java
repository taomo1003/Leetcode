package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class no_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	ArrayList[] graph = new ArrayList[numCourses];
        int[] Degree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];
        int count = 0;
        
        for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
			Degree[i] = 0;
		}
        
        for (int i = 0; i < prerequisites.length; i++) {
			Degree[prerequisites[i][0]]++;
			graph[prerequisites[i][1]].add(prerequisites[i][0]);
		}
        
        for (int i = 0; i < Degree.length; i++) {
			if (Degree[i]==0) {queue.add(i);
			result[count] = i;
			count++;}
		}
        
        while(!queue.isEmpty()){
        	Iterator<Integer> it = graph[queue.poll()].iterator();
        	while (it.hasNext()){
        		int temp = (int) it.next();
        		Degree[temp] --;
        		if (Degree[temp]==0){
        			queue.add(temp);
        			result[count] = temp;
        			count++;
        		}
        	}
        }
        
        return count==numCourses?result:new int[0];
    }
    
}
