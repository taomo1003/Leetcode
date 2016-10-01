package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_155 {
	public class MinStack {
		List<Integer> stack;
	    /** initialize your data structure here. */
	    public MinStack() {
	        stack = new ArrayList<Integer>();
	    }
	    
	    public void push(int x) {
	        stack.add(x);
	    }
	    
	    public void pop() {
	    	if (stack.size()==0) return;
	        stack.remove(stack.size()-1);
	    }
	    
	    public int top() {
	    	if (stack.size()==0) return -1;
	        return stack.get(stack.size()-1);
	    }
	    
	    public int getMin() {
	    	if (stack.size()==0) return -1;
	    	int min = Integer.MAX_VALUE;
	    	for (int i = 0; i < stack.size(); i++) {
				if (stack.get(i) < min) min = stack.get(i);
			}
	        return min;
	    }
	}
	
	
	public static void main(String[] args) {
		
		 no_155 ob = new no_155();
		 MinStack obj = ob.new MinStack();
		 obj.push(1);
		 obj.push(-1);
		 obj.push(-4);
		 System.out.println(obj.getMin());
		 System.out.println(obj.top());
		 System.out.println(obj.getMin());
		 obj.pop();
		 System.out.println(obj.top());
	}
}



// Push min first if another min happens.

//Stack<Integer> stack=new Stack<>();
//int min=Integer.MAX_VALUE;
//public void push(int x) {
//    if(x<=min) {stack.push(min); min=x;}
//    stack.push(x);
//}
//public void pop() {
//    if(stack.peek()==min){ stack.pop(); min=stack.pop(); }
//    else stack.pop();
//}
//public int top() {
//    return stack.peek();
//}
//public int getMin() {
//    return min;
//}
