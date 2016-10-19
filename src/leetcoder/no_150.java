package leetcoder;

import java.util.Stack;

public class no_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i: tokens){
        	if (isOperation(i)){
        		int temp1 = stack.pop();
        		int temp2 = stack.pop();
        		stack.push(operation(temp1,temp2,i));
        	} else {
        		stack.push(Integer.valueOf(i));
        	}
        }
        return stack.pop();
    }
    
    private boolean isOperation(String s){
    	return s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/");
    }
    
    private int operation(int temp1, int temp2, String i) {
		switch (i) {
		case "+":
			return temp2+temp1;
		case "-":
			return temp2-temp1;
		case "*":
			return temp2*temp1;
		case "/":
			return temp2/temp1;
		}
		return -1;
	}
}
