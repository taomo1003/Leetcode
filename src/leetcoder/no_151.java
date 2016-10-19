package leetcoder;

import java.util.Stack;

public class no_151 {
    public String reverseWords(String s) {
//    	while (s.length()!=0 && s.charAt(0)==' ') {
//			s = s.substring(1, s.length());
//		}
    	//not good
    	// s.trim() will do this
        Stack<String> stack = new Stack<>();
        String[] temp = s.trim().split("\\s+"); //here \s means A whitespace character. + means one or more times
        for (String i : temp){
            stack.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
        	sb.append(" ");
            sb.append(stack.pop());
        }
        return sb.toString().trim();
        
    }
    
    public static void main(String[] args) {
		no_151 test = new no_151();
		String s = "as s ";
		System.out.println(test.reverseWords(s));
	}
}


//String[] parts = s.trim().split("\\s+");
//String out = "";
//for (int i = parts.length - 1; i > 0; i--) {
//    out += parts[i] + " ";
//}
//return out + parts[0];
