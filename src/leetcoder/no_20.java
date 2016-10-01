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
