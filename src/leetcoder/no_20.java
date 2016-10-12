package leetcoder;

public class no_20 {

    public static boolean isValid(String s) {
        char[] str = new char[s.length()];
        int point = 0;
        
        for (int i=0; i<s.length() ;i++){
        	switch (s.charAt(i)) {
			case '(':
				str[point] = '(';
				point++;
				break;
			case '[':
				str[point] = '[';
				point++;
				break;
			case '{':
				str[point] = '{';
				point++;
				break;
			case ')':
				if (point == 0 ) {return false;}
				if (str[point-1]=='('){point --;} else {return false;}
				break;
			case ']':
				if (point == 0 ) {return false;}
				if (str[point-1]=='['){point --;} else {return false;}
				break;
			case '}':
				if (point == 0 ) {return false;}
				if (str[point-1]=='{'){point --;} else {return false;}
				break;
			}	
        }
        return point==0 ? true:false;
    }
    
    public static void main(String[] args) {
    	
		System.out.println(isValid("["));
	}
}


//public boolean isValid(String s) {
//    Stack<Character> stack = new Stack<Character>();
//    // Iterate through string until empty
//    for(int i = 0; i<s.length(); i++) {
//        // Push any open parentheses onto stack
//        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
//            stack.push(s.charAt(i));
//        // Check stack for corresponding closing parentheses, false if not valid
//        else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
//            stack.pop();
//        else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
//            stack.pop();
//        else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
//            stack.pop();
//        else
//            return false;
//    }
//    // return true if no open parentheses left in stack
//    return stack.empty();
//}
