package leetcoder;

public class no_227 {
	public int calculate(String s) {
		int i = 0;
		int res = 0;
		long pre = 0;
		char sign = '+';
		while (i<s.length()) {
			StringBuilder sb = new StringBuilder();
			while (i<s.length() && numerical(s.charAt(i))) {
				if (s.charAt(i)==' ') i++;
				else {sb.append(s.charAt(i)); i++;}
			}
			
			long A = Long.valueOf(sb.toString());
			
			switch (sign) {
			case '+':
			{
				res += pre;
				pre = A;
				break;
			}
			case '-':
			{
				res += pre;
				pre = -A;
				break;
			}
			case '*':
			{
				pre *= A;
				break;
			}
			case '/':
			{
				pre /= A;
				break;
			}
			default:
				break;
			} 
			
			if (i<s.length()){
				sign = s.charAt(i);
				i++;
			}
			
		}
		
		res += pre;
		return res;		
	}
	
	public boolean numerical(char i) {
		return i==' '||'0'<=i && i<='9';
	}
	
	public static void main(String[] args) {
		no_227 test = new no_227();
		System.out.println(test.calculate("0-2147483647"));
	}
}
