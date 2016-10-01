package leetcoder;

import java.util.Stack;

public class no_71 {
    public String simplifyPath(String path) {
    	Stack<String> stack = new Stack<>();
        String[] stringArray= path.split("/");
        for (String temp : stringArray ){
        	if (temp.equals(".") || temp.equals("")) continue;
        	if (temp.charAt(0) == ' ') break;
        	if (temp.equals("..")) {
        		if (!stack.isEmpty()) stack.pop(); else continue;}
        	else stack.push(temp);
        }
        
        if (stack.isEmpty()) return "/";
        
        StringBuilder sb = new StringBuilder();
        
        Stack<String> stacktemp = new Stack<>();
        while(!stack.isEmpty()){
        	stacktemp.push(stack.pop());
        }
        
        while(!stacktemp.isEmpty()){
        	sb.append("/");
        	sb.append(stacktemp.pop());
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
		no_71 test = new no_71();
		System.out.println(test.simplifyPath("/.."));
	}
}
