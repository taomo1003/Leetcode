package leetcoder;
public class no_121 {
    public int maxProfit(int[] prices) {
    if (prices.length==0) return 0;
    int max = Integer.MIN_VALUE;
    int buy = prices[0];
    for (int i = 0; i < prices.length-1; i++) {
    	if (prices[i+1]>=buy) {if (max < prices[i+1]-buy) max = prices[i+1]-buy; continue;}
    	else {
			buy = prices[i+1];
		}
	}
    return max >0 ? max:0;
    }
}
