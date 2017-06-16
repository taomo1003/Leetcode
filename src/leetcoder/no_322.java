package leetcoder;

public class no_322 {
    public static int coinChange(int[] coins, int amount) {
    	if (amount==0) return 0;
        int[] minArray = new int[amount];
        
        for(int i : coins){
        	if (i<=amount) minArray[i-1] = 1;
        }
        
        for(int i = 0; i < amount ; i++){
        	if (minArray[i]==1) continue;
        	minArray[i] = Integer.MAX_VALUE;
        	for(int j : coins){
        		if((i-j)>=0 && minArray[i-j]>0)
        		minArray[i] = Math.min(minArray[i], minArray[i-j]+1);
        	}
        	if(minArray[i]==Integer.MAX_VALUE) minArray[i] = -1; 
        }
        return minArray[amount-1];
    }
    
    
    public static void main(String[] args) {
		int[] coins = {1};
		int amount = 2;
		System.out.println(coinChange(coins, amount));
	}
}
