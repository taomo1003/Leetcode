package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_93 {
	List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
    	String[] curr = new String[4];
    	solve(s,curr,0);
        return result;
    }
    
    private void solve(String s, String[] curr, int n) {
    	if (s.length()==0) return;
    	if (s.length()>12) return;
		if (n==3) {
			if (s.substring(0,1).equals("0") && s.length()!=1) return;
			long temp = Long.valueOf(s);
			if (temp<256) {curr[3] = s;
			result.add(build(curr));}
			return;
		}
		
		int temp = Integer.valueOf(s.substring(0,1));
		curr[n] = s.substring(0,1);
		solve(s.substring(1,s.length()),curr,n+1);
		if (temp==0) return;
		
		
		if (s.length()>1) 
		{curr[n] = s.substring(0,2);
		solve(s.substring(2,s.length()),curr,n+1);}
		
		if (s.length()>2)
		{temp = Integer.valueOf(s.substring(0,3));
		if (temp<256) {curr[n] = s.substring(0,3);
		solve(s.substring(3,s.length()),curr,n+1);}}
		
	}
    
    private String build(String[] curr) {
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i<3 ; i++){
			temp.append(curr[i]);
			temp.append(".");
		}
		temp.append(curr[3]);
		return temp.toString();
	}

    public static void main(String[] args) {
    	no_93 test = new no_93();
		String s = "010010";
		System.out.println(test.restoreIpAddresses(s));
	}
}
