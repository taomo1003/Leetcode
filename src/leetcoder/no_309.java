package leetcoder;

public class no_309 {
	public int maxProfit(int[] prices) {
	    int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
	    for (int price : prices) {
	        prev_buy = buy;
	        buy = Math.max(prev_sell - price, prev_buy);
	        prev_sell = sell;
	        sell = Math.max(prev_buy + price, prev_sell);
	    }
	    return sell;
	}
    
    public static void main(String[] args) {
		no_309 test = new no_309();
		int[] prices = {6,1,3,2,4,7};
		System.out.println(test.maxProfit(prices));
	}
    
}
