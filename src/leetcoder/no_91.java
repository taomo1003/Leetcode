package leetcoder;

public class no_91 {
	private int length;
	private char[] charS;
	private int[] solutions;
    public int numDecodings(String s) {
        length = s.length();
        if (length==0) return 0;
        solutions = new int[length+1];
        charS = s.toCharArray();
        if (charS[0]=='0') return 0;
        return getDecode(0);
    }
    
    private int getDecode(int i) {
    	if (solutions[i]!= 0) return solutions[i];
		if (i>=length) {solutions[i]=1;return 1;}
		if (charS[i]=='0') {solutions[i] = 0; return solutions[i];}
		if (i+2<=length && charS[i]=='1')
		{solutions[i+1]=getDecode(i+1);
		 solutions[i+2]=getDecode(i+2);
		return solutions[i+1]+solutions[i+2];}
		if (i+2<=length && charS[i]=='2' && charS[i+1]<'7')
		{solutions[i+1]=getDecode(i+1);
		 solutions[i+2]=getDecode(i+2);
		return solutions[i+1]+solutions[i+2];}
		else {solutions[i+1]=getDecode(i+1);return solutions[i+1];}
	}
    
    public static void main(String[] args) {
		no_91 test = new no_91();
		System.out.println(test.numDecodings("27"));
	}
}
