package leetcoder;

public class no_306 {
    public boolean isAdditiveNumber(String num) {
    	for (int i = 0; i <= num.length()/2; i++) {
			String a = num.substring(0, i+1);
			if (a.startsWith("0") && a.length()>1) return false;
			if (check(a, num.substring(i+1))) return true;		
		}
        return false;
    }
    
    public boolean check(String a, String num) {
    	for (int i = 0; i < num.length()/2; i++) {
			String b = num.substring(0, i+1);
			if (b.startsWith("0") && b.length()>1) return false;
			Long result  = Long.valueOf(b)+Long.valueOf(a);
			String temp = num.substring(i+1);
			if (temp.equals(result.toString())) return true;
			if (temp.startsWith(result.toString())) 
				if (check(b, temp)) return true;
		}
    	return false;
	}
    
    public static void main(String[] args) {
		no_306 test = new no_306();
		System.out.println(test.isAdditiveNumber("111122335588143"));
	}
}
