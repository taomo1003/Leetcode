package leetcoder;

public class no_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	if (gas.length==0) return -1;
    	long sum = gas[0]-cost[0];
    	long min = gas[0]-cost[0];
    	int index = 0;
        for (int i = 1; i < cost.length; i++) {
			sum = sum + gas[i]- cost[i];
			if (sum<min){
				min = sum;
				index = i;
			}
			
		}
        return sum<0? -1:(index+1)%gas.length;
    }
    
   
    
    public static void main(String[] args) {
		no_134 test = new no_134();
		int[] gas = {2,0,1,2,3,4,0};
		int[] cost = {0,1,0,0,0,0,11};
		System.out.println(test.canCompleteCircuit(gas, cost));
	}
}


//class Solution {
//public:
//    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
//        if(gas.empty()) return -1;
//        int min=gas[0]-cost[0],sum=gas[0]-cost[0],index=0;
//        /*compute the accumulation sum of gas[i]-cost[i], when it takes minimum, the starting point should be the next station*/
//        for(int i=1;i<gas.size();i++){
//            sum += gas[i]-cost[i];
//            if(sum<min){
//                min = sum;
//                index = i;
//            }
//        }
//        if(sum<0) return -1;
//        else return (index+1)%gas.size();
//    }
//};
