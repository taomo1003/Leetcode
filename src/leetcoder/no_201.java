package leetcoder;

public class no_201 {
    public int rangeBitwiseAnd(int m, int n) {
    	 if(m == 0){
             return 0;
         }
         int moveFactor = 1;
         while(m != n){
             m >>= 1;
             n >>= 1;
             moveFactor <<= 1;
         }
         return m * moveFactor;
    }
  
    public static void main(String[] args) {
		no_201 test = new no_201();
		System.out.println(test.rangeBitwiseAnd(5, 7));
	}
}


//if(m == 0){
//    return 0;
//}
//int moveFactor = 1;
//while(m != n){
//    m >>= 1;
//    n >>= 1;
//    moveFactor <<= 1;
//}
//return m * moveFactor;