package leetcoder;

public class no_274 {
    public static int hIndex(int[] citations) {
    	//if (citations.length==0) return 0;
        int[] keep = new int[citations.length+1];
        for(int i : citations){
        	if (i>citations.length) keep[citations.length]++;
        	else keep[i]++;
        }
        
        int curr = keep[keep.length-1];
        for (int i = keep.length-1; i >0 ; i--) {
			if (curr>=i) return i;
			curr += keep[i-1];
		}
        
        return 0;
    }
    
    
    public static void main(String[] args) {
    	int[] citations = {};
		System.out.println(hIndex(citations));
	}
}
