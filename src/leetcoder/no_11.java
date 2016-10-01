package leetcoder;

public class no_11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxarea = 0;
        while (l<r) {
        maxarea = Math.max((r-l)*Math.min(height[l], height[r]), maxarea) ;
        if (height[l]<height[r]) {
        	l++;
        }else {
        	r--;
		};	
        }
        return maxarea;
    }
}
