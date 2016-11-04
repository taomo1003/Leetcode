package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class no_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] Degree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        
        int count = 0;
        
        for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
			Degree[i] = 0;
		}
        
        for (int i = 0; i < prerequisites.length; i++) {
			Degree[prerequisites[i][1]]++;
			graph[prerequisites[i][0]].add(prerequisites[i][1]);
		}
        
        for (int i = 0; i < Degree.length; i++) {
			if (Degree[i]==0) {queue.add(i);
			count++;}
		}
        
        while(!queue.isEmpty()){
        	Iterator<Integer> it = graph[queue.poll()].iterator();
        	while (it.hasNext()){
        		int temp = (int) it.next();
        		Degree[temp] --;
        		if (Degree[temp]==0){
        			queue.add(temp);
        			count++;
        		}
        	}
        }
        
        return count==numCourses;
    }
    
    public static void main(String[] args) {
		no_207 test = new no_207();
		int numCourses = 4;
		int[][] prerequisites = {{0,1},{1,2},{2,3}};
		System.out.println(test.canFinish(numCourses, prerequisites));
	}
    
    
}
